public class MaxSubArray {
    public static void maxSubArraysSum(int number[])
    {
        int currSrum = 0;
        int maxSum = Integer.MIN_VALUE;
        //outer loop
        for(int i = 0; i < number.length; i++){
            for(int j = i ; j < number.length;j++){
                currSrum = 0;
                for(int k = i; k <=j; k++){
                    // currSrum = currSrum + number[k];
                    currSrum += number[k];
                    
                }
            System.out.println(currSrum);

                if(maxSum < currSrum){
                    maxSum = currSrum;
                }
            }
        }
      System.out.println("Max Sum is: " + maxSum);
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        maxSubArraysSum(number);
    }
}
