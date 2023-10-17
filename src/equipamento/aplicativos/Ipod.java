package equipamento.aplicativos;

import equipamento.comportamentos.ReprodutorMusical;

public class Ipod implements ReprodutorMusical {

    @Override
    public void tocar() {

        System.out.println("iPod: Tocando música...");

    }

    @Override
    public void pausar() {
        System.out.println("iPod: Pausando música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("iPod: Seleciondo música...");
    }

}