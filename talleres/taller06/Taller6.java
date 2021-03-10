import java.util.ArrayList;
import java.util.Scanner;

public class Taller6 {

 public static ArrayList<Integer> opcinal2 (){
        ArrayList<Integer> array = new ArrayList<>();
        Scanner to = new Scanner(System.in);
        int n = to.nextInt();
        while (n != -1 ) {
            array.add(n);
            n = to.nextInt();
        }
        ArrayList<Integer> arr = new ArrayList<>(); 
        for(int i = 0; i < array.size() ; i++) {
            arr.add(array.get(array.size()-1-i));
        }
        return arr;
 }

 public static ArrayList<Integer> opcinal3 (int n){
        ArrayList<Integer> suce = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                suce.add(j);
            }
        }
        return suce;
  }
}