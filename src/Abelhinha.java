public class Abelhinha extends Personagem {


    public Abelhinha(Integer energia) {
        super(energia);
    }
    @Override
    public void mover() {
        System.out.println("Movendo... Energia: "+energia);
        energia -= 1;
    }

    @Override
    public void fazerSom() {
       System.out.println("Bzzzz!"); 
    }

    
}
