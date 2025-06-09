public class Kalango extends Personagem{

    @Override
    public void mover() {
        System.out.println("Movendo... Energia: "+energia);
        energia -= 3;
    }

    @Override
    public void fazerSom() {
       System.out.println("Tssss!"); 
    }
}
