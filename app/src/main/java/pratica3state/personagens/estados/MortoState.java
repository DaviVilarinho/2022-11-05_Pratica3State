package pratica3state.personagens.estados;

import pratica3state.personagens.Personagem;

public class MortoState implements PersonagemState {
    Personagem personagem;

    public MortoState(Personagem personagem) {
        this.personagem = personagem;
    }

    @Override
    public PersonagemState recompensa(Double hp) {
        System.out.println("Não é possível ganhar mais nada porque o personagem está morto");
        return this;
    }

    @Override
    public PersonagemState tomarDano(Double hp) {
        System.out.println("Não é possível tomar dano porque o personagem está morto");
        return this;
    }

    @Override
    public void correr() {
        System.out.println("Não é possível correr porque o personagem está morto");
    }

    @Override
    public void pular() {
        System.out.println("Não é possível pular porque o personagem está morto");
    }

    @Override
    public void atacar() {
        System.out.println("Não é possível atacar porque o personagem está morto");
    }

    @Override
    public PersonagemState getProximoEstado() {
        return this;
    }
}
