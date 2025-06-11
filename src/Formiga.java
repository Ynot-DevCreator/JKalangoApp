public class Formiga extends Personagem implements IArmamento{
    
    @Override
    public void atacar() {
        // TODO Auto-generated method stub
        
    }

    public Formiga(Integer energia) {
        super(energia);
    }
    
    @Override
    public void mover() {
        energia -= 2;
        if (energia < 0) {
            energia = 0;
        }
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
        System.out.print("Formiga Trabalhadora: "+energia+" Pts de Energia");
        if (energia <= 0) {
            System.out.print(" - Game Over -\n");
        }else{
            System.out.println();
        }
    }
  }
