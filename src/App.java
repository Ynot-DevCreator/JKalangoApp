import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     Scanner sc = new Scanner(System.in);
        System.out.println("Quanto será a energia da Abelhinha?");
        int aEnergia = sc.nextInt();
        Abelhinha a = new Abelhinha(aEnergia);
        System.out.println("Abelhinha Polenizadora:");
        a.mover();
        a.mover();
        a.mover();
        a.fazerSom();
        a.verificarE();
        while (a.getEnergia() < 5) {
            int opcao = sc.nextInt();
            if (opcao == 1) {
                a.comer();
            }else{
                a.dormir();
            }
            a.verificarE();
        }
        System.out.println("Quanto Será a energia do Kalango?");
        int kEnergia = sc.nextInt();
        Kalango k = new Kalango(kEnergia);
        System.out.println("\nKalango Maratonista:");
        k.mover();
        k.mover();
        k.mover();
        k.fazerSom();
        k.verificarE();
        while (k.getEnergia() < 5) {
            int opcao = sc.nextInt();
            if (opcao == 1) {
                k.comer();
            }else{
                k.dormir();
            }
            k.verificarE();
        }
        System.out.println("Quanto será a energia da Formiga?");
        int fEnergia = sc.nextInt();
        Formiga f = new Formiga(fEnergia);
        System.out.println("\nFormiga Trabalhadora:");
        f.mover();
        f.mover();
        f.mover();
        f.fazerSom();
        f.verificarE();
        while (f.getEnergia() < 5) {
            int opcao = sc.nextInt();
            if (opcao == 1) {
                f.comer();
            }else{
                f.dormir();
            }
            f.verificarE();
        }
        System.out.println("\n\t\tFim de Jogo\n-------------------------------------------\nEstatísticas dos personagens:\nAbelhinha Polenizadora: "+a.getEnergia()+" Pts de Energía\nKalango Maratonista: "+k.getEnergia()+" Pts de Energía\nFormiga Trabalhadora: "+f.getEnergia()+" Pts de Energía\n-------------------------------------------");
    }
}
