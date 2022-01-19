package EstoqueLoja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Estoque {
    public static void main(String[] args) {

        Tenis t1 = new Tenis("Nike", 50.0, 40);
        Tenis t2 = new Tenis("Adidas", 40.0, 40);
        Tenis t3 = new Tenis("Puma", 30.0, 40);

        List<Tenis> tenis = new ArrayList<>();
        tenis.add(t1);
        tenis.add(t2);
        tenis.add(t3);

        Itens itens = new Itens("Calçados");
        itens.setTenis(tenis);

        System.out.println(itens);

        tenis.remove(1);

        System.out.println(itens);


    }
}
