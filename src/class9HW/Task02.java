package class9HW;

public class Task02 {
    public static void main(String[] args) {

/*  Create an array of names and store all names of your group.
Then print your name from that array. (use 2 different ways of creating an array).
 */
                        // index 0        1        2        3         4
       String [] groupNames ={"Grant","Mushtaq","Tamana","Angelina","Hamid"};

        System.out.println("My name is "+groupNames[4]);


        // Approach 2



        String [] namesOfGroup = new String[5];

        namesOfGroup[0]="Grant";
        namesOfGroup[1]="Mushtaq";
        namesOfGroup[2]="Tamana";
        namesOfGroup[3]="Angelina";
        namesOfGroup[4]="Hamid";

        System.out.println("My name is "+namesOfGroup[4]);



    }
}
