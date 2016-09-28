import java.util.Scanner;
import java.util.Random;
class FunctionMult{
  public static int[][] pr(int[][] a, int[][] b){
    int c[][] = new int[a.length][b[0].length],i,j,k;
    for (i = 0; i < a.length; i++){
      for (j = 0; j < b[0].length; j++){
        int sum = 0;
        for (k = 0; k < a[0].length; k++ ){
          sum += a[i][k] * b[k][j];
        }
        c[i][j] = sum;
      }
    }
    return c;
  }
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    System.out.println("1 array");
    System.out.println("Row");
    int n1 = scan.nextInt();
    System.out.println("Column");
    int m1 = scan.nextInt();
    int a[][] = new int[n1][m1];
    System.out.println();
    System.out.println("2 array");
    System.out.println("Row");
    int n2 = scan.nextInt();
    System.out.println("Column");
    int m2 = scan.nextInt();
    int b[][] = new int[n2][m2];
    int c[][] = new int[n1][m2];
    int i,j;
    if (m1 != n2){
      System.out.println("Multiplication is impossible");
    }
    for (i = 0; i < n1; i++){ //random fill1
      for (j = 0; j < m1; j++){
        a[i][j] = rand.nextInt(3);
      }
    }
    for (i = 0; i < n2; i++){ //random fill2
      for (j = 0; j < m2; j++){
        b[i][j] = rand.nextInt(3);
      }
    }
    for (i = 0; i < n1; i++){ //output1
      for (j = 0; j < m1; j++){
        System.out.print(a[i][j]+ " ");
      }
      System.out.println();
    }
    System.out.println();
    for (i = 0; i < n2; i++){ //output2
      for (j = 0; j < m2; j++){
        System.out.print(b[i][j]+ " ");
      }
      System.out.println();
    }
    c = pr(a,b);
    System.out.println();
    for (i = 0; i < n1; i++){ //output3
      for (j = 0; j < m2; j++){
        System.out.print(c[i][j]+ " ");
      }
      System.out.println();
    }
  }
}
