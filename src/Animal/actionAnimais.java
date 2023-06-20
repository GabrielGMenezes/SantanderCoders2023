package Animal;

public class actionAnimais {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Pandora", "Preto", 25, 5);
        System.out.println(cachorro1.getNome());

        Cachorro cachorro2 = new Cachorro();
        cachorro2.setNome("Lola");
        cachorro2.setCor("Loira");

        Gato gato1 = new Gato("Garfild", "Branco", 15);
        Passaro passaro1 = new Passaro("Frajola", "Amarelo", 5);

        cachorro1.soar();
        System.out.println("O cachorro pegou uma " + cachorro2.pegar());
        System.out.println("O cachorro está " + cachorro1.interagir("brigar"));
        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
        System.out.println("_________________");

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();
        System.out.println("--------------");

        petShop petShop = new petShop();
        petShop.deixarNoHotel(passaro1);
        System.out.println(passaro1.getEstadoDeEspirito());
        petShop.tosar(gato1);
        System.out.println(gato1.getEstadoDeEspirito());
        petShop.darBanho(cachorro2);
        System.out.println(cachorro2.getEstadoDeEspirito());
    }
}
