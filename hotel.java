import java.util.Scanner;

public class hotel {
      
      int D = 10; 
      int A = 10; 
      int N = 100; 
      int total;
      
    public static void main(String args[]) {
      
      int promocao(int promo){
        if(N >= 16){
            return promo = D + (N - 1) * A;
        }
        return promo = D + 14 * A;
      }
      
      total = (32 - N) * promocao;
      
      System.out.println("Esse é o valor total a ser pago ao hotel pela sua estadia: " +total);
    }
}
