package Semaforo;

public class SinalVermelho implements Estado {
    @Override
    public Estado trocar_Vermelho() {
        return this;
    }

    @Override
    public Estado trocar_Amarelo() {
        return this;
    }

    @Override
    public Estado trocar_Verde() {
        return new SinalVerde();
    }

    @Override
    public EstadoSemaforo getEstado() {
        return EstadoSemaforo.VERMELHO;
    }
}
