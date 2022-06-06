package libraryproj;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;

public class Process {

    Scanner keyboard = new Scanner(System.in);
    ArrayList<book> books = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();

    public void start() {

        int choice = 0;
        do {
            try {
                printMenu();
                choice = keyboard.nextInt();

                switch (choice) {
                    case 1:
                        showBooks();
                        break;
                    case 2:
                        addBook();
                        break;
                    case 3:
                        deleteBook();
                        break;
                    case 4:
                        searchBook();
                        break;
                    case 5:
                        buyBook();
                        break;
                    case 6:
                        showStudents();
                        break;
                    case 7:
                        addStudent();
                        break;
                    case 8:
                        fullReport();
                        break;
                    case 9:
                        System.out.println("End program.");
                        System.exit(-1);
                        break;
                    default:
                        System.err.println("Invalid choice");
                }

            } catch (InputMismatchException exception) {
                System.out.println("Invalid choice, inter the right value ");
                keyboard.nextInt();

            }

        } while (choice != 9);

        System.out.println("End program.");

    }

    public void printMenu() {
        System.out.println("1- Show Books\n" + "2- Add a Book\n" + "3- Delete a Book\n" + "4- Search for a Book\n" + "5- Buy a Book\n" + "6- Show Students\n" + "7- Add a Student\n" + "8- Full Report\n"
                + "9- Exit\n" + "Enter your choice ..\n"
        );
    }

    public void showBooks() {

        if (books.isEmpty()) {
            System.out.println("no Books!");
        } else {
            for (int i = 0; i < books.size(); i++) {
                System.out.println(books.get(i).toString());
            }
        }

    }

    public void addBook() {

        try {
            book book = new book();
            Author author = new Author();

            System.out.println("Enter Book id: ");
            book.setid(keyboard.next());
            System.out.println("Enter Book Name: ");
            book.setName(keyboard.next());
            System.out.println("Enter Book Category: ");
            book.setCategory(keyboard.next());
            System.out.println("Enter Book Publisher: ");
            book.setPublisher(keyboard.next());
            System.out.println("Enter Book edition year: ");
            book.setYear(keyboard.nextInt());
            System.out.println("Enter Book quantity: ");
            book.setQuantity(keyboard.nextInt());
            System.out.println("Enter Book price: ");
            book.setPrice(keyboard.nextDouble());

            System.out.println("Enter the Author Info/");
            System.out.println("Enter Author id: ");
            author.setId(keyboard.nextInt());
            System.out.println("Enter Author name: ");
            author.setName(keyboard.next());
            System.out.println("Enter Author gender: ");
            author.setGender(keyboard.next());
            System.out.println("Enter Author phone: ");
            author.setPhoneNumber(keyboard.nextInt());
            System.out.println("Enter Author address: ");
            author.setAddress(keyboard.next());
            System.out.println("Enter Author number of books: ");
            author.setnofbks(keyboard.nextInt());
            System.out.println("Enter Author email: ");
            author.setmal(keyboard.next());
            System.out.println("Enter Author workplace: ");
            author.setpwkps(keyboard.next());
            book.setAutor(author);

            books.add(book);
            System.out.println("New Book added successfully!");
        } catch (InputMismatchException exception) {
            System.err.println("Invalid input.");
            keyboard.next();
            addBook();
        }
    }

    public void deleteBook() {
        try {
            System.out.println("Enter Book name: ");
            String name = keyboard.next();
            int index = getIndexOfBook(name, "");
            if (index == -1) {
                System.err.println("This Book does not exists");
            } else {
                books.remove(index);
                System.out.println("The '" + name + "' Book Deleted Successfully");
            }
        } catch (InputMismatchException exception) {
            System.err.println("Invalid input,try again");
            keyboard.next();
            deleteBook();
        }

    }

