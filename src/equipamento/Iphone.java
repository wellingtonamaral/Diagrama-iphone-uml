package equipamento;

import equipamento.aplicativos.Ipod;
import equipamento.aplicativos.Phone;
import equipamento.aplicativos.Safari;
import equipamento.comportamentos.AparelhoTelefonico;
import equipamento.comportamentos.NavegadorInternet;
import equipamento.comportamentos.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    private Phone phone;
    private Ipod ipod;
    private Safari safari;

    public Iphone() {

        phone = new Phone();
        ipod = new Ipod();
        safari = new Safari();

    }

    @Override
    public void tocar() {
        ipod.tocar();
    }

    @Override
    public void pausar() {
        ipod.pausar();
    }

    @Override
    public void selecionarMusica() {
        ipod.selecionarMusica();
    }

    @Override
    public void exibirPagina() {
        safari.exibirPagina();
    }

    @Override
    public void adicionarNovaAba() {
        safari.adicionarNovaAba();
    }

    @Override
    public void atualizarPagina() {
        safari.atualizarPagina();
    }

    @Override
    public void ligar() {
        phone.ligar();
    }

    @Override
    public void atender() {
        phone.atender();
    }

    @Override
    public void iniciarCorreioDeVoz() {
        phone.iniciarCorreioDeVoz();
    }
}