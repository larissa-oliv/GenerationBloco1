package EstoqueLoja;
import java.util.ArrayList;
import java.util.List;

public class Itens {
    private String titulo;
    private List<Tenis> tenis = new ArrayList<>();

    @Deprecated
   public Itens(){}

    public Itens(String titulo){
        this.titulo = titulo;
    }

    public String gettitulo() {
        return titulo;
    }

    public List<Tenis> getTenis() {
        return tenis;
    }

    public void settitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTenis(List<Tenis> tenis) {
        this.tenis = tenis;
    }

    @Override
    public String toString() {
        return "Itens{" +
                "titulo='" + titulo + '\'' +
                ", tenis=" + tenis +
                '}';
    }
}
