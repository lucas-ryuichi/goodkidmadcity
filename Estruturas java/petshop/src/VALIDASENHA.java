import java.util.Scanner;
public class VALIDASENHA {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
       int [][] matriz = new int[3][3];
       int soma = 0;
       for(int i = 0; i < 3; i++){
           for(int j = 0; j < 3; j++){
               System.out.print("digite um numero ");
               matriz[i][j] = scanner.nextInt();
           }
       }
       System.out.println("diagonal principal da matriz: ");
       for(int i = 0; i < 3; i++){
           for(int j = 0; j < 3; j++){
               if(i == j){
                   System.out.print( matriz[i][j]);
                   soma += matriz[i][j];
               }
               System.out.print("\t");
           }
           System.out.println();
       }
       System.out.println();
       System.out.println("A soma da diagonal principal é: " + soma);
       soma = 0;
       System.out.println();
       System.out.println("Matriz completa: ");
       for(int i = 0; i < 3; i++){
         for(int j = 0; j < 3; j++){


               System.out.print( matriz[i][j]);
               soma += matriz[i][j];
               System.out.print("\t");
           }
           System.out.println();
       }
       System.out.println();
       System.out.println("A soma de todos os elementos e : " + soma);
   }
    }



