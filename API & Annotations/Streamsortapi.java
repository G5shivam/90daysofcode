package apiannotations;

import java.util.*;
import java.util.stream.*;

public class Streamsortapi {
    public static void main(String[] args) {
        
        List<Integer> list=Arrays.asList(2,1,6,4,3,9,8);
        Stream<Integer> StreamDatas=list.stream();
     
        Stream<Integer> finalStream=StreamDatas.filter(n -> n%2==0).sorted().map(n ->n*2);
        finalStream.forEach(n -> System.out.println(n));
    }
    
}
