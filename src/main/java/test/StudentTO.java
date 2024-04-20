package test;

public class StudentTO {
    int matrNr;
    String firstName;
    String lastName;

    public StudentTO(int matrNr, String firstName, String lastName) {
        this.matrNr = matrNr;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getMatrNr() {
        return matrNr;
    }

    public void setMatrNr(int matrNr) {
        this.matrNr = matrNr;
    }

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
}
