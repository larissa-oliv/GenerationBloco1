package produtoEletro;

public class celular {
    String marca;
    String cor;
    double memoria;
    boolean ligado;

    public void status(){
        System.out.println("O celular é da cor: "+this.cor);
        System.out.println("A marca do celular é: "+this.marca);
        System.out.println("O celular possui"+this.memoria+"\t de memória");
    }
}
