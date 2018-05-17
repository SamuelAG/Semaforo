package Semaforo;

public class Semaforo {
    private Estado estadoAtual;

    public void aguanambi(){
        System.out.println(estadoAtual.getEstado());
        while(true){
            delay(25000);
            this.trocar_Verde();
            System.out.println(estadoAtual.getEstado());
            delay(25000);
            this.trocar_Amarelo();
            System.out.println(estadoAtual.getEstado());
            delay(5000);
            this.trocar_Vermelho();
            System.out.println(estadoAtual.getEstado());
        }
    }

    public Semaforo(){
        this.estadoAtual = new SinalVermelho();
    }

    public void trocar_Vermelho() {
        estadoAtual = estadoAtual.trocar_Vermelho();
    }


    public void trocar_Amarelo() {
        estadoAtual = estadoAtual.trocar_Amarelo();
    }


    public void trocar_Verde() {
        estadoAtual = estadoAtual.trocar_Verde();
    }


    public EstadoSemaforo getEstado() {
        return estadoAtual.getEstado();
    }

    public void delay(int delay){
        try {
            Thread.sleep(delay);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
