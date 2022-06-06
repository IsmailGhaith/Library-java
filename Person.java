
package libraryproj;


public class Person {

    private int id, phoneNumber;
    private String name;
    private String gender;
    private String address;

    public Person() {

    }

    public Person(int id, int phoneNumber, String name, String gender, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
//get

    public int getId() {
        return id;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }
//set

    public void setId(int id) {
        this.id = id;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        String result = "";
        result += "ID: " + this.id + "\n";
        result += "Phone: " + this.phoneNumber + "\n";
        result += "Name: " + this.name + "\n";
        result += "Gender: " + this.gender + "\n";
        result += "Address: " + this.address + "\n";

        return result;

    }

}
