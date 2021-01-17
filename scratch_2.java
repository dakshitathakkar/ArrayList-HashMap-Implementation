import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class ArrayListQuestion{
    public static void main(String[] args) {
        //arraylist(any collection of collection framework) does not work with primitive data types
        //to remove this error we use wrapper class
        ArrayList<Integer> numbers = new ArrayList<>();
        //to add elements, there are two options shown for parameters because there are two
        //add methods and here add method is overloaded
        //numbers.add(4);
        //to add multiple elements loop length.fori
        //to add random numbers Math.random used
        //Math.random method returns double which cannot be taken so typecasting needs to be done
        //output wil be 0 0.....
        //Collections.sort(numbers)
        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * i + 1));
        }
        System.out.println(numbers);

        Collections.sort(numbers);

        HashMap<Integer, Integer> pairsList = new HashMap<>();
        int firstPointer = 0;
        int secondPointer = numbers.size() - 1;

        while(firstPointer < secondPointer){
            int sum = numbers.get(firstPointer) + numbers.get(secondPointer);
            if(sum==6) {
                var pair = new Pair<>(numbers.get(firstPointer), numbers.get(secondPointer));

                pairsList.put(numbers.get(firstPointer), numbers.get(secondPointer));
                firstPointer++;
                secondPointer--;
            }
            else if(sum<6){
                firstPointer++;
            }
            else {
                secondPointer--;
            }
        }

        System.out.println("Number of Pairs: " + pairsList.size());
        System.out.println("Pairs: " + pairsList);
    }

    static class Pair<R extends Integer, S extends Integer> {
        private R firstNumber;
        private R secondNumber;

        public Pair(R firstNumber, R secondNumber) {
            this.firstNumber = firstNumber;
            this.secondNumber = secondNumber;
        }

        @Override
        public String toString() {
            return String.format("%d, %d",firstNumber, secondNumber);
        }
    }
}