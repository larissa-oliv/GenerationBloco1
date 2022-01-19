package animais;

public class P1 {
    public static void main(String[] args) {
        Passaro passaro = new Passaro();
        passaro.setEspecie("Cyanopsitta spixii - Ararinha Azul");
        passaro.setHabitat("Pantanal");
        passaro.setFilo("Chordata");
        passaro.setReino("Animalia");
        passaro.setClasse("Aves");

        System.out.println(String.format("A especie é: %s", passaro.getEspecie()));
        System.out.println(String.format("Seu habitat é: %s", passaro.getHabitat()));
        System.out.println(String.format("O filo é: %s", passaro.getFilo()));
        System.out.println(String.format("O reino é: %s", passaro.getReino()));
        System.out.println(String.format("A classe é: %s", passaro.getClasse()));
    }
}
