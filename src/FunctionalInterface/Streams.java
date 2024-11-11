package FunctionalInterface;

import java.util.stream.Collectors;
import java.util.*;

public class Streams {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(4, 4, 5, 6, 7, 9);
        // Intermediate Operations
        num.stream() // we can use streams only once
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .distinct()
                .sorted()
                .peek(n -> System.out.println("Single:" + n))
                .limit(6)
                .skip(2)
                .peek(n -> System.out.println("Double:" + n))
                .forEach(n -> System.out.println(n));

        // we can perform all intermediate operations on one stream but once u close it
        // i mean
        // once we use one terminator operator the stream ends there... we need create
        // another stream for another termination operations.


        //termination operations
        long a = num.stream()
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println(a);

        List<Boolean> b = num.stream()
                .map(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(b);

        int c = num.stream()
                .reduce(0, Integer::sum);
        System.out.println(c);

        boolean d = num.stream()
                .anyMatch(n -> n % 2 == 0);
        System.out.println(d);

        boolean e = num.stream()
                .allMatch(n -> n % 2 == 0);
        System.out.println(e);

        boolean f = num.stream()
                .noneMatch(n -> n % 2 == 0);
        System.out.println(f);

        Optional<Integer> g = num.stream()
                .findFirst();
        System.out.println(g);

        Optional<Integer> h = num.stream()
                .findAny();
        System.out.println(h);

    }
}