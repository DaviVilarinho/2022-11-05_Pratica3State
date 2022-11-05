package pratica3state.acoes.correr;

public class CorrerRapido implements CorrerStrategy {
    @Override
    public void correr() {
        System.out.println("Correndo Rápido");
    }
}
