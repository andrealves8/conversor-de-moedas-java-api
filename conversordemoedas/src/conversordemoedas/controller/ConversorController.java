package conversordemoedas.controller;

import conversordemoedas.model.ConversorModel;
import conversordemoedas.view.ConversorView;

import java.io.IOException;
import java.util.Scanner;

/**
 * Controlador que gerencia a lógica da aplicação.
 * Faz a mediação entre a View e o Model.
 */
public class ConversorController {

    private final ConversorView view = new ConversorView(); // interface com o usuário
    private final Scanner leitura = new Scanner(System.in); // entrada de dados

    /**
     * Inicia o loop principal do sistema.
     */
    public void executar() {
        while (true) {
            view.exibirMenu(); // mostra as opções de conversão
            int opcao = leitura.nextInt();

            // Finaliza o programa se a opção for 7
            if (opcao == 7) {
                view.exibirMensagem("Programa finalizado!");
                break;
            }

            // Valida opções inválidas
            if (opcao < 1 || opcao > 7) {
                view.exibirMensagem("Opção inválida, tente novamente.\n");
                continue;
            }

            view.exibirMensagem("Digite o valor que deseja converter:");
            double valorOriginal = leitura.nextDouble();

            // Executa a conversão usando o Model
            try {
                ConversorModel model = new ConversorModel(opcao, valorOriginal);
                view.exibirResultado(model.getValorFinal());
            } catch (IOException | InterruptedException e) {
                view.exibirMensagem("Erro ao acessar o serviço de conversão.");
            }
        }
    }
}
