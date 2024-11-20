package src.fUNCTION_FUNTIONAL_INTERFACE;

import src.PREDICATE_INTERFACE.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;



public class Reference_method {
    public static void main(String[] args) {
//        List<Integer>arr= Arrays.asList(12,23,23,12,45,65);
//        Optional<Integer> max = arr.stream().max(Integer::compareTo);
//        Integer i = max.get();
//        System.out.println(i);


//     List<Integer>arr=Arrays.asList(12,23,43,45,23,45,11);
//        Optional<Integer> min = arr.stream().min(Integer::compareTo);
//        Integer i = min.get();
//        System.out.println(i);

//  List<Integer>arr=Arrays.asList(12,12,34,35,56,37);
//        Optional<Integer> min = arr.stream().min(Integer::compareTo);
//        System.out.println(min.get());



//        List<Integer>arr=Arrays.asList(23,34,12,45,23);
//        Optional<Integer> max = arr.stream().max(Integer::compareTo);
//        System.out.println(max.get());



//     List<Employee>arr=Arrays.asList(new Employee(1,"abdul",5000),
//             new Employee(2,"saj",7000),
//             new Employee(3,"mike",9000));
//
//        Optional<Employee> min = arr.stream().max((x1, x2) -> Integer.compare(x1.getSalary(), x2.getSalary()));
//        Employee employee = min.get();
//        System.out.println(employee.getId());
//        System.out.println(employee.getName());

//  List<Employee>arr=Arrays.asList(new Employee(1,"abdul",4000),new Employee(2,"saj",8000));
//        Optional<Employee> max = arr.stream().max((x1, x2) -> Integer.compare(x1.getSalary(), x2.getSalary()));
//        Employee employee = max.get();
//        System.out.println(employee.getId());
//        System.out.println(employee.getName());

List<Employee>arr=Arrays.asList(new Employee(1,"abdul",8000),new Employee(2,"sam",7700));
//      Optional<Employee> max = arr.stream().max((x, y) -> Integer.compare(x.getSalary(), x.getSalary()));
//
//        Employee employee = max.get();
//        System.out.println(employee.getId());
//        System.out.println(employee.getName());

//
//        Optional<Employee> max = arr.stream().max((x, y) -> Integer.compare(x.getSalary(), y.getSalary()));
//        Employee employee = max.get();
//        System.out.println(employee.getId());
//        System.out.println(employee.getName());


        Optional<Employee> max = arr.stream().max((x, y) -> Integer.compare(x.getSalary(), y.getSalary()));
        Employee employee = max.get();
        System.out.println(employee.getId());
        System.out.println(employee.getName());


    }

}
