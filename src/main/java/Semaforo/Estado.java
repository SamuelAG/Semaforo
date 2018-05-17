package Semaforo;

public interface Estado {
    Estado trocar_Vermelho();
    Estado trocar_Amarelo();
    Estado trocar_Verde();
    EstadoSemaforo getEstado();
}
