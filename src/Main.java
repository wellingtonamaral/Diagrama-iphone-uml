import equipamento.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        System.out.println("IPHONE INICIALIZANDO... \n");

        System.out.println("APARELHO TELÊFONICO: \n");

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioDeVoz();

        System.out.println("\nNAVEGADOR NA INTERNET: \n");

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println("\nREPRODUTOR MUSICAL: \n");

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

    }
}