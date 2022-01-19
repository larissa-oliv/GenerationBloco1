package animais;

import animais.Cachorro;

public class C1 {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setEspecie("Canis lupus - golden retriever");
        cachorro.setCalda("Longa");
        cachorro.setFilo("Chordata");
        cachorro.setReino("Animalia");
        cachorro.setClasse("Mammalia");

        System.out.println(String.format("A especie é: %s", cachorro.getEspecie()));
        System.out.println(String.format("O tamanho da calda é: %s", cachorro.getCalda()));
        System.out.println(String.format("O filo é: %s", cachorro.getFilo()));
        System.out.println(String.format("O reino é: %s", cachorro.getReino()));
        System.out.println(String.format("A classe é: %s", cachorro.getClasse()));
    }

}

