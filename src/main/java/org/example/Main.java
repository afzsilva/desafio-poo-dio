package org.example;

import aparelhotelefonico.AparelhoIphone;
import navegador.NavegadorInternet;
import navegador.Safari;
import reprodutormusical.Ipod;
import reprodutormusical.ReprodutorMusical;

public class Main {
    public static void main(String[] args) {


        AparelhoIphone iphone = new AparelhoIphone();
        iphone.ligar();
        iphone.atender();
        iphone.iniciaCorreioVoz();
        System.out.println("--------------------------");


        ReprodutorMusical ipod = new Ipod();
        ipod.selecionar();
        ipod.tocar();
        ipod.pausar();
        System.out.println("--------------------------");

        NavegadorInternet safari = new Safari();
        safari.exibirPagina("https://www.apple.com/");
        safari.atualizarPagina();
        safari.adicionarNovaAba();







    }
}