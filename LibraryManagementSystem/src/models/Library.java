package models;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Student> students;

    public Library() {
        books = new ArrayList<>();
        students = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book '" + book.getTitle() + "' added successfully.");
    }

    public void removeBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                books.remove(book);
                System.out.println("Book '" + book.getTitle() + "' removed successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student '" + student.getName() + "' added successfully.");
    }

    public void removeStudent(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                students.remove(student);
                System.out.println("Student '" + student.getName() + "' removed successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void issueBook(int bookId, int studentId) {
        for (Book book : books) {
            if (book.getBookId() == bookId && !book.isIssued()) {
                for (Student student : students) {
                    if (student.getStudentId() == studentId) {
                        book.setIssued(true);
                        System.out.println("Book '" + book.getTitle() + "' issued to '" + student.getName() + "'.");
                        return;
                    }
                }
            }
        }
        System.out.println("Book not available or student not found.");
    }

    public void returnBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId && book.isIssued()) {
                book.setIssued(false);
                System.out.println("Book '" + book.getTitle() + "' returned successfully.");
                return;
            }
        }
        System.out.println("Book not found in issued records.");
    }

    public void checkAvailableBooks() {
        System.out.println("\nAvailable Books:");
        for (Book book : books) {
            if (!book.isIssued()) {
                System.out.println(book);
            }
        }
        System.out.println();
    }
}
