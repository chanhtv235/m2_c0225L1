package mvc.entity;

import java.io.Serializable;

public class Student extends Person{
    private float point;
    private String className;

    public Student() {
    }

    @Override
    public String getInfoToCSV() {
        return this.getCode()+"," + this.getName()
                + ","+this.getAddress()+","+this.getPoint()+","+this.getClassName() ;
    }

    public Student(long code, String name, String address, float point, String className) {
        super(code, name, address);
        this.point = point;
        this.className = className;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                 super.toString()+
                "point=" + point +
                ", className='" + className + '\'' +
                '}';
    }
}
