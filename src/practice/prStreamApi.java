package practice;

import src.PREDICATE_INTERFACE.A;
import src.PREDICATE_INTERFACE.Employee;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class prStreamApi {

    public static void main(String[] args) {
//        List<String>val= Arrays.asList("Abdul","Azhar","sajid","Asad");
//        List<String> collect = val.stream().filter(x ->x.startsWith("A")).map(x->x.toUpperCase()).collect(Collectors.toList());
//        System.out.println(collect);



//    List<Integer>val=Arrays.asList(1,2,2,3,3,4,4,5,6,6,7);
//        List<Integer> collect = val.stream().distinct().collect(Collectors.toList());
//        System.out.println(collect);
//
//
//    }
//List<String>val=Arrays.asList("abdul","sajid","ash","azh");
//        List<String> collect = val.stream().filter(x -> x.length() > 4).collect(Collectors.toList());
//        System.out.println(collect);
//
//    }

//List<String>val=Arrays.asList("catsir","catmam","sir","mam");
//        List<String> cat = val.stream().filter(x -> x.startsWith("cat")).collect(Collectors.toList());
//        System.out.println(cat);











//        List<Integer>val=Arrays.asList(1,3,5,2,7,4,6,8);
//        List<Integer> collect = val.stream().sorted().collect(Collectors.toList());
//        System.out.println(collect);

//     List<String>val=Arrays.asList("abdul","azhar","asif","amir","sajid","safu","sameer");
//
//        List<String> a = val.stream().filter(x -> x.startsWith("a")).sorted().collect(Collectors.toList());
//        System.out.println(a);


//   List<String>val=Arrays.asList("abdul","sajid","azhar");
//        List<Integer> collect = val.stream().map(x -> x.length()).collect(Collectors.toList());
//        System.out.println(collect);











//        List<Integer>val=Arrays.asList(5,6,8);
//        List<Integer> collect = val.stream().map(x -> x * x).collect(Collectors.toList());
//        System.out.println(collect);




//  List<String>val=Arrays.asList("mike","sam","ram");
//        List<String> collect = val.stream().map(x -> x.toUpperCase()).map(x -> new StringBuilder(x).reverse().toString()).collect(Collectors.toList());
//        System.out.println(collect);

//List<Integer>val=Arrays.asList(12,23,45,65,34);
//        Optional<Integer> max = val.stream().max(Integer::compare);
//        System.out.println(max.get());
//
//        List<Integer>val=Arrays.asList(22,34,12,21,65);
//        Optional<Integer> min = val.stream().min(Integer::compare);
//        System.out.println(min.get());



//        List<Integer>val=Arrays.asList(22,34,12,43,32,2,45);
//        Optional<Integer> min = val.stream().min(Integer::compareTo);
//        Optional<Integer> max = val.stream().max(Integer::compareTo);
//        System.out.println(max.get());
//        System.out.println(min.get());


//        List<String>val=Arrays.asList("Abdul","saji","irfannm","Abu");
//        Optional<String> max = val.stream().max((x, y) -> Integer.compare(x.length(), y.length()));
//        Optional<String> min = val.stream().min((x, y) -> Integer.compare(x.length(), y.length()));
//        System.out.println(max.get());
//        System.out.println(min.get());

//List<String>val=Arrays.asList("mike","stalkin","sam");
//        Optional<String> min = val.stream().min((x, y) -> Integer.compare(x.length(), y.length()));
//        Optional<String> max = val.stream().max((x, y) -> Integer.compare(x.length(), y.length()));
//        System.out.println(max.get());
//        System.out.println(min.get());




//List<String>val=Arrays.asList("mike","basha","khursheed");
//        Optional<String> max = val.stream().max((x, y) -> Integer.compare(x.length(), y.length()));
//        System.out.println(max.get());


//        List<String>val= Arrays.asList("mike","stallin","sam");
//        Optional<String> max = val.stream().max((x, y) -> Integer.compare(x.length(), y.length()));
//        Optional<String> min = val.stream().min((x, y) -> Integer.compare(x.length(), y.length()));
//        System.out.println(max.get());
//        System.out.println(min.get());

//       List<Employee>val=Arrays.asList(new Employee(1,"abdul",7000),new Employee(2,"basha",8000));
//        Optional<Employee> max = val.stream().max((x, y) -> Integer.compare(x.getSalary(), y.getSalary()));
//        Employee employee = max.get();
//        System.out.println(employee.getId());
//        System.out.println(employee.getName());

//List<Integer>val=Arrays.asList(23,22,34,23);
//        Optional<Integer> max = val.stream().max(Integer::compare);
//        System.out.println(max.get());



//        List<Integer>val=Arrays.asList(23,333,12,1);
//        Optional<Integer> min = val.stream().min(Integer::compare);
//        System.out.println(min.get());

//    List<Employee>val=Arrays.asList(new Employee(1,"Abdul",4000)
//    ,new Employee(2,"basha",7888),new Employee(3,"baba",9000));
//        Optional<Employee> max = val.stream().max((x, y) -> Integer.compare(x.getSalary(), y.getSalary()));
//        Employee employee = max.get();
//        System.out.println(employee.getName());
//        System.out.println(employee.getId());


//
//        List<Employee>val=Arrays.asList(new Employee(1,"abdul",1700),
//                new Employee(2,"basha",4000),new Employee(3,"baba",1700));
//        Map<Integer, List<Employee>> collect = val.stream().collect(Collectors.groupingBy(Employee::getSalary));
//        System.out.println(collect);

//        Consumer<Integer>val=x-> System.out.println(x);
//        val.accept(40);

//List<String>val=Arrays.asList("mike","sam","stallin");
//val.forEach(x-> System.out.println(x));

//
//List<String>val=Arrays.asList("abdul","basha","mike");
//val.stream().map(x->x.toUpperCase()).forEach(x-> System.out.println(x));


//List<String>val=Arrays.asList("mike","abdul","basha");
//val.stream().map(x->x.toUpperCase()).forEach(x-> System.out.println(x));

//List<String>val=Arrays.asList("mike","basha","khursheed");
//val.stream().map(String::toUpperCase).forEach( System.out::println);


//        List<String>val=Arrays.asList("mike","basha","baba");
//val.stream().map(String::toUpperCase).forEach(System.out::println);

//List<String>val=Arrays.asList("mike","basha","abdul");
//val.stream().map(String::toUpperCase).forEach(System.out::println);

//List<String>val=Arrays.asList("mike","basha","baba");
//val.stream().map(String::toUpperCase).forEach(System.out::println);

//List<String>val=Arrays.asList("mike","stalline","basha");
//val.stream().map(String::toUpperCase).forEach(System.out::println);

//
//        List<String>val=Arrays.asList("mikr","basga","khursheed");
//        val.stream().map(x->x.toUpperCase()).forEach(x->System.out.println(x));

//List<String>val=Arrays.asList("mike","basha","baba")
//        ;
//val.stream().map(x->x.toUpperCase()).forEach(x-> System.out.println(x));
//
//        List<String>val=Arrays.asList("abdul","basha","saj");
//        val.stream().map(x->x.toUpperCase()).forEach(x-> System.out.println(x));


//        List<String>val=Arrays.asList("mike","stallin","sam");
//        val.stream().map(x->x.toUpperCase()).forEach(x-> System.out.println(x));

//
//        List<String>val=Arrays.asList("mike","stallin","sam");
//        val.stream().map(x->x.toUpperCase()).forEach(x-> System.out.println(x));


//        List<String>val=Arrays.asList("mike","sam","tom");
//        val.stream().map(x->x.toUpperCase()).forEach(x-> System.out.println(x));

//List<String>val=Arrays.asList("mike","basha","sam");
//val.stream().map(x->x.toUpperCase()).forEach(x-> System.out.println(x));

//        List<Integer>val=Arrays.asList(12,23,34,34,56,87,177);
//        List<Integer> collect = val.stream().filter(x -> x > 50).collect(Collectors.toList());
//        System.out.println(collect);

//        List<String>a=Arrays.asList("a", "b", "c", "d", "e");
//                a.stream().forEach(x -> System.out.println(x));
//        List<String>l=Arrays.asList("apple","orange","amrood","aam");
//        List<String> a = l.stream().filter(x -> x.startsWith("a")).collect(Collectors.toList());
//    a.forEach(x-> System.out.println(x));
        List<String>a=Arrays.asList("a", "b", "c", "d", "e", "f");
        List<String> collect = a.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        System.out.println(collect);


    }}
