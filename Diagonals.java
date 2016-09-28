import java.util.Scanner;
class Diagonals{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int a[][] = new int[3][3];
  for (int i = 0; i < 3; i++){ //ввод массива
    for (int j = 0; j < 3; j++){
      a[i][j] = sc.nextInt();
    }
  }
    int s = 0;
    for (int i = 0; i < 3; i++){ //ссума гл.диагонали
      for (int j = 0; j < 3; j++){
        if (i == j){
          s = s+a[i][j];
        }
      }
    }
    int i = 0;
    int j = 2;
    int s2= 0;
    while (i < 3){       //ссума побочной
      s2 = s2 + a[i][j];
      i++;
      j--;
    }
    System.out.println("sum main=" + s+ "   sum ani=" + s2);
    int min = 33000;
    for ( i = 0; i < 3; i++){    //поиск минимального
      for ( j = 0; j < 3; j++){
        if (j > i & a[i][j] < min) {
          min = a[i][j];
        }
  }
}
System.out.println("min=" + min);
}
}
