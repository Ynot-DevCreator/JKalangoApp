public class Kalango extends Personagem implements IArmamento{

    @Override
    public void atacar() {
        // TODO Auto-generated method stub
        
    }

    public Kalango(Integer energia) {
        super(energia);
    }
    
    @Override
    public void mover() {
        energia -= 3;
        if (energia < 0) {
            energia = 0;
        }
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
        System.out.print("Kalango Maratonista: "+energia+" Pts de Energia");
        if (energia <= 0) {
            System.out.print(" - Game Over -\n");
        }else{
            System.out.println();
        }
    }
}
