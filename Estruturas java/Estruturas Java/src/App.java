import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
  int senha = random.nextInt(10000);
  String c = validaSenha(senha);
  System.out.println(c);
  System.out.println("Senha gerada: " + senha + " -> " + c);
  
   
     
 }
 public static String validaSenha(int pass){
   if(pass < 10){ 
            return "Senha muito fraca";
        } else if(pass < 100){ 
            return "Senha fraca";
        } else if(pass < 1000){
            return "Senha moderada";
        } else { 
            return "Senha forte";
        }
 }
}
