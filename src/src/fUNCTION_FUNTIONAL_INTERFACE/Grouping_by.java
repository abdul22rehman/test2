package src.fUNCTION_FUNTIONAL_INTERFACE;

import src.PREDICATE_INTERFACE.A;
import src.PREDICATE_INTERFACE.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping_by {
    public static void main(String[] args) {
        List<Employee>arr= Arrays.asList(new Employee(1,"abdul",10000)
        ,new Employee(2,"saj",10000),new Employee(3,"sam",7000));
//        Map<Integer, List<Employee>> collect = val.stream().collect(Collectors.groupingBy(Employee::getSalary));
//        System.out.println(collect);

//        Map<Integer, List<Employee>> collect = arr.stream().collect(Collectors.groupingBy(Employee::getSalary));
//        System.out.println(collect);


//        Map<Integer, List<Employee>> collect = arr.stream().collect(Collectors.groupingBy(Employee::getSalary));
//        System.out.println(collect);

//        Map<Integer, List<Employee>> collect = arr.stream().collect(Collectors.groupingBy(Employee::getSalary));
//        System.out.println(collect);

//        Map<Integer, List<Employee>> collect = arr.stream().collect(Collectors.groupingBy(Employee::getSalary));
//        System.out.println(collect);

//        Map<Integer, List<Employee>> collect = arr.stream().collect(Collectors.groupingBy(Employee::getSalary));
//        System.out.println(collect);

//
//        Map<Integer, List<Employee>> collect = arr.stream().collect(Collectors.groupingBy(Employee::getSalary));
//        System.out.println(collect);


//        Map<Integer, List<Employee>> collect = arr.stream().collect(Collectors.groupingBy(Employee::getSalary));
//        System.out.println(collect);


//        Map<Integer, List<Employee>> collect = arr.stream().collect(Collectors.groupingBy(Employee::getSalary));
//        System.out.println(collect);
//        Map<Integer, List<Employee>> collect = arr.stream().collect(Collectors.groupingBy(Employee::getSalary));
//        System.out.println(collect);

//        Map<Integer, List<Employee>> collect = arr.stream().collect(Collectors.groupingBy(Employee::getSalary));
//        System.out.println(collect);


//        Map<Integer, List<Employee>> collect = arr.stream().collect(Collectors.groupingBy(Employee::getSalary));
//        System.out.println(collect);

//        Map<Integer, List<Employee>> collect = arr.stream().collect(Collectors.groupingBy(Employee::getSalary));
//        System.out.println(collect);


//        Map<Integer, List<Employee>> collect = arr.stream().collect(Collectors.groupingBy(Employee::getSalary));
//        System.out.println(collect);

//        Map<Integer, List<Employee>> collect = arr.stream().collect(Collectors.groupingBy(Employee::getSalary));
//        System.out.println(collect);

//        Map<Integer, List<Employee>> collect = arr.stream().collect(Collectors.groupingBy(Employee::getSalary));
//        System.out.println(collect);

//        Map<Integer, List<Employee>> collect = arr.stream().collect(Collectors.groupingBy(Employee::getSalary));
//        System.out.println(collect);


//        Map<Integer, List<Employee>> collect = arr.stream().collect(Collectors.groupingBy(Employee::getSalary));
//        System.out.println(collect);


//        Map<Integer, List<Employee>> collect = arr.stream().collect(Collectors.groupingBy(Employee::getSalary));
//        System.out.println(collect);

//        Map<Integer, List<Employee>> collect = arr.stream().collect(Collectors.groupingBy(Employee::getSalary));
//        System.out.println(collect);
//        List<String> fruits = Arrays.asList("Apple", "Banana", "Apricot", "Blueberry","mango","mausmi");
//
//        Map<Character, List<String>> groupedFruits = fruits.stream()
//                .collect(Collectors.groupingBy(fruit -> fruit.charAt(0)));
//
//        groupedFruits.forEach((key, value) ->
//                System.out.println(key + ": " + value));
        // Output: A: [Apple, Apricot]
        //          B: [Banana, Blueberry]
//                List<String>fruit=Arrays.asList("apple","apricot","Banana","Blueberry");
//        Map<Character, List<String>> collect = fruit.stream().collect(Collectors.groupingBy(x -> x.charAt(0)));
//        collect.forEach((key,value)->System.out.println(key+" :"+value));


//        List<String>fruit=Arrays.asList("apple","aprocot","Banana","Blueberry");
//        Map<Character, List<String>> collect = fruit.stream().collect(Collectors.groupingBy(x -> x.charAt(0)));
//        collect.forEach((x,y)-> System.out.println(x+":"+y));

       List<String>fruit=Arrays.asList("Amla","Apple","Banana","Blueberry");
        Map<Character, List<String>> collect = fruit.stream().collect(Collectors.groupingBy(x -> x.charAt(0)));
        collect.forEach((x,y)-> System.out.println(x+":"+y));


    }}
