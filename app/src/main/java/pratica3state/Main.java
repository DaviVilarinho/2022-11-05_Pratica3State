package pratica3state;


import pratica3state.personagens.Personagem;

public class Main {
    private static void fazTudo(Personagem personagem) {
        personagem.correr();
        personagem.pular();
        personagem.atacar();
    }
    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        fazTudo(personagem);
        System.out.println("O personagem conseguiu 10 de vida");
        personagem.recompensa(10.0);
        fazTudo(personagem);
        System.out.println("O personagem perdeu 30 de vida");
        personagem.tomarDano(30.0);
        fazTudo(personagem);
        System.out.println("O personagem perdeu 40 de vida");
        personagem.tomarDano(40.0);
        fazTudo(personagem);
        System.out.println("O personagem perdeu mais 40 de vida num hit");
        personagem.tomarDano(40.0);
        fazTudo(personagem);
    }
}