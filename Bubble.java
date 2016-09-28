import java.util.Scanner;
class Bubble{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n;
    n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("ENTER MASSIV");
    for (int i = 0; i <= n-1; i++) { //заполнение массива
    a[i] = sc.nextInt();
    }
    int t;
    for ( int i = n-1; i >= 0; i--){ //сортировка
    for ( int j = 0; j < i ; j++){
      if (a[j] > a[j+1]){
        t = a[j];
        a[j] = a[j+1];
        a[j+1] = t;
      }
    }
    }
    System.out.println();
    for ( int i = 0; i <=n-1; i++){ //вывод
      System.out.println(a[i]);
    }
  }
}
