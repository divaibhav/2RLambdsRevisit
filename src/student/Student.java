/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Nov-20
 *  Time: 11:35 AM
 */
package student;

import java.util.Objects;

public class Student implements Comparable<Student>{

    private int rollNo;
    private String name;

    @Override
    public int compareTo(Student o) {
        if(this == o){
            return 0;
        }
        else{
            return this.rollNo - o.rollNo;
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getRollNo() == student.getRollNo() &&
                Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRollNo(), getName());
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
