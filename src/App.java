import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     Scanner sc = new Scanner(System.in);
        System.out.println("Quanto será a energia da Abelhinha? (Energia Máxima de 10)");
        int aEnergia = 0;
        aEnergia = sc.nextInt();
        while (aEnergia > 10) {
            System.out.println("Limite de Energia Ultrapassado, Tente um Valor menor: ");
            aEnergia = sc.nextInt();
        }
        Abelhinha a = new Abelhinha(aEnergia);
        System.out.println("Abelhinha Polenizadora:");
        for (int i = 0; i < 3; i++) {
            a.mover();
            if (a.getEnergia() <= 0) {
                break;
            }
        }
        a.fazerSom();
        while (true) {
            if (a.getEnergia() <= 0) {
                System.out.println("Energia Esgotada - Game Over -");
                break;
            }
            a.verificarE();
            int opcao = sc.nextInt();
            if (opcao == 1) {
                a.comer();
                break;
            }else{
                a.dormir();
                break;
            }
        }
        System.out.println("Quanto Será a energia do Kalango? (Energia Máxima de 13)");
        int kEnergia = 0;
        kEnergia = sc.nextInt();
        while (kEnergia > 13) {
            System.out.println("Limite de Energia Ultrapassado, Tente um Valor menor: ");
            kEnergia = sc.nextInt();
        }
        Kalango k = new Kalango(kEnergia);
        System.out.println("\nKalango Maratonista:");
        for (int i = 0; i < 3; i++) {
            k.mover();
            if (k.getEnergia() <= 0) {
                break;
            }
        }
        k.fazerSom();
        while (true) {
            if (k.getEnergia() <= 0) {
                System.out.println("Energia Esgotada - Game Over -");
                break;
            }
            k.verificarE();
            int opcao = sc.nextInt();
            if (opcao == 1) {
                k.comer();
                break;
            }else{
                k.dormir();
                break;
            }
        }
        System.out.println("Quanto será a energia da Formiga? (Energia Máxima de 12)");
        int fEnergia = 0;
        fEnergia = sc.nextInt();
        while (fEnergia > 12) {
            System.out.println("Limite de Energia Ultrapassado, Tente um Valor menor: ");
            fEnergia = sc.nextInt();
        }
        Formiga f = new Formiga(fEnergia);
        System.out.println("\nFormiga Trabalhadora:");
        for (int i = 0; i < 3; i++) {
            f.mover();
            if (f.getEnergia() <= 0) {
                break;
            }
        }
        f.fazerSom();
        while (true) {
            if (f.getEnergia() <= 0) {
                System.out.println("Energia Esgotada - Game Over -");
                break;
            }
            f.verificarE();
            int opcao = sc.nextInt();
            if (opcao == 1) {
                f.comer();
                break;
            }else{
                f.dormir();
                break;
            }
        }
        System.out.println("\n\t\tFim de Jogo\n-------------------------------------------\nEstatísticas dos personagens:\nAbelhinha Polenizadora: "+a.getEnergia()+" Pts de Energía\nKalango Maratonista: "+k.getEnergia()+" Pts de Energía\nFormiga Trabalhadora: "+f.getEnergia()+" Pts de Energía\n-------------------------------------------");
    }
}
