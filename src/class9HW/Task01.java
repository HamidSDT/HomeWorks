package class9HW;

public class Task01 {
    public static void main(String[] args) {
/*
 Create an array of chars and store grades into it: A,B,C,D,E,F.
  Then print a grade B (use 2 different ways of creating an array).
 */
              //index  0  1   2   3   4   5   6   7   8   9   10     // total 11 elements including 0 (zero)
    char[] letters = {'A',' ','B',' ','C',' ','D',' ','E',' ','F'};

       // letters[0]='a';    // this method is used to update the elements at index

       // System.out.println(letters.length);  // this is showing the elements present in array .

        System.out.println(letters[2]);

        System.out.println();

        //Approach2

        char[] abc = new char[11];

        abc[0]='A';
        abc[1]=' ';
        abc[2]='B';
        abc[3]=' ';
        abc[4]='C';
        abc[5]=' ';
        abc[6]='D';
        abc[7]=' ';
        abc[8]='E';
        abc[9]=' ';
        abc[10]='F';

       // System.out.println(abc.length); number of elements


        System.out.println(abc[2]);





        }





    }

