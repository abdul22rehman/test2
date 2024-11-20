package src.PREDICATE_INTERFACE;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class D {
    public static void main(String[] args) {
//        List<Employee>ar= Arrays.asList(new Employee(1,"mike",6000)
//                ,new Employee(2,"saj",20000)
//                ,new Employee(3,"azh",4000)
//        );
//        List<Employee> newlist = ar.stream().filter(x -> x.getSalary()>5000).collect(Collectors.toList());
//
//        for (Employee emp :newlist){
//            System.out.println(emp.getId());
//            System.out.println(emp.getName());
//            System.out.println(emp.getSalary());
//        }

//        List<Employee>ar=Arrays.asList(new Employee(1,"khursheed",8000),new Employee(2,"azhar",4000),new Employee(3,"sajid",7000));
//        List<Employee> N = ar.stream().filter(x -> x.getSalary() > 5000).collect(Collectors.toList());
//
//        for (Employee z:N){
//            System.out.println(z.getId());
//            System.out.println(z.getName());
//            System.out.println(z.getSalary());
//        }







//
//  List<Employee>ar=Arrays.asList(new Employee(1,"sajid",8000),new Employee(2,"abdul",3000),new Employee(3,"khursheed",9000));
//        List<Employee> n = ar.stream().filter(x -> x.getSalary() > 5000).collect(Collectors.toList());
//        for (Employee z:n){
//            System.out.println(z.getId());
//            System.out.println(z.getSalary());
//            System.out.println(z.getName());
//        }

List<Employee>ar=Arrays.asList(new Employee(3,"khurshees",9000),new Employee(3,"khurram",4000));
        List<Employee> N = ar.stream().filter(x -> x.getSalary() > 5000).collect(Collectors.toList());
        for (Employee z:N){
            System.out.println(z.getId());
            System.out.println(z.getSalary());
            System.out.println(z.getName());
        }


    }
}
