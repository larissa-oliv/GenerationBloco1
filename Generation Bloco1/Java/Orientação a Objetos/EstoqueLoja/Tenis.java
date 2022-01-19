package EstoqueLoja;

import java.math.BigDecimal;

public class Tenis {
    private String marca;
    private Double preco;
    private int tamanho;

    @Deprecated
    public Tenis() {

    }

    public Tenis(String marca, Double preco, int tamanho){
        this.marca = marca;
        this.preco = preco;
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Tenis{" +
                "marca='" + marca + '\'' +
                ", preco=" + preco +
                ", tamanho=" + tamanho +
                '}';
    }
}
