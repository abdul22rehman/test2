package src.fUNCTION_FUNTIONAL_INTERFACE;

import src.PREDICATE_INTERFACE.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class withStreamAPI {
    public static void main(String[] args) {
//        List<Integer>val= Arrays.asList(10,23,24,12,34);
//        List<Integer> collect = val.stream().map(x -> x * x).collect(Collectors.toList());
//        System.out.println(collect);



//
//        List<Integer> val = Arrays.asList(12,23,23,44,2,33,23);
//        List<Integer> collect = val.stream().map(x -> x * x).collect(Collectors.toList());
//        System.out.println(collect);




//        List<Integer> val = Arrays.asList(12,23,23,34,32,34);
//        List<Integer> collect = val.stream().map(x -> x * x).collect(Collectors.toList());
//        System.out.println(collect);

//        List<String>arr=Arrays.asList("mike","Stallin","adam");
//        List<String> collect = arr.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
//        System.out.println(collect);

//        List<String>arr=Arrays.asList("mike","Stallin","adam");
//        List<String> collect = arr.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
//        System.out.println(collect);


//        List<String>arr=Arrays.asList("mike","Stallin","abdul");
//        List<String> collect = arr.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
//        System.out.println(collect);

//List<Employee>arr=Arrays.asList(new Employee(1,"abdul",6000),new Employee(2,"saj",8000),new Employee(3,"kh",2000));
//        List<Integer> collect = arr.stream().map(x -> (x.getSalary() * 10) ).collect(Collectors.toList());
//        System.out.println(collect);

//        List<Employee>arr=Arrays.asList(new Employee(1,"abdul",6000),new Employee(2,"saj",8000 ),new Employee(3,"kh",2000));
//        List<Integer> collect = arr.stream().map(x -> (x.getSalary() * 10)).collect(Collectors.toList());
//        System.out.println(collect);

//  List<Employee> arr=Arrays.asList(new Employee(1,"abdul",6000),new Employee(2,"saj",5000),new Employee(3,"kh",5500)) ;
//        List<Integer> collect = arr.stream().map(x -> x.getSalary() * 10).collect(Collectors.toList());
//        System.out.println(collect);

//      List<Integer>val=Arrays.asList(12,12,13,14,14,13,22,22,24,24);
//        List<Integer> collect = val.stream().distinct().collect(Collectors.toList());
//        System.out.println(collect);

//  List<Integer>val=Arrays.asList(12,12,13,13,14,14);
//        long collect = val.stream().count();
//        System.out.println(collect);

        List<Employee>val=Arrays.asList(new Employee(1,"John",5000),
                new Employee(2,"adam",6000));
        List<Integer> collect = val.stream().map(Employee::getSalary).collect(Collectors.toList());
        System.out.println(collect);


    }
}
