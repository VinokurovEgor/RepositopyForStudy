import java.util.Scanner;
import java.util.Random;
class FunctionBubble{
  public static int[] bub(int[] a){
    for (int i = a.length - 1; i >= 0; i--){
      for (int j = 0; j <= i - 1; j++){
        if (a[j] > a[j + 1]){
          int k = a[j];
          a[j] = a[j + 1];
          a[j + 1] = k;
        }
      }
    }
    return a;
  }
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Rows");
    int r = scan.nextInt();
    System.out.println("Columns");
    int c = scan.nextInt();
    Random rand = new Random();
    int arr[][] = new int[r][c];
    for (int i = 0; i < r; i++){
      for (int j = 0; j < c; j++){
        arr[i][j] = rand.nextInt(20);
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
    System.out.println();
    for (int i = 0; i < r; i++){
      arr[i] = bub(arr[i]);
    }
    for (int i = 0; i < r; i++){
      for (int j = 0; j < c; j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }
}
