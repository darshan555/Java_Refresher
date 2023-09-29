class Library{
    String[] books;
    int noOfBooks;
    Library(){
        this.books = new String[100];
        this.noOfBooks = 0;
    }
    void addBooks(String books){
        this.books[noOfBooks] = books;
        noOfBooks++;
        System.out.println("Your books has been Added.");
    }
    void showAvailBooks(){
        System.out.println("Your Available books are:");
        for (String book :
                books) {
            if(book == null){
                continue;
            }else {
                System.out.println("* "+book);
            }
        }
    }
    void returnBooks(String book){
        addBooks(book);
    }
    void issueBook(String book){
        for (int i=0;i<this.books.length;i++){
            if(this.books[i].equals(book)){
                System.out.println("Your book successfully issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");

    }
}
public class Q42_LibraryExercise {
    public static void main(String[] args) {
        Library L1 = new Library();
        L1.addBooks("C++");
        L1.addBooks("Java");
        L1.addBooks("Python");
        L1.showAvailBooks();
        L1.issueBook("C++");
        L1.showAvailBooks();
        L1.returnBooks("C++");
        L1.showAvailBooks();
    }
}
