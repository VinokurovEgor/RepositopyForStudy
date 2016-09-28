import java.util.Scanner;
import java.util.Random;
class Transposing{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    int n = scan.nextInt();
    int m = scan.nextInt();
    int a[][] = new int[n][m];
    int b[][] = new int[m][n];
    int i,j;
    for (i = 0; i < n; i++){
      for (j = 0; j < m; j++){
        a[i][j] = rand.nextInt(10);
      }
    }
    for (i = 0; i < n; i++){
      for (j = 0; j < m; j++){
        System.out.print(a[i][j]+ " ");
      }
      System.out.println();
    }
    for (i = 0; i < n; i++){
      for (j = 0; j < m; j++){
        b[j][i] = a[i][j];
      }
    }
    System.out.println();
    for (i = 0; i < m; i++){
      for (j = 0; j < n; j++){
        System.out.print(b[i][j]+" ");
      }
      System.out.println();
    }
  }
}
