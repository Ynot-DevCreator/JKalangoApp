public class Formiga extends Personagem {
    
    public Formiga(Integer energia) {
        super(energia);
    }
    
    @Override
    public void mover() {
        energia -= 2;
        System.out.println("Movendo... Energia: "+energia);
    }

    @Override
    public void fazerSom() {
       System.out.println("Fzzzz!"); 
    }

    public void comer() {
        energia += 5;
        System.out.println("Comendo... Energia: "+energia);
    }
    
    public void tabelaFinal() {
        System.out.println("Formiga Trabalhadora: "+energia+" Pts de Energia");
    }
  }
