package br.edu.iff;

public class Jokenpo {
    private String jogador1;
    private String jogador2;

    public String getJogador1() {
        return jogador1;
    }

    public String getJogador2() {
        return jogador2;
    }

    public void informarEscolhaJogador1(String jogador1) {
        this.jogador1 = jogador1;
    }

    public void informarEscolhaJogador2(String jogador2) {
        this.jogador2 = jogador2;
    }

    public String verificarResultado() {
        if (jogador1.equals(jogador2)) {
            return "Empate";
        } else if (jogador1.equals("Pedra")) {
            if (jogador2.equals("Tesoura")) {
                return "Jogador 1 venceu";
            } else if (jogador2.equals("Papel")) {
                return "Jogador 2 venceu";
            }
        } else if (jogador1.equals("Tesoura")) {
            if (jogador2.equals("Papel")) {
                return "Jogador 1 venceu";
            } else if (jogador2.equals("Pedra")) {
                return "Jogador 2 venceu";
            }
        } else if (jogador1.equals("Papel")) {
            if (jogador2.equals("Pedra")) {
                return "Jogador 1 venceu";
            } else if (jogador2.equals("Tesoura")) {
                return "Jogador 2 venceu";
            }
        }

        throw new IllegalStateException("Algum dos jogadores inseriu uma opção inválida");
    }
}
