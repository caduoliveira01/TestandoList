package entities;

public class Employee {
    private String name;
    private Integer id;
    private Double salary;

    public Employee(){
    }

    public Employee(Integer id,String name, Double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getid() {
        return id;
    }

    public void setid(Integer id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void IncreaseSalary(double percentage){
        salary += salary* percentage /100;
    }

    public String toString() {
        return id +", "+name+ ","+salary;
    }
}
