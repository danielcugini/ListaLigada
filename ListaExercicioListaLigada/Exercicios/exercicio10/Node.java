package exercicio10;

public class Node {
    private int x;
    private Node prox;

    public Node(int valor){
        x = valor;
        prox = null;
    }

    public void setX(int valor){
        x = valor;
    }

    public int getX(){
        return x;
    }

    public void setProx(Node n){
        prox = n;

    }

    public Node getProx(){
        return prox;
    }
    
}
