package Dia14.Sala;

public class Student {
    private int ID;
    private String name;
    private String city;

    public Student() {}

    public Student(int ID, String name, String city) {
        this.ID = ID;
        this.name = name;
        this.city = city;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
