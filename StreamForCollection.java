package java8.StreamAPIs.StreamOperationsExamples.StreamCreationOperation4;

import java.util.ArrayList;
import java.util.List;

public class StreamForCollection {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(6);
        list.stream().forEach(System.out::println);
    }
}
