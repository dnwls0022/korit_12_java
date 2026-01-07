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

    //북클래스의 쇼인포 메서드를 오버라이드하여 추가부분만 재정의
    public void showInfo(){
        super.showInfo();  //괄호 유무. .이 찍혀있는지
        System.out.println("제목"+ getTitle() +"MB");
        System.out.println("저자"+ getAuthor() +"PDF");
        System.out.println("파일크기"+ fileSize+ 5.2);
        System.out.println("파일형식"+ format+"EPUB");
    }
}
