public class vetor {
    private String[] elementos;
    private int tamanho;

    public vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(String elemento) throws Exception {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("O vetor já está cheio, não é possível adicionar novos elementos");
        }
    }

    public static void main(String[] args) {
        // Ponto de entrada da aplicação
    }
}
@Override
public String toString() {
    StringBuilder s = new StringBuilder();
    s.append("[");
    
    for(int i=0; i<this.tamanho-1; i++) {
        s.append(this.elementos[i]);
        s.append(", ");
    }
    
    if (this.tamanho > 0) {
        s.append(this.elementos[this.tamanho-1]);
    }
    
    s.append("]");
    
    return s.toString();
}


