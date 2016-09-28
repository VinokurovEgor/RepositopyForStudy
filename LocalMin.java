import java.util.Scanner;
class LocalMin{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a[] = new int[10];
    int i;
    for (i = 0; i < a.length; i++){
      a[i] = scan.nextInt();
    }
    for (i = 1; i < a.length ; i++){
      if (a[i-1] > a[i] & a[i] < a[i + 1]){
        System.out.println(i + ": " + a[i]);
      }
    }
  }
}
