import java.util.Scanner;

public class hotel {
      
      int D, A, N, total;
      
    public static void main(String args[]) {
      System in = new Scanner(System.in);

      System.out.println("Insira o valor da diária: ");
      D = in.nextInt();
      
      System.out.println("Insira o valor de aumento da diaria: ");
      A = in.nextInt();
      
      System.out.println("Insira o dia da chegada no hotel: ");
      N = in.nextInt();
      
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
