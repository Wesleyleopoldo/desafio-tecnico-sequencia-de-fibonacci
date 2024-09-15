package letraprocurada;

public class ProcuraLetra {

    private String palavra;

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String verificaLetra(char letra) {
        boolean contemLetra = this.palavra.chars().anyMatch(c -> c == letra);
        String mensagemDeRetorno = "";

        if(contemLetra) {
            mensagemDeRetorno = "A palavra" + this.palavra + " tem a letra " + letra + "!!!";
        } else {
            mensagemDeRetorno = "A palavra" + this.palavra + " não tem a letra " + letra + "!!!";
        }

        return mensagemDeRetorno;
    }
}
