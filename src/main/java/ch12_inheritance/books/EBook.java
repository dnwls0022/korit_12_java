package ch12_inheritance.books;

public class EBook extends Book {
    private double fileSize;
    private String format;

    public EBook(String title, String author, double fileSize, String format) {
        super(title, author);
        this.fileSize = fileSize;
        this.format = format;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
    public void showInfo(){
        System.out.println("제목"+ getTitle() +"MB");
        System.out.println("저자"+ getAuthor() +"PDF");
        System.out.println("파일크기"+ fileSize+ 5.2);
        System.out.println("파일형식"+ format+"EPUB");
    }
}
