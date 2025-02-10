import java.util.Arrays;

public class IntroTo2DArrays{
  public static void main(String[] args){
    int[][] ray = new int[2][3];

    ray[0][0] = 1;
    ray[0][1] = 2;
    ray[0][2] = 3;
    ray[1][0] = 4;
    ray[1][1] = 5;
    ray[1][2] = 6;

    /*
      1 2 3 
      4 5 6
    */

    System.out.println(Arrays.toString(ray));

    //Print the first array in the array ray

    
    System.out.println(Arrays.toString(ray[0]));
    System.out.println(Arrays.toString(ray[1]));

    //ray.length represents the number of rows or how many arrays this is a collection of (In a 2D array)
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }

    //Change every vlaue in the 2D array to 7
   /* for(int i=0; i<ray[0].length; i++)
    {
      ray[0][i] = 7;
      ray[1][i] = 7;
    }
    */
    //ray[#].length represents the number of columns in each array in the array 
    // or what size is the array in the array of arrays
    for(int row=0; row<ray.length; row++)
    {
      for(int col=0; col<ray[row].length; col++)
      {
        ray[row][col] = 7;
      }
    }
  
    System.out.println(Arrays.toString(ray[0]));
    System.out.println(Arrays.toString(ray[1]));


    for(int row=0; row<ray.length; row++)
    {
      for(int col=0; col<ray[row].length; col++)
      {
        //(int)(Math.random()*UPPERBOUND - LOWERBOUND + 1)
        ray[row][col] = (int)(Math.random()*11 + 0);
      }
    }
    System.out.println(Arrays.toString(ray[0]));
    System.out.println(Arrays.toString(ray[1]));

    int sum = 0;
    for(int row=0; row<ray.length; row++)
    {
      sum=0;
      for(int col=0; col<ray[row].length; col++)
      {
        sum += ray[row][col];
      }

      System.out.println("The sum of row" + row + " is: " + sum);
    }
    System.out.println("\n\n\nHomework Assignment");

    //Add up the columns of each row using for each loops...
    //Add up all of the values of the array using for each loops...
    int[] count = new int[0];
    for(int[] i: ray)
    {
      for(int[] i2: ray)
      count = i + i2;
    }

    System.out.println(Arrays.toString(count));
  }

  
}
