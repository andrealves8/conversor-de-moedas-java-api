package conversordemoedas.controller;

import conversordemoedas.model.ConversorModel;
import conversordemoedas.view.ConversorView;

import java.io.IOException;
import java.util.Scanner;

public class ConversorController {

    private final ConversorView view = new ConversorView();
    private final Scanner leitura = new Scanner(System.in);

    public void executar() {
        while (true) {
            view.exibirMenu();
            int opcao = leitura.nextInt();

            if (opcao == 7) {
                view.exibirMensagem("Programa finalizado!");
                break;
            }

            if (opcao < 1 || opcao > 7) {
                view.exibirMensagem("Opção inválida, tente novamente.\n");
                continue;
            }

            view.exibirMensagem("Digite o valor que deseja converter:");
            double valorOriginal = leitura.nextDouble();

            try {
                ConversorModel model = new ConversorModel(opcao, valorOriginal);
                view.exibirResultado(model.getValorFinal());
            } catch (IOException | InterruptedException e) {
                view.exibirMensagem("Erro ao acessar o serviço de conversão.");
            }
        }
    }
}
