/*
 * Program: Find Largest and Second Largest Number in an Array
 * Language: Java
 * Approach: Single Traversal (Without Sorting)
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */



public class LargestAndSecondLargest {

    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 89, 23, 99};

        Result result = Find.findLargestAndSecondLargest(arr);

        System.out.println("Largest Number: " + result.largest);
        System.out.println("Second Largest Number: " + result.secondLargest);
    }
}

class Result {
    int largest;
    int secondLargest;

    Result(int largest, int secondLargest) {
        this.largest = largest;
        this.secondLargest = secondLargest;
    }
}

class Find {

    public static Result findLargestAndSecondLargest(int[] arr) {

        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return new Result(largest, secondLargest);
    }
}