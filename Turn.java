import java.util.Scanner;
import java.util.Random;
class Turn{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    System.out.println("Size");
    int n = scan.nextInt();
    int a[][] = new int[n][n];
    int i,j;
    for (i = 0; i < n; i++){
      for (j = 0; j < n; j++){
        a[i][j] = rand.nextInt(10);
      }
    }
    for (i = 0; i < n; i++){
      for (j = 0; j < n; j++){
        System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
    for (i = 0; i < n-1; i++){
      for (j = 0; j < n-i-1; j++){
        int b = a[i][j];
        a[i][j] = a[n-1-j][n-1-i];
        a[n-1-j][n-1-i] = b;
      }
    }
    System.out.println();
    for (i = 0; i < n; i++){ 
      for (j = 0; j < n; j++){
        System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
  }
}
