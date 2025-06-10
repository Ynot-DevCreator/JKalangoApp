public class Abelhinha extends Personagem {


    public Abelhinha(Integer energia) {
        super(energia);
    }

    @Override
    public void mover() {
        energia -= 1;
        System.out.println("Movendo... Energia: "+energia);
    }

    @Override
    public void fazerSom() {
       System.out.println("Bzzzz!"); 
    }

    public void comer() {
        energia += 4;
        System.out.println("Comendo... Energia: "+energia);
    }
}
