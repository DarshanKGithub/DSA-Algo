public class SubArrays {
    public static void printSubArrays(int number[]){
        int ts =0; //total subarrays
        // Outerloop
        for(int i = 0; i < number.length; i++){
            int start = i;
            //Inner Loop
            for(int j = i; j < number.length; j++){
                int end = j;
                for(int k = start; k <= end; k++){
                    System.out.print(number[k] + "");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays: " + ts);;
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        printSubArrays(number);
    }
}
