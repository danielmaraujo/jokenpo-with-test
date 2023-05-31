import br.edu.iff.Jokenpo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JokenpoTest {

    private Jokenpo jokenpo;

    @BeforeEach
    public void setUp() {
        jokenpo = new Jokenpo();
    }

    @Test
    public void testInformarJogador1() {
        jokenpo.informarEscolhaJogador1("Pedra");
        Assertions.assertEquals("Pedra", jokenpo.getJogador1());
    }

    @Test
    public void testInformarJogador2() {
        jokenpo.informarEscolhaJogador2("Pedra");
        Assertions.assertEquals("Pedra", jokenpo.getJogador2());
    }

    @Test
    public void testVerificarResultadoEmpate() {
        jokenpo.informarEscolhaJogador1("Pedra");
        jokenpo.informarEscolhaJogador2("Pedra");
        Assertions.assertEquals("Empate", jokenpo.verificarResultado());
    }

    @Test
    public void testVerificarResultadoJogador1Venceu() {
        jokenpo.informarEscolhaJogador1("Pedra");
        jokenpo.informarEscolhaJogador2("Tesoura");
        Assertions.assertEquals("Jogador 1 venceu", jokenpo.verificarResultado());
    }

    @Test
    public void testVerificarResultadoJogador2Venceu() {
        jokenpo.informarEscolhaJogador1("Papel");
        jokenpo.informarEscolhaJogador2("Tesoura");
        Assertions.assertEquals("Jogador 2 venceu", jokenpo.verificarResultado());
    }

    @Test
    public void testVerificarResultadoOpcaoInvalida() {
        jokenpo.informarEscolhaJogador1("Pedra");
        jokenpo.informarEscolhaJogador2("Tijolo"); // Opção inválida
        Assertions.assertThrows(IllegalStateException.class, () -> jokenpo.verificarResultado());
    }
}
