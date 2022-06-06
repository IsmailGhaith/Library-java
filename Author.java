
package libraryproj;

public class Author extends Person {

    private int nuOfBooks;
    private String workPlace;
    private String email;

    public Author() {

    }

    public Author(int numOgBooks, String email, String workPlace) {
        this.nuOfBooks = numOgBooks;
        this.email = email;
        this.workPlace = workPlace;
    }

    public Author(int numOgBooks, String email, String workPlace, int id, String name, String gender, String phoneNumber, String address) {

        this.nuOfBooks = numOgBooks;
        this.email = email;
        this.workPlace = workPlace;
    }
//get

    public int getnofbks() {
        return nuOfBooks;
    }

    public String getmal() {
        return email;
    }

    public String getpwkps() {
        return workPlace;
    }
//set

    public void setnofbks(int numOgBooks) {
        this.nuOfBooks = numOgBooks;
    }

    public void setmal(String email) {
        this.email = email;
    }

    public void setpwkps(String workPlace) {
        this.workPlace = workPlace;
    }

    @Override
    public String toString() {
        String result = "";
        result = super.toString();
        result += "Email: " + this.email + "\n";
        result += "Work place: " + this.workPlace + "\n";
        result += "Number of Books: " + this.nuOfBooks + "\n";

        return result;

    }
}
