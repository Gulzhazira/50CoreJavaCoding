package arraysstrings;

public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = {1, 1};
        int largestElement = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num:arr){
            if (num > largestElement){
                secondLargest = largestElement;
                largestElement = num;
            } else if (num > secondLargest && num != largestElement){
                secondLargest = num;
            }
        }

        
        /* for(int i = 0; i < arr.length; i++){  //another way to check
            for(int j = 0; j < arr.length; j++){
                if(arr[i]<arr[j]){
                    largestElement = arr[j];
                }
            }
            for(int j = 0; j < arr.length; j++){
                if(arr[i]<= arr[j] & arr[j] < largestElement){
                    secondLargest = arr[j];
                }
            }
        } */
        if(secondLargest == Integer.MIN_VALUE){
            System.out.println("Second largest not found");
        } else {
            System.out.println(secondLargest);
        }
    }
    
}
