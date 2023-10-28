package interfaceIphone;


import java.util.Scanner;

import interfaceIphone.executarOpcao.opcoes;

public class iphone {
    /**
     * @param args
     */
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            opcoes dados = new opcoes();
            boolean continuar = true;
            boolean continuar2 = true;
            do{
                System.out.print("\nDigite 1 para Repodutor Musicial - Digite 2 Aparelho Telefônico - Digite 3 para Navegador na Internet - Digite 4 para Sair\n");
                 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                int numero = scanner.nextInt();
                if (numero == 4) {
                    continuar = false;
                    continue;
                }
                if(numero == 1){
                 
                    do{
                        System.out.println("\nvocê está no  Reprodutor de  Musica. Por favor, selecione sua opção\n");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.print("Selecione a opção desejada:  1 Para Tocar, 2 Para Pausar, 3 Para SelecionarMusica -Digite 4 para voltar ao Menu Principal!\n");
                        int numero1 = scanner.nextInt();
                        if (numero1 == 4) {
                            continuar2 = false;
                            continue;
                        }

                        if(numero1 == 1){
                           dados.tocar();  
                        }
                        else if( numero1 == 2){
                            dados.pausar();  
                        }
                        else if(numero1 == 3){
                            dados.selecionarMusica();
                        }
                    }while(continuar2);           
                }
                else if( numero ==2 ){ 
                    do{
                        System.out.print("\nVocê está no menu de opção do Aparelho Telefônico:. Por favor, selecione sua opção\n");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("Selecione a opção desejada:  1 Para Ligar, 2 Para Atender, 3 Para Iniciar Correio de Voz -Digite 4 para voltar ao Menu Principal!\n");
                        int numero2 = scanner.nextInt();
                        if (numero2 == 4) {
                            continuar2 = false;
                            continue;
                        }
                        if(numero2 == 1){
                            dados.ligar();
                        }
                        else if(numero2 == 2){
                            dados.atender();
                        }  
                        else if(numero2 == 3){
                            dados.iniciarCorrerioVoz();
                        } 
                    }while(continuar2);         
                }  
                if(numero == 3){  
                    do{   
                        System.out.print("\nVocê esta no menu de opção do Aparelho Telefônico:. Por favor, selecione sua opção\n");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("Selecione a opção desejada:  1 Para Exibir Página, 2 Para Abrir Nova Aba, 3 Para Atualizar Página -Digite 4 para voltar ao Menu Principal!\n");
                        int numero3 = scanner.nextInt();
                        if (numero3 == 4) {
                            continuar2 = false;
                            continue;
                        }

                        if(numero3 == 1){
                            dados.exibirPagina();
                            
                        }
                        else if(numero3 == 2){
                            dados.adicionarNovaAba();
                        }      
                        else if(numero3 == 3){
                            dados.atualizarPagina();
                        } 
                    }while(continuar2);                                         
               }
            }while(continuar);       
        }
    }
}