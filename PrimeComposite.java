import java.util.Scanner;

class PrimeComposite{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("# of elements");
    int n = scan.nextInt();
    int a[] = new int[n];
    int i,j;
    for (i = 0; i < n; i++){ //вход
        a[i] = scan.nextInt();
    }
    for (i = 0; i < n-1; i++){
      boolean k1 = false, k2 = k1;
      if (a[i] == 2 | a[i] == 3){
        k1 = true;
      }else{
        for (j = 2; j*j <= a[i]; j++){
          if(a[i] % j == 0){
            k1 = false;
            break;
          }else{
            k1 = true;
          }
        }
      }
      for (j = 2; j*j <= a[i+1]; j++){
        if(a[i+1] % j == 0){
          k2 = true;
          break;
        }
      }
      if (k2){
        i++;
        if (k1){
          System.out.println(i-1);
        }
      }
    }
  }
}
