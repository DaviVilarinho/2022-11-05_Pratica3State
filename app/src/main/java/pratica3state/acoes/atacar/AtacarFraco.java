package pratica3state.acoes.atacar;

public class AtacarFraco implements AtacarStrategy {
    @Override
    public void atacar() {
        System.out.println("Atacando Fraco");
    }
}
