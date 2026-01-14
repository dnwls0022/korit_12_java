package ch20_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

@AllArgsConstructor
@Data
class Book {
    private  Long bookId;
    private  String title;
    private  String author;
    private  List<String>  categories;

}

public class JSON3Task {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Book book1 =new Book(101L, "자바 마스터","안선생",List.of("프로그래밍", "컴퓨터공학"));


        String jsonStr = gson.toJson(book1);
        System.out.println(jsonStr);


        Map<String, Objects> title =gson.fromJson(jsonStr, Map.class);
        System.out.println(title);
        System.out.println("도서제목 : " +title.get("title"));

        //리스트 -> json배열변환

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(new Book(102L,"파이썬입문","김철수",List.of("프로그래밍" ,"데이터분석") ));

        String booksString = gson.toJson(books);
        System.out.println(booksString);




    }
}
