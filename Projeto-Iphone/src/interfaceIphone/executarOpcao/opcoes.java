package interfaceiphone.executarOpcao;

import interfaceiphone.aparelho.aparelhoTelefonico;
import interfaceiphone.navegador.navegadorInternet;
import interfaceiphone.reprodutor.reprodutorMusicas;

public class opcoes implements aparelhoTelefonico,reprodutorMusicas,navegadorInternet{
    public void ligar(){
        System.out.println("\nFazendo  Ligação....\n");
    }
    @Override
    public void atender(){
        System.out.println("\nAtendendo Ligação...\n");
    }
    @Override
    public void iniciarCorrerioVoz(){
        System.out.println("\nIniciando Chamada do Correio de Voz...\n");
    }

    @Override
    public void tocar(){
        System.out.println ("\nTocando Música... \n");
    }
    @Override
    public void pausar(){
        System.out.println("\nPausando Música...\n");
    }
    @Override
    public void selecionarMusica(){
        System.out.println("\nSelecionando Músicas...\n");
    }

    @Override
    public void exibirPagina(){
        System.out.println("\nExibindo Página Aberta...\n");
    }
    @Override
    public void adicionarNovaAba(){
        System.out.println("\nAdicionar Nova Aba....\n"); 
    }
    @Override
    public void atualizarPagina(){
        System.out.println("\nAtualizando Página...\n"); 
    }

   
}