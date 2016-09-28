import java.util.Scanner;
import java.util.Random;
class Multiplication{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    System.out.println("1 array");
    int n1 = scan.nextInt();
    int m1 = scan.nextInt();
    int a[][] = new int[n1][m1];
    System.out.println();
    System.out.println("2 array");
    int n2 = scan.nextInt();
    int m2 = scan.nextInt();
    int b[][] = new int[n2][m2];
    int c[][] = new int[n1][m2];
    int i,j,k;
    if (m1 != n2){
      System.out.println("перемножение не осуществимо");
    }
    for (i = 0; i < n1; i++){
      for (j = 0; j < m1; j++){
        a[i][j] = rand.nextInt(3);
      }
    }
    for (i = 0; i < n2; i++){
      for (j = 0; j < m2; j++){
        b[i][j] = rand.nextInt(3);
      }
    }
    for (i = 0; i < n1; i++){
      for (j = 0; j < m1; j++){
        System.out.print(a[i][j]+ " ");
      }
      System.out.println();
    }
    System.out.println();
    for (i = 0; i < n2; i++){
      for (j = 0; j < m2; j++){
        System.out.print(b[i][j]+ " ");
      }
      System.out.println();
    }
    for (i = 0; i < n1; i++){
      for (j = 0; j < m2; j++){
        int sum = 0;
        for (k = 0; k < m1; k++ ){
          sum += a[i][k] * b[k][j];
        }
        c[i][j] = sum;
      }
    }
    System.out.println();
    for (i = 0; i < n1; i++){
      for (j = 0; j < m2; j++){
        System.out.print(c[i][j]+ " ");
      }
      System.out.println();
    }
  }
}
