package class9HW;

public class Task05 {
    public static void main(String[] args) {
   // Create an array of size 5 on integers and calculate the sum of all elements in an array.

        int [] numbers = {1,4,5,8,10};

        int sum=0;

        for (int i = 0; i <numbers.length ; i++) {

            sum=sum+numbers[i];

        }
        System.out.println(sum);



    }
}
