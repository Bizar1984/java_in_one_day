import java.util.Arrays;

public class arrays_strings {
    public static void main (String[] args) {
        System.out.println("Time to practice strings and arrays....");

        String setGoal = "Become a Java Expert";
        int checkLength = setGoal.length();
        System.out.println(checkLength);

        String subString = setGoal.substring(9, 13);
        // index nine is INCLUDED and 13 is EXCLUDED
        System.out.println(subString);

        char firstCharacterSetGoal = setGoal.charAt(0);
        System.out.println(setGoal + ". First character of beautiful sentence: " + firstCharacterSetGoal);
        System.out.println(setGoal.equals(setGoal));

        String names = "Peter, John, Bomba, Lassoe";
        String[] splitNames = names.split(", ");
        // split method returns an array
        System.out.println(splitNames[2]);

        // declare array variable
        int[] userAge;
        // create and initialise the array
        // after initialising an array you cannot change the size any more
        userAge = new int[] {16, 21, 23, 29, 42};

        // when declaring and initialising in one statement you can omit the the words new int
        int[] cryptoValues = {25, 40, 80, 110};
        // last one to declare an array, this creates an array size 5 with default values of zero
        int[] numbersArray = new int[5];
        // change an integer in the array
        numbersArray[0] = 1;

        // some array methods, we need to import java.util.arrays for this to work
        int[] arrayOne = {1, 2, 3, 4, 5};
        int[] arrayTwo = {1, 2, 3, 4, 5};
        int[] arrayThree = {2, 2, 3, 4, 5};

        boolean resultOne = Arrays.equals(arrayOne, arrayTwo);
        boolean resultTwo = Arrays.equals(arrayOne, arrayThree);
        System.out.println(resultOne);
        System.out.println(resultTwo);

        // copy one array into another
        int[] source = {12, -5, 26, 138, -35, 1250};
        int[] dest = Arrays.copyOfRange(source, 1, 5);
        // start copying from index 1 to 3. Index 3 is EXCLUDED

        // check values of new created array
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }

        // check out values simplified
        System.out.println(Arrays.toString(dest));

        // sort an array, this method does NOT return a new array
        // it simply modifies an existing one
        Arrays.sort(dest);
        System.out.println(Arrays.toString(dest));

        // binarySearch
        int foundIndex = Arrays.binarySearch(dest, 138);
        int nonExistingValue = Arrays.binarySearch(dest, 44);
        System.out.println(foundIndex);
        // if the value does not exist in the array it returns a negative number and adds one
        // this means that IF the value 44 would exist it would be at index number 3
        System.out.println(nonExistingValue);
        System.out.println(dest.length);

        // REFERENCE TYPE
        String storeMessage = "Hello";
        storeMessage = "World";
        // variable storeMessage does not store the string Hello
        // the string Hello is stored else where in the computer's memory
        // the variable storeMessage stores the ADDRESS of that memory location
        System.out.println(storeMessage);
        // a NEW string is created and we assign the memory address to the String variable
        // the string hello is still in memory, but no longer needed in our program
        // it will be eventually destroyed to free up memory, this process is called garbage collection
    }
}
