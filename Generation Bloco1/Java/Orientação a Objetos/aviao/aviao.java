package aviao;

public class aviao {
    String companhia;
    String cor;
    int capacidade;
    boolean ligado;
    String espaco;

    public void ligar(){
        ligado=true;
    }
    public void desligar(){
        ligado=false;
    }
    public void decolar(){
        if(ligado==true)
            System.out.println("Decolagem autorizada!");
        else
            System.out.println("Ligue o avião!");
    }
    public void status(){
        System.out.println("Avião é da cor: "+this.cor);
        System.out.println("A capacidade da aeronave é de:"+this.capacidade+"\tpassageiros.");
        System.out.println("A companhia aérea responsável por este voo é: "+this.companhia);
    }

}
