public class Formiga extends Personagem {
    @Override
    public void mover() {
        System.out.println("Movendo... Energia: "+energia);
        energia -= 2;
    }

    @Override
    public void fazerSom() {
       System.out.println("Fzzzz!"); 
    }
  }


