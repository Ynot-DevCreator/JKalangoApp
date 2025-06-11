public class Abelhinha extends Personagem implements IArmamento{
    
    @Override
    public void atacar() {
        // TODO Auto-generated method stub
        
    }
    public Abelhinha(Integer energia) {
        super(energia);
    }

    @Override
    public void mover() {
        energia -= 1;
        if (energia < 0) {
            energia = 0;
        }
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

    public void tabelaFinal() {
        System.out.print("Abelhinha Polenizadora: "+energia+" Pts de Energia");
        if (energia <= 0) {
            System.out.print(" - Game Over -\n");
        }else{
            System.out.println();
        }
    }
}
