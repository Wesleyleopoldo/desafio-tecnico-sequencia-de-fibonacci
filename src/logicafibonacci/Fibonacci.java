package logicafibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    // Método que verifica se o número pertence a sequência...
    public String verificarNumero(Integer numeroVerificado) {
        // Crio um Array para que ele fique adicionando os números na sequência...
        List<Integer> sequenciaDeFibonacci = new ArrayList<Integer>();
        // Aqui eu coloco a soma dos dois números e depois adiciono no Array...
        Integer numerosSomados;
        // Aqui é a mensagem que será retornada como tem uma condicional no final é quase impossível ela retornar vázia...
        String mensagemDeRetorno = "";


        // Aqui já adiciono dois números iniciais para somente somar eles dentro do laço de repetição...
        sequenciaDeFibonacci.add(0);
        sequenciaDeFibonacci.add(1);
        // Laço de Repetição primeiro ele cria uma lista do tamanho do @numeroVerificado...
        for(int posicao = 1;posicao <= numeroVerificado; posicao ++) {
            numerosSomados = sequenciaDeFibonacci.get(posicao - 1) + sequenciaDeFibonacci.get(posicao);
            sequenciaDeFibonacci.add(numerosSomados);
        }

        // Já aqui é para ele percorrer a lista e verificar se o número existe no Array...
        for(int posicao = 0; posicao < sequenciaDeFibonacci.size(); posicao ++) {
            if(numeroVerificado == sequenciaDeFibonacci.get(posicao)) {
                mensagemDeRetorno = "Esse número pertence a sequência!!!";
                System.out.println(sequenciaDeFibonacci);
                break;
            } else {
                mensagemDeRetorno = "Esse número não pertence a sequência!!!";
            }
        }
        return mensagemDeRetorno;
    }
}
