package conversordemoedas;

import conversordemoedas.controller.ConversorController;

/**
 * Classe principal que inicia o sistema.
 */
public class ConversorApp {
    public static void main(String[] args) {
        // Cria o controller e inicia a execução da aplicação
        ConversorController controller = new ConversorController();
        controller.executar();
    }
}
