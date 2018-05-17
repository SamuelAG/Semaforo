import Semaforo.*;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestSemaforo {
    @Test
    public void trocaAmareloVerde() throws Exception {
        Semaforo semaforo = new Semaforo();
        semaforo.trocar_Verde();
        semaforo.trocar_Amarelo();
        semaforo.trocar_Verde();
        assertEquals(EstadoSemaforo.AMARELO,semaforo.getEstado());
    }

    @Test
    public void trocaAmareloVermelho() throws Exception {
        Semaforo semaforo = new Semaforo();
        semaforo.trocar_Verde();
        semaforo.trocar_Amarelo();
        semaforo.trocar_Vermelho();
        assertEquals(EstadoSemaforo.VERMELHO,semaforo.getEstado());
    }

    @Test
    public void trocaVerdeAmarelo() throws Exception {
        Semaforo semaforo = new Semaforo();
        semaforo.trocar_Verde();
        semaforo.trocar_Amarelo();
        assertEquals(EstadoSemaforo.AMARELO,semaforo.getEstado());
    }

    @Test
    public void trocaVerdeVermelho() throws Exception {
        Semaforo semaforo = new Semaforo();
        semaforo.trocar_Verde();
        semaforo.trocar_Vermelho();
        assertEquals(EstadoSemaforo.VERDE,semaforo.getEstado());
    }

    @Test
    public void trocaVermelhoVerde() throws Exception {
        Semaforo semaforo = new Semaforo();
        semaforo.trocar_Verde();
        assertEquals(EstadoSemaforo.VERDE,semaforo.getEstado());
    }

    @Test
    public void trocaVermelhoAmarelo() throws Exception {
        Semaforo semaforo = new Semaforo();
        semaforo.trocar_Amarelo();
        assertEquals(EstadoSemaforo.VERMELHO,semaforo.getEstado());
    }
}
