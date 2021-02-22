package vn.edu.hou.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table  (name = "employee")
public class Employee {
    @Id
//    @Column (name= "id")
    private int id;
    //   @Column(name="name")
    private String name;
    //   @Column(name ="salary")
    private float salary;

    public Employee(){}
    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary= salary;
    }
    public void setId(int id){
        this.id= id;
    }
    public int getId(){
        return this.id;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
