import java.util.Scanner;
public class GlobalMin {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE NUMBER OF ELEMENTS ");
    int min = 33000;
    int n;
    n = sc.nextInt();
    if (n == 0) { //для работы с нулевым множеством
      System.out.println("MINIMUM CAN NOT BE FOUND");
    }
    else {
      int a[] = new int[n];
      System.out.println("ENTER MASSIV");
      for (int i = 0; i <= n-1; i++) {
      a[i] = sc.nextInt();
        if (a[i] < min) {
          min = a[i];
        }
      }
      System.out.println();
      System. out.println("MINIMUM=" + min);
    }

  }
}
