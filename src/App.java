import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     Formiga f = new Formiga();
     Kalango k = new Kalango();
     Abelhinha a = new Abelhinha();
        Scanner sc = new Scanner(System.in);
        int energiaAbelha = sc.nextInt();
        System.out.println("Abelhinha Trabalhadora:");
        a.mover();
        a.mover();
        a.mover();
        a.fazerSom();
        a.dormir();
        System.out.println("\nKalango Trabalhador:");
        k.mover();
        k.mover();
        k.mover();
        k.fazerSom();
        k.dormir();
        System.out.println("\nFormiga Trabalhadora:");
        f.mover();
        f.mover();
        f.mover();
        f.fazerSom();
        f.dormir();   
        
     
     
     
    }
    
}
