
package libraryproj;

import java.util.ArrayList;

public class book {

    private String id, publisher;
    private String name;
    private String category;
    private Author author;
    private int quantity, edition_year;
    private double price;
    private ArrayList<Student> students = new ArrayList<>();

    public book() {

    }

    public book(String isbn, String name, String category, String publisher, int edition_year, Author author, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.publisher = publisher;
        this.edition_year = edition_year;
        this.author = author;
        this.quantity = quantity;
        this.price = price;
    }

    //get
    public String getid() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return edition_year;
    }

    public Author getAutor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
//set

    public void setid(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYear(int edition_year) {
        this.edition_year = edition_year;
    }

    public void setAutor(Author author) {
        this.author = author;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {

        String studentsNames = "";
        if (this.students.isEmpty()) {
            studentsNames = "There is no students who purchased this book\n";
        } else {
            for (int i = 0; i < this.students.size(); i++) {
                studentsNames += this.students.get(i).toString();
            }
        }

        String result = "";
        result += "ISBN: " + this.id + "\n";
        result += "Name: " + this.name + "\n";
        result += "Category: " + this.category + "\n";
        result += "Publisher: " + this.publisher + "\n";
        result += "Year: " + this.edition_year + "\n";
        result += "Quantity: " + this.quantity + "\n";
        result += "Price: " + this.price + "\n";
        result += "Author Info: \n" + this.author.toString() + "\n";
        result += studentsNames;

        return result;

    }
}
