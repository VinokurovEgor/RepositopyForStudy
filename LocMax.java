import java.util.Scanner;
class LocMax{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int i1 = 0;
    int i = 0;
    int a[] = new int[10];
    for (i = 0; i < a.length; i++){
      a[i] = scan.nextInt();
    }
    for (i = 1; i < a.length ; i++){
      if ((a[i-1] < a[i]) & (a[i] > a[i + 1])){
        i1++;
      }
    }
    System.out.println(i1);
  }
}
