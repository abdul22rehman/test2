package practice;

import java.util.*;
import java.util.stream.Collectors;

public class Chatgpt {
    public static void main(String[] args) {

        //1 question
//        List<String>l= Arrays.asList("apple", "orange", "mango");
//        List collect = l.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
//        System.out.println(collect);
//        collect.forEach(x -> System.out.println(x));

//2
//   List<Integer>l= Arrays.asList(1,2,3,22,5,45,34,32);
//   l.stream().filter(x->x%2==0).forEach(x -> System.out.println(x));

        //3

//        List<String> names = Arrays.asList("John", "Emily", "Alexandra", "Michael", "Chris");
////        Optional<String> first = names.stream().map(x -> x.length() > 5).findFirst();
//        Optional<String> result = names.stream()
//                .filter(name -> name.length() > 5)
//                .findFirst();
//        System.out.println(result.orElse("no match"));
//        List<String> names = Arrays.asList("John", "Emily", "Alexandra", "Michael", "Chris");
//        Optional<String> Z = names.stream().filter(x -> x.length() > 5).findFirst();
//        System.out.println(Z.orElse("no match"));


//        List<Integer> numbers = Arrays.asList(3, 5, 7, 9, 11);
//        int sum = numbers.stream()
//                .mapToInt(Integer::intValue)
//                .sum();
//        System.out.println(sum); // Output: 35

//        int sum = numbers.stream().mapToInt(x -> x.intValue()).sum();
//        System.out.println(sum);
//        int sum = numbers.stream().mapToInt(x -> x.intValue()).sum();
//        System.out.println(sum);
//        int sum = numbers.stream().mapToInt(x -> x.intValue()).sum();
//        System.out.println(sum);
//           7
//        List<Integer> num = Arrays.asList(12, 4, 8, 19, 33, 7);
//        Optional<Integer> max = num.stream().max(Integer::compareTo);
//        Optional<Integer> min = num.stream().min(Integer::compareTo);
//        System.out.println(max.get());
//        System.out.println(min.get());


        //    8     Convert a List of Strings to a Single String
//        List<String> words = Arrays.asList("apple", "banana", "cherry");
//        String result = words.stream()
//                .collect(Collectors.joining(" "));
//        System.out.println(result); // Output: "apple, banana, cherry"
//        String collect = words.stream().collect(Collectors.joining(" "));
//        System.out.println(collect);
//        String collect = words.stream().collect(Collectors.joining(" "));
//        System.out.println(collect);


        //     8 Count the Number of Strings that Start with a Specific Letter


        List<String> names = Arrays.asList("Alice", "Bob", "Andrew", "Ann", "Albert", "Charlie","Apple");
//        long count = names.stream()
//                .filter(name -> name.startsWith("A"))
//                .count();
//        System.out.println(count); // Output: 4
//        long a = names.stream().filter(x -> x.startsWith("A")).count();
//        System.out.println(a);

      //  9. Find All Unique Squares of Numbers
       // List<Integer> numbers = Arrays.asList(2, 3, 4, 2, 3);
//        List<Integer> uniqueSquares = numbers.stream()
//                .map(n -> n * n)
//                .distinct()
//                .collect(Collectors.toList());
//        System.out.println(uniqueSquares); // Output: [4, 9, 16]




     // Sort a List of Strings Alphabetically
//List<String> names = Arrays.asList("John", "Emily", "Alex", "Chris", "Brian");
//List<String> sortedNames = names.stream()
//                                .sorted()
//                                .collect(Collectors.toList());
//System.out.println(sortedNames); // Output: [Alex, Brian, Chris, Emily, John]


//        List<String> name= Arrays.asList("John", "Emily", "Alex", "Chris", "Brian");
//        List<String> collect = name.stream().sorted().collect(Collectors.toList());
//        collect.forEach(x-> System.out.println(x));

 //       10. Group Strings by Their First Character

//        List<String> nam = Arrays.asList("John", "Jane", "Jake", "James", "Alice", "Amanda");
//        Map<Character, List<String>> groupedByFirstChar = names.stream()
//                .collect(Collectors.groupingBy(name -> name.charAt(0)));
//        System.out.println(groupedByFirstChar);
// Output: {A=[Alice, Amanda], J=[John, Jane, Jake, James]}
//        List<String> nam = Arrays.asList("John", "Jane", "apple","Jake", "James", "Alice", "Amanda");
//        Map<Character, List<String>> collect = nam.stream().collect(Collectors.groupingBy(x -> x.charAt(0)));
//        System.out.println(collect);



//     11  ->Calculate the Average of a List of Integers

        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);
//        double average = numbers.stream()
//                .mapToInt(Integer::intValue)
//                .average()
//               .orElse(0);
//        System.out.println(average); // Output: 15.0

//        double v = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
//        System.out.println(v);

     //   12. Find if Any String in a List Matches a Specific Condition

//        List<String> words = Arrays.asList("apple", "banana", "cherry", "watermelon");
//        boolean hasLongString = words.stream()
//                .anyMatch(word -> word.length() > 8);
//        System.out.println(hasLongString); // Output: true
//        List<String> words = Arrays.asList("apple", "banana", "cherry", "watermelon");
//        boolean b = words.stream().anyMatch(x -> x.length() > 8);
//        System.out.println(b);




        //13. Skip the First Few Elements of a List
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        List<Integer> skippedNumbers = numbers.stream()
//                .skip(3)
//                .collect(Collectors.toList());
//        System.out.println(skippedNumbers); // Output: [4, 5, 6, 7, 8, 9]


//        List<Integer> num= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        List<Integer> collect = num.stream().skip(4).collect(Collectors.toList());
//        System.out.println(collect);
//        collect.forEach(x-> System.out.println(x));
            // 14 Flatten a List of Lists
//        List<List<Integer>> listOfLists = Arrays.asList(
//                Arrays.asList(1, 2, 3),
//                Arrays.asList(4, 5, 6),
//                Arrays.asList(7, 8, 9)
//        );
//        List<Integer> flatList = listOfLists.stream()
//                .flatMap(List::stream)
//                .collect(Collectors.toList());
//        System.out.println(flatList); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]

//       List<List<Integer>> l=Arrays.asList(
//
//               Arrays.asList(1,2,3),
//               Arrays.asList(4,5,6),
//               Arrays.asList(7,8,9)
//
//
//
//       );
//        List<Integer> collect = l.stream().flatMap(List::stream).collect(Collectors.toList());
//        System.out.println(collect);
//        collect.forEach(x-> System.out.println(x));

        // 15 Get Distinct Elements from a List

        List<Integer>l=Arrays.asList(1,2,3,4,1,2,3,4,5,6);
        List<Integer> collect = l.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
        collect.forEach(x-> System.out.println(x));


    }
}
