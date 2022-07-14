package src.com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 /*int[] numberArray = {10, 20, 30, 40}; // goes from position 0 up to position "i-1"("n-1").
    int i = 0;
      while (i<=3) {            //method to print out all elements on an array.
          System.out.println(numberArray[i]);
          i++;
      }


        Integer[] numberArray = {0,2,3,4,5};
        System.out.print(Arrays.toString(numberArray)+"\n");
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(numberArray));
        arrayList.add(7);                                                                 //**Adding element to a pile

        numberArray = arrayList.toArray(numberArray);
        System.out.println("After " +Arrays.toString(numberArray));

    }*/
        Scanner read = new Scanner(System.in);
        int[][] numb = new int[2][2];
        for (int x = 0; x < numb.length; x++){
            for(int y = 0; y < numb[x].length; y++){
                System.out.println("value for pos "+(x+1)+" "+(y+1)+".");
                numb[x][y] = read.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(numb));
    }
}

