public class LargestNumber {

    public static void main (String [] args){
        int [] arr = {12,45,7,89,23,99};

        for(int i =0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr [i] = arr[j];
                    arr [j]=temp;
                    
                }
            }
        }
        System.out.println("Largest number is: " + arr[0]);
    }

}