package navegador;

public class Safari extends NavegadorInternet{
    @Override
    public void exibirPagina(String url) {
        System.out.println("Abrindo pagina "+url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova Aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }
}
