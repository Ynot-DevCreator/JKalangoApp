public class Kalango extends Personagem{

    public Kalango(Integer energia) {
        super(energia);
    }
    
    @Override
    public void mover() {
        energia -= 3;
        System.out.println("Movendo... Energia: "+energia);
    }

    @Override
    public void fazerSom() {
       System.out.println("Tssss!"); 
    }

    public void comer() {
        energia += 3;
        System.out.println("Comendo... Energia: "+energia);
    }

    public void tabelaFinal() {
        System.out.println("Kalango Maratonista: "+energia+" Pts de Energia");
    }
}
