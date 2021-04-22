package sample.model;

public class Jogador {
    private String nome;
    private boolean venceu;
    private int totalPontos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVenceu() {
        return venceu;
    }

    public void setVenceu(boolean venceu) {
        this.venceu = venceu;
    }

    public int getTotalPontos() {
        return totalPontos;
    }

    public void setTotalPontos(int totalPontos) {
        this.totalPontos = totalPontos;
    }

    @Override
    public String toString() {
        return "jogador" +
                "nome: " + nome +
                ", " + (venceu?"ganhou o jogo" : "perdeu o jogo") +
                ", totalPontos: " + totalPontos;
    }
}
