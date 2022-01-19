package animais;

public class Px1 {
    public static void main(String[] args) {
        Peixe peixe = new Peixe();
        peixe.setEspecie("Betta splendens - Peixe Betta");
        peixe.setReproducao("Ovos");
        peixe.setFilo("Chordata");
        peixe.setReino("Animalia");
        peixe.setClasse("Actinopterygii");

        System.out.println(String.format("A especie é: %s", peixe.getEspecie()));
        System.out.println(String.format("Seu meio de reprodução é através de: %s", peixe.getReproducao()));
        System.out.println(String.format("O filo é: %s", peixe.getFilo()));
        System.out.println(String.format("O reino é: %s", peixe.getReino()));
        System.out.println(String.format("A classe é: %s", peixe.getClasse()));
    }
}
