import java.util.Scanner;
import java.util.Random;
class Function1{
  public static int min(int a[]){
    int minimal = a[0];
    for (int i = 1; i < a.length; i++){
      if (a[i] < minimal){
        minimal = a[i];
      }
    }
    return minimal;
  }
  public static int max(int a[]){
    int maximal = a[0];
    for (int i = 1; i < a.length; i++){
      if (a[i] > maximal){
        maximal = a[i];
      }
    }
    return maximal;
  }
  public static int s(int a[]){
    int sum = 0;
    for (int i = 1; i < a.length; i++){
      sum += a[i];
    }
    return sum;
  }
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("# of elements");
    int n = scan.nextInt();
    int b[] = new int [n];
    Random rand = new Random();
    for (int i = 0; i < n; i++){
      b[i] = rand.nextInt(20);
      System.out.print(b[i]+" ");
    }
    System.out.println();
    int min = min(b), max = max(b), sum = s(b);
    System.out.println("Min:"+min+"  "+"Max:"+max+"  "+"Sum:"+sum+"  ");
  }
}
