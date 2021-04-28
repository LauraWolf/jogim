package sample.controller;

import sample.model.Dado;
import sample.model.Jogador;

import java.util.ArrayList;
import java.util.List;

/** Classes */

public class Tabuleiro {
    List<Jogador> jogadores;

    /** Getter e Setter */

    public Tabuleiro
            (List<String> nomesJogadores){
             jogadores = new ArrayList<>();


        for (int i = 0;
             i < nomesJogadores.size() ; i++){
            Jogador jogador = new Jogador();
            jogador.setNome(nomesJogadores.get(i));

            jogadores.add(jogador);

        }
    }



    public void jogar(){
        for (int i = 0; i < jogadores.size(); i++){
            Dado dado1 = new Dado();
            Dado dado2 = new Dado();
            dado1.lancar();
            dado2.lancar();

            jogadores.get(i).setTotalPontos(dado1.getFace() + dado2.getFace());
            boolean venceu = jogadores.get(i).getTotalPontos() == 7;
            jogadores.get(i).setVenceu(venceu);


      }


    }

    /** ToString */

    @Override
    public String toString() {
        return "Tabuleiro{" +
                "jogadores=" + jogadores +
                '}';
    }


}
