package estruturaDeDados;

public class EstruturaEstetica<T> {
    public T[] elemento;
    public int tamanho;

    // Construtor com parâmetro
    public EstruturaEstetica(int capacidade) {
        this.elemento = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    // Construtor sem parâmetros
    public EstruturaEstetica() {
        this(10);
    }

    // Método para adicionar elemento
    public boolean adiciona(T elemento) {
        if (this.tamanho < this.elemento.length) {
            this.elemento[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }
}

    // metodo para adicionar em qualquer posição
    public boolean adiciona(int posicao, T elemento){
        if (! (posicao >=0 && posiçao <tamanho)){
            throw new IllegalAccessException("Posição invalida")
        
    }

    this.elementos[ posicao] = elemento;
    this.tamanho++;
    return false;
}

   // metodo para aumentar a capacidade do vetor
   public void aumentaCapacidade(){
    if (this.tamanho == this.elementos.length) {
        T[] elementosNovos = (T[]) new Object [ this.elementos.length * 2];
        for (int i=0; i<this.elemento.length; i++) {
            elementosNovos[i] = this.elemento[i];

        }
        this.elementos = elementosNovos;
     }
    }

    public int tamanho (){
        return this.tamanho;
    }
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");

        for(int i =0; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");

        }
        if (this.tamanho> 0){
            s.append(this.elementos[this.tamanho-1]);
        }
        s.append("]");
        return s.toString();
    
    }
    public boolean estaVazia(){
        return this.tamanho == 0;
    }
    public void remove(int posicao){
        if(!(posicao >=0 && posicao < tamanho)){
            throw new IllegalArgumentException("Pposição Inválida");

        }
        for (int i= posicao; i<tamanho-1; i++){
            elementos[1] = elementos[i+1];
        }
        tamanho --;
}

// revisar erros