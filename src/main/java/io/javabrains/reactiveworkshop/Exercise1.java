package io.javabrains.reactiveworkshop;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        StreamSources.intNumbersStream().forEach(e -> System.out.println(e));
//        Other way of doing the same. The below is called Method Referencing.
//        StreamSources.intNumbersStream().forEach(System.out::println);


        // Print numbers from intNumbersStream that are less than 5
        // TODO: Write code here
//        StreamSources.intNumbersStream().forEach(e -> {
//            if (e < 5) System.out.println(e);
//        });
//        BETTER APPROACH
        StreamSources.intNumbersStream().filter(number -> number < 5)
                .forEach(number -> System.out.println(number));

        // Print the second and third numbers in intNumbersStream that's greater than 5
        // TODO: Write code here
        StreamSources.intNumbersStream().filter(number -> number > 5)
                .skip(1)
                .limit(2)// this will make sure that only 2(2nd and 3rd) numbers are printed
                .forEach(number -> System.out.println(number));

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here
        Integer value = StreamSources.intNumbersStream().filter(number -> number > 5)
                .findFirst()
                .orElse(-1);
        System.out.println(value);

        // Print first names of all users in userStream
        // TODO: Write code here
        StreamSources.userStream()
                .map(user -> user.getFirstName())
                .forEach(user -> System.out.println(user));

        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here


    }

}
