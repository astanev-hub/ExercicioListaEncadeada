import domain.Node;

public class ListaEncadeada {
    private Node primeiro, ultimo;

    public ListaEncadeada(){
        primeiro = null;
        ultimo = null;
    }

    public boolean listaVazia(){
        //return primeiro == null ? true : false;
        if(this.primeiro == null){
            return true;
        } else {
            return false;
        }
    }

    public void inserirInicio(int elemento) {
        Node newNode = new Node(elemento);

        if(listaVazia()){
            this.ultimo = newNode;
        } else {
            newNode.setProximo(this.primeiro);
        }

        this.primeiro = newNode;
    }

    public void inserirFinal(int elemento) {
        Node newNode = new Node(elemento);

        if(listaVazia())
            this.primeiro = newNode;
        else
            this.ultimo.setProximo(newNode);

        this.ultimo = newNode;
    }

    //REMOVER NODE
    //Implementar um método para remover da lista um elemento informado.
    // Exemplo: Em uma lista com [1,5,20,3,15], quero conseguir remover o elemento "20"
    // A lista deverá continuar sendo impressa, excluindo apenas o elemento informado.

    //REMOVER NODE

    public int contarNodes() {
        int tamanho = 0;
        Node nodeTemp = primeiro;

        while (nodeTemp != null) {
            tamanho = tamanho + 1;
            nodeTemp = nodeTemp.getProximo();
        }

        return tamanho;
    }

    public void visualizarLista() {
        Node nodeTemp = primeiro;

        while (nodeTemp != null){
            System.out.println("Elemento " + nodeTemp.getElemento());
            nodeTemp = nodeTemp.getProximo();
        }
    }
}