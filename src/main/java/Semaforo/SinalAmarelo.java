package Semaforo;

public class SinalAmarelo implements Estado {
    @Override
    public Estado trocar_Vermelho() {
        return new SinalVermelho();
    }

    @Override
    public Estado trocar_Amarelo() {
        return this;
    }

    @Override
    public Estado trocar_Verde() {
        return this;
    }

    @Override
    public EstadoSemaforo getEstado() {
        return EstadoSemaforo.AMARELO;
    }
}
