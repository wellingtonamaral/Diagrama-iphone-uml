package equipamento.aplicativos;

import equipamento.comportamentos.AparelhoTelefonico;

public class Phone implements AparelhoTelefonico {

    @Override
    public void ligar() {
        System.out.println("Phone: Fazendo ligação...");
    }

    @Override
    public void atender() {
        System.out.println("Phone: Atendendo ligação...");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Phone: Iniciando Correio de voz...");
    }

}