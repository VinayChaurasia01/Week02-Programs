class Book{
    private static String libraryName = "Success library";

    private final String ISBN;
    private String title;
    private String author;

    Book(String ISBN , String title , String author){
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public static void displayLibraryName(){
        System.out.println("Library name is : " + libraryName);
    }

    public void printBookDetails(){
        System.out.println("ISBN : " + ISBN);
        System.out.println("Title : " + title );
        System.out.println("Author : " + author);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book.displayLibraryName();
        System.out.println();

        Book book1 = new Book("1234567890123" , "Marvel comics" , "Stan lee");
        if(book1 instanceof Book){
            book1.printBookDetails();
        }else{
            System.out.println("Book1 is not instance of Book class");
        }

        System.out.println();
        Book book2 = new Book("1234567890987" , "Pirates of the Caribbean" , "Jerry Bruckheimer");
        if(book2 instanceof Book){
            book2.printBookDetails();
        }else{
            System.out.println("Book2 is not instance of Book class");
        }
    }
}