    private int getIndexOfBook(String name, String category) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getName().equalsIgnoreCase(name) || books.get(i).getCategory().equalsIgnoreCase(category)) {
                return i;
            }
        }
        return -1;
    }

    private int getIndexOfStudent(String id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getstudent_ID().equalsIgnoreCase(id)) {
                return i;
            }
        }
        return -1;
    }

    public void searchBook() {
        try {
            System.out.println("Enter Book name:");
            int index = getIndexOfBook(keyboard.next(), keyboard.next());
            if (index == -1) {
                System.out.println("Not Found!");
            } else {
                System.out.println(books.get(index).toString());
            }
        } catch (InputMismatchException exception) {
            System.err.println("Invalid input,try again");
            keyboard.next();
            searchBook();
        }
    }

    public void buyBook() {
        try {
            System.out.println("Enter Student ID: ");
            String studentId = keyboard.next();
            System.out.println("Enter Book name: ");
            String bookName = keyboard.next();

            int bookIndex = getIndexOfBook(bookName, "");
            int studentIndex = getIndexOfStudent(studentId);
            if (bookIndex == -1) {
                System.err.println("The book is not available");
            } else if (studentIndex == -1) {
                System.err.println("The Student is not available");
            } else {
                if (books.get(bookIndex).getQuantity() <= 0) {
                    System.err.println("Thire is no more copis from this book");
                } else if (books.get(bookIndex).getPrice() <= students.get(studentIndex).getBudget()) {
                    books.get(bookIndex).setQuantity(books.get(bookIndex).getQuantity() - 1);
                    students.get(studentIndex).setBudget(students.get(studentIndex).getBudget() - books.get(bookIndex).getPrice());
                    books.get(bookIndex).addStudent(students.get(studentIndex));
                    System.out.println("Purchased successfully");
                } else if (books.get(bookIndex).getPrice() > students.get(studentIndex).getBudget()) {
                    System.err.println("sorry!,the budget is not enough");
                }
            }
        } catch (InputMismatchException exception) {
            System.err.println("Invalid input,try again");
            keyboard.next();
            buyBook();
        }
    }

    public void showStudents() {
        if (students.isEmpty()) {
            System.out.println("Thire is no students!");
        } else {
            for (int i = 0; i < students.size(); i++) {
                System.out.println(students.get(i).toString());
            }
        }
    }

    public void addStudent() {
        try {
            Student student = new Student();
            System.out.println("Enter Student ID:");
            student.setstudent_ID(keyboard.next());
            System.out.println("Enter Student Name:");
            student.setName(keyboard.next());
            System.out.println("Enter Student Identity:");
            student.setId(keyboard.nextInt());
            System.out.println("Enter Student gender:");
            student.setGender(keyboard.next());
            System.out.println("Enter Student Phone:");
            student.setPhoneNumber(keyboard.nextInt());
            System.out.println("Enter Student Specialization:");
            student.setspecialization(keyboard.next());
            System.out.println("Enter Student Budget:");
            student.setBudget(keyboard.nextDouble());
            students.add(student);
            System.out.println("New Student added successfully");

        } catch (InputMismatchException exception) {
            System.err.println("Invalid input,try again");
            keyboard.next();
            addStudent();
        }

    }

    public void fullReport() {

        try {
            File myObj = new File("REPORT.dat");
            myObj.createNewFile();

            FileWriter myWriter = new FileWriter(myObj);
            myWriter.write("All Books: \n");
            if (books.isEmpty()) {
                myWriter.write("No Books!\n");

            } else {
                for (int i = 0; i < books.size(); i++) {
                    myWriter.write("\n" + books.get(i).toString());
                }

            }

            myWriter.write(" All Students: \n");
            if (students.isEmpty()) {
                myWriter.write("Thire is no students!");
            } else {
                for (int i = 0; i < students.size(); i++) {
                    myWriter.write(students.get(i).toString());
                }
            }

            myWriter.close();
            System.out.println("Report Created Successfully.");

        } catch (IOException e) {
            System.out.println("error!");
            e.printStackTrace();
        }

    }

}
