import models.Book;
import models.Student;
import models.Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Add Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Check Available Books");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(bookId, title, author));
                    break;

                case 2:
                    System.out.print("Enter book ID to remove: ");
                    bookId = scanner.nextInt();
                    library.removeBook(bookId);
                    break;

                case 3:
                    System.out.print("Enter student ID: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    library.addStudent(new Student(studentId, name));
                    break;

                case 4:
                    System.out.print("Enter student ID to remove: ");
                    studentId = scanner.nextInt();
                    library.removeStudent(studentId);
                    break;

                case 5:
                    System.out.print("Enter book ID to issue: ");
                    bookId = scanner.nextInt();
                    System.out.print("Enter student ID: ");
                    studentId = scanner.nextInt();
                    library.issueBook(bookId, studentId);
                    break;

                case 6:
                    System.out.print("Enter book ID to return: ");
                    bookId = scanner.nextInt();
                    library.returnBook(bookId);
                    break;

                case 7:
                    library.checkAvailableBooks();
                    break;

                case 8:
                    System.out.println("Exiting Library Management System. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
