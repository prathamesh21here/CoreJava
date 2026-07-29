public class LargestAndSecondLargest {

    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 89, 23, 99};

        int largest = Find.findTheLargest(arr);

        System.out.println("Largest number is: " + largest);
    }
}

class Find {

    public static int findTheLargest(int[] arr) {

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return largest;
    }
}