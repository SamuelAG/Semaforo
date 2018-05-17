package Semaforo;

public class SinalVerde implements Estado {
    @Override
    public Estado trocar_Vermelho() {
        return this;
    }

    @Override
    public Estado trocar_Amarelo() {
        return new SinalAmarelo();
    }

    @Override
    public Estado trocar_Verde() {
        return this;
    }

    @Override
    public EstadoSemaforo getEstado() {
        return EstadoSemaforo.VERDE;
    }
}
