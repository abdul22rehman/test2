package src.PREDICATE_INTERFACE;

public class Employee {
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

   

    public Employee( int id, String name,int salary) {
        this.id = id;
        this.name = name;

        this.salary = salary;
    }

    private int id;
    private String name;

    private int salary;



}
