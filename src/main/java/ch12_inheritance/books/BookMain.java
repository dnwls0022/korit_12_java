package ch12_inheritance.books;

public class BookMain {
    public static void main(String[] args) {
        EBook book2 = new EBook("어린왕자","우진",54, "PDF");
        System.out.println("제목 :" +book2.getTitle() + "\n"+ "저자 :"+book2.getAuthor() + "\n"
                + "파일 크기 :" +book2.getFileSize() + "\n" + "파일 형식 :" + book2.getFormat());

        Book book1 = new Book("자바의 정석","남궁성" );
        System.out.println("이 책의 제목은 "+book1.getTitle()+"입니다.\n"
                              + "이 책의 저자는 "+book1.getAuthor()+"입니다.");

        System.out.println("제목 : "+book1.getTitle()+"\n"
                + "저자 : "+book1.getAuthor());



















    }
}
