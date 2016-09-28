import java.util.Scanner;
class Removing{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n;
    n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("ENTER MASSIV");
    for (int i = 0; i <= n-1; i++) {  //заполнение массива
    a[i] = sc.nextInt();
    }
    int t;
    System.out.println(" ENTER NUMBER OF ELEMENT");
    int d;
    d = sc.nextInt();
    a[d] = 0; //обнуление элемента
    for ( int i = n-1; i >= 0; i--){  //сдвиг нуля в конец
    for ( int j = 0; j < i ; j++){
      if (a[j] == 0){
        t = a[j];
        a[j] = a[j+1];
        a[j+1] = t;
      }
    }
    }
    System.out.println();
    for ( int i = 0; i <=n-2; i++){ //вывод без последнего элемента, т.к он 0
      System.out.println(a[i]);
    }
  }
}
