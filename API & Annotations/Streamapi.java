package apiannotations;

import java.util.*;
import java.util.Arrays;
import java.util.stream.*;

public class Streamapi {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(2,4,5,8,9);
        Stream<Integer> StreamData=list.stream();
        StreamData.forEach(n -> System.out.println(n));

        
    }
    
}
