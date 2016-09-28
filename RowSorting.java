import java.util.Scanner;
import java.util.Random;
class RowSorting{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    int n = scan.nextInt();
    int m = scan.nextInt();
    int a[][] = new int[n][m];
    int i,j,k,l;
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
    for (i = 0; i < a.length; i++){
      for (j = a[i].length - 1; j >= 0; j--){
        for (l = 0; l <= j - 1; l++){
          if (a[i][l] > a[i][l + 1]){
            k = a[i][l];
            a[i][l] = a[i][l + 1];
            a[i][l + 1] = k;
          }
        }
      }
    }
    System.out.println();
    for (i = 0; i < n; i++){ 
      for (j = 0; j < m; j++){
        System.out.print(a[i][j]+ " ");
      }
      System.out.println();
    }
  }
}
