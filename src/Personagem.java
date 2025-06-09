public abstract class Personagem {
    protected Integer energia;
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
}
