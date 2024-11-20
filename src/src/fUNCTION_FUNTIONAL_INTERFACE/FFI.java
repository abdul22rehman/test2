package src.fUNCTION_FUNTIONAL_INTERFACE;

import java.util.function.Function;

//function-Functional Interface
//Represent a function that  accepts one argument and produces a result
public class FFI {
    public static void main(String[] args) {
//        Function<Integer,Integer> val= x->x*x;
//        Integer result = val.apply(10);
//        System.out.println(result);
//
//        Function<Integer,Integer>val=x->x*x;
//        Integer apply = val.apply(10);
//        System.out.println(apply);


//        Function<Integer,Integer>val=x->x*x;
//        Integer apply = val.apply(10);
//        System.out.println(apply);
//Function<Integer,Integer>val=x->x*x;
//        Integer apply = val.apply(12);
//        System.out.println(apply);


//        Function <Integer,Integer> val=x->x*x;
//        Integer apply = val.apply(22);
//        System.out.println(apply);

//
//     Function<Integer,String>val=x->"the value of x is "+x;
//        String apply = val.apply(70);
//        System.out.println(apply);

//     Function<Integer,String>val=x->"the value of x is "+x;
//        String apply = val.apply(12);
//        System.out.println(apply);

  Function<Integer,String>val=x->"The value of x is "+x;
        String apply = val.apply(23);
        System.out.println(apply);


    }
}
