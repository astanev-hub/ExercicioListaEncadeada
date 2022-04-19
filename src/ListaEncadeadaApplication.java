import domain.ListaEncadeada;

import java.util.LinkedList;
import java.util.List;

public class ListaEncadeadaApplication {
    public static void main(String[] args) {
        ListaEncadeada list = new ListaEncadeada();

        list.inserirInicio(3);
        list.inserirInicio(20);
        list.inserirInicio(5);
        list.inserirInicio(1);
        list.inserirFinal(15);

        list.visualizarLista();
        System.out.println("Tamanho total da lista: " + list.contarNodes());

        list.removerNode(20);
        
        list.visualizarLista();
        System.out.println("Tamanho total da lista: " + list.contarNodes());      
        
        list.inserirFinal(8);

        list.visualizarLista();
        System.out.println("Tamanho total da lista: " + list.contarNodes());


        //***********************************
        //Java LinkedList
        LinkedList<String> linkedList = new LinkedList<>(List.of("Valdir","Alexandre","Rubens"));

        //Inserindo
        linkedList.add("aaa");
        linkedList.push("abc");
        linkedList.offer("bgs");
        linkedList.addFirst("asda");
        linkedList.addLast("asda");

        //Consumindo
        linkedList.poll();
        linkedList.remove();
        linkedList.getFirst();
        linkedList.getLast();
        linkedList.pop();



    }
}