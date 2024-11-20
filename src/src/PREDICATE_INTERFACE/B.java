package src.PREDICATE_INTERFACE;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B {
    public static void main(String[] args) {
//        List<Integer>arr= Arrays.asList(10,29,22,34,12,21,53,11);
//        List<Integer> newlist = arr.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
//        System.out.println(newlist);


//        List<Integer>arr=Arrays.asList(22,223,12,44,41,54,12);
//        List<Integer> collect = arr.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
//        System.out.println(collect);





//      List<Integer>arr=Arrays.asList(22,33,22,223,665,23,12);
//        List<Integer> newlist = arr.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
//        System.out.println(newlist);



//        List<Integer>arr=Arrays.asList(22,34,21,21,54,34,57,89);
//        List<Integer> collect = arr.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
//        System.out.println(collect);
//
//        List<Integer>arr=Arrays.asList(23,12,21,34,46,23);
//        List<Integer> collect = arr.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
//        System.out.println(collect);
//

//        List<Integer>arr=Arrays.asList(21,23,24,12,34,42,12,21,23);
//        List<Integer> collect = arr.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
//        System.out.println(collect);
//List<Integer>ar=Arrays.asList(12,34,12,23,34,45,44,42);
//        List<Integer> collect = ar.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
//        System.out.println(collect);

//        List<String>ar=Arrays.asList("mike","man","wayank","tanoj");
//        List<String> m = ar.stream().filter(x -> x.startsWith("m")).collect(Collectors.toList());
//        System.out.println(m);
//List<String>ar=Arrays.asList("abdul","amir","saj","azhar");
//        List<String> a = ar.stream().filter(x -> x.startsWith("a")).collect(Collectors.toList());
//        System.out.println(a);





//        List<String>ar=Arrays.asList("mike","mike","mike","abdul","saj");
//        List<String> mike = ar.stream().filter(x -> x.length()>4).collect(Collectors.toList());
//        System.out.println(mike);
List<String>ar=Arrays.asList("mikes","mikes","abdul","mike","saj");
        List<String> collect = ar.stream().filter(x -> x.length() > 4).collect(Collectors.toList());
        System.out.println(collect);


    }
}
