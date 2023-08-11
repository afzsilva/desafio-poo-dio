package aparelhotelefonico;

public class AparelhoIphone extends AparelhoTelefonico implements MensagemAudio{

    @Override
    public void ligar() {
        System.out.println("Ligando iphone...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligacao...");
    }


    @Override
    public void iniciaCorreioVoz() {
        System.out.println("Iniciando mensagem de voz...");

    }
}


