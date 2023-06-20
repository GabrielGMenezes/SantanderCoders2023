package Animal;

public class petShop {
    public petShop() {
    }

    public void tosar(infAnimais animal) {
        animal.setEstadoDeEspirito("Tosado");
    }

    public void darBanho(Cachorro cachorro) {
        cachorro.setEstadoDeEspirito("Limpo");
    }

    public void deixarNoHotel(infAnimais animal) {
        animal.setEstadoDeEspirito("Sentir Saudades");
    }
}

