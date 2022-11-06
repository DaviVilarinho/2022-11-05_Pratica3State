package pratica3state.personagens.estados;

import pratica3state.acoes.atacar.AtacarMedio;
import pratica3state.acoes.atacar.AtacarStrategy;
import pratica3state.acoes.correr.CorrerMedio;
import pratica3state.acoes.correr.CorrerStrategy;
import pratica3state.acoes.pular.PularMedio;
import pratica3state.acoes.pular.PularStrategy;
import pratica3state.personagens.Personagem;

public class NormalState implements PersonagemState {
    public static Double HP_MAX = 70.0;
    private Personagem personagem;
    private PularStrategy pularStrategy;
    private AtacarStrategy atacarStrategy;
    private CorrerStrategy correrStrategy;

    public NormalState(Personagem personagem) {
        this.personagem = personagem;
        this.atacarStrategy = new AtacarMedio();
        this.correrStrategy = new CorrerMedio();
        this.pularStrategy = new PularMedio();
    }

    @Override
    public PersonagemState recompensa(Double hp) {
        Double newLife = this.personagem.getHp() + hp;
        this.personagem.setHp(newLife);
        return this.getProximoEstado();
    }

    @Override
    public PersonagemState tomarDano(Double hp) {
        Double newLife = this.personagem.getHp() - hp;
        this.personagem.setHp(newLife);
        return this.getProximoEstado();
    }

    @Override
    public void correr() {
        correrStrategy.correr();
    }

    @Override
    public void pular() {
        pularStrategy.pular();
    }

    @Override
    public void atacar() {
        atacarStrategy.atacar();
    }

    @Override
    public PersonagemState getProximoEstado() {
        Double newHp = this.personagem.getHp();
        if (newHp <= 0) {
            return new MortoState(this.personagem);
        } else if (newHp < FracoState.HP_MAX) {
            return new FracoState(this.personagem);
        } else if (newHp < NormalState.HP_MAX) {
            return this;
        } else {
            return new ForteState(this.personagem);
        }
    }
}
