package oops;

public class Encapsulation {
    /*
    Encapsulation is considered data hiding
        When we don't want to allow the user(other people) to change the state/variables of a class.

        It consists of Getters & Setters
         */

    private String firstName = "Furqan";
    private String lastName = "Javed";
    private int age = 38;
    private long SSN = 123456789;
    private String address = "632 Westport Blvd, Salina, KS 67401";

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSSN() {
        return SSN;
    }

    public void setSSN(long SSN) {
        this.SSN = SSN;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
 /*
    //GETTER:
    public String getFirstName(){
        return firstName;
    }

    //SETTER:
    public void setFirstName (String firstName){
        this.firstName = firstName;
    }
*/

