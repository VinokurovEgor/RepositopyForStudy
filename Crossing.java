import java.util.Scanner;
class Crossing{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n;
    int t;
    n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("ENTER ARRAYS");
    for (int i = 0; i <= n-1; i++) { //ввод первого массива
    a[i] = sc.nextInt();
    }
    System.out.println();
    int b[] = new int[n];
    for (int i = 0; i <= n-1; i++) {   //ввод второго массива
      b[i] = sc.nextInt();
    }
    int c[] = new int[2*n]; //инициализация массива с пересечением
    int k = 0;
    for ( int i = n-1; i >= 0; i--){ //заполнение массива перерсекающимися элементами
    for ( int j = 0; j <= n-1; j++){
      if (b[j] == a[i]){
        c[k] = a[i];
        k++;
      }
    }
    }
    for ( int i = k; i >= 0; i--){  //исключение повторяющихся элементов
      for (int j = 0; j <= k; j++){
        if (i != j & c[i] == c[j]){
          c[i] = 0;
          k--;
        }
      }
    }
    System.out.println();
    for ( int i = 0; i <=k+1; i++){
      System.out.println(c[i]);
    }
  }
}
