package reprodutormusical;

public class Ipod extends ReprodutorMusical{
    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public void selecionar() {
        System.out.println("Selecionando musica");
    }
}
