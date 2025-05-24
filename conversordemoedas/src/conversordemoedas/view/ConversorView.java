package conversordemoedas.view;

/**
 * Classe responsável pela interface com o usuário.
 * Somente exibe informações e lê entradas.
 */
public class ConversorView {

    /**
     * Exibe o menu de opções para o usuário.
     */
    public void exibirMenu() {
        System.out.println("""
            *************************************************
            Olá, seja bem-vindo/a ao Conversor de Moeda!
            
            1) Dólar =>> Real
            2) Real =>> Dólar
            3) Euro =>> Real
            4) Peso Argentino =>> Dólar
            5) Real =>> Peso Argentino
            6) Dólar =>> Iene
            7) Sair
            
            Escolha uma opção válida:
            *************************************************
        """);
    }

    /**
     * Exibe mensagens genéricas ao usuário.
     * @param mensagem Texto a ser mostrado.
     */
    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    /**
     * Exibe o resultado da conversão.
     * @param valorFinal Resultado convertido.
     */
    public void exibirResultado(double valorFinal) {
        System.out.printf("Resultado da conversão: %.6f%n%n", valorFinal);
    }
}
