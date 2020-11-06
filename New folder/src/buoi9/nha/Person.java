package buoi9.nha;

public abstract class Person {
    private String name;
    private String address;
    private String departmen;
    public Person(String name,String address,String departmen){
        this.address=address;
        this.name=name;
        this.departmen=departmen;
    }

    public Person() {

    }

    public abstract void xuat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartmen() {
        return departmen;
    }

    public void setDepartmen(String departmen) {
        this.departmen = departmen;
    }
}
