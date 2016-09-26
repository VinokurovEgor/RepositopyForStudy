//вывод массива задом на перед
import java.util.Scanner;
public class Coup{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n;
    n = sc.nextInt(); //n-длинна массива
    int a[] = new int[n];
    int i = 0;
    while (i <= n-1){ //заполнение массива
      a[i] = sc.nextInt();
      i++;
    }
    System.out.println();
    while (i-1 >= 0){
      System.out.println(a[i-1]);
      i--;
    }
  }
}
