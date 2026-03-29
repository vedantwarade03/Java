class Book {
    String title;
    String author;
    String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN);
    }
}

class Library {
    Book[] books;
    int count;

    public Library(int size) {
        books = new Book[size];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
            System.out.println("Book added: " + book.title);
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void removeBookByISBN(String ISBN) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (books[i].ISBN.equals(ISBN)) {
                found = true;
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[count - 1] = null;
                count--;
                System.out.println("Book with ISBN " + ISBN + " removed.");
                break;
            }
        }
        if (!found) {
            System.out.println("Book with ISBN " + ISBN + " not found.");
        }
    }

    public void displayBooks() {
        if (count == 0) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books available in the library:");
            for (int i = 0; i < count; i++) {
                books[i].displayBook();
            }
        }
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        Library library = new Library(5);

        Book book1 = new Book("1984", "George Orwell", "ISBN001");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "ISBN002");
        Book book3 = new Book("Brave New World", "Aldous Huxley", "ISBN003");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();

        library.removeBookByISBN("ISBN002");

        library.displayBooks();
    }
}
