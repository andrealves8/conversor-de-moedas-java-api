package conversordemoedas.view;

public class ConversorView {

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

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void exibirResultado(double valorFinal) {
        System.out.printf("Resultado da conversão: %.6f%n%n", valorFinal);
    }
}
