public abstract class Personagem {
    protected Integer energia;

    public Personagem(){

    }
    public Personagem(Integer energia) {
        this.energia = energia;
    }
    public abstract void mover();

    public abstract void fazerSom();

    public void dormir(){
        energia += 10;
      System.out.println("Dormindo... Energia: "+energia);  
    }
    public Integer getEnergia() {
        return energia;
    }

    public abstract void comer();

    public abstract void tabelaFinal();

    public boolean verificarE() {
        if (energia < 5) {
            System.out.println("Personagem está Cansado.. Precisa Comer ou Dormir\nEscolha uma opção:\n-----------------\n1-Comer\n2-Dormir\n-----------------");
            return false;
        }else{
            System.out.println("Personagem Descansado, Energia: "+energia);
            return true;
        }
    }
}
