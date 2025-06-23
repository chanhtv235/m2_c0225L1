package mvc.entity;

public class Instructor extends Person {
    private float salary;

    public Instructor() {
    }

    public Instructor(long code, String name, String address, float salary) {
        super(code, name, address);
        this.salary = salary;
    }

    @Override
    public String getInfoToCSV() {
        return this.getCode()+","+this.getName()+","+this.getAddress()+","+this.salary;
    }

    @Override
    public String toString() {
        return "Instructor{" + super.toString()+
                "salary=" + salary +
                '}';
    }
}
