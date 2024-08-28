package exercicio05;



public class Lista {
    private Node inicio, fim;

    public Lista(){
        inicio = fim = null;
    }

    public void add(int valor){
        if(inicio!=null){
            fim.setProx(new Node(valor));
            fim = fim.getProx();

        }
        else{
            inicio = fim = new Node(valor);//fim aponta para o último nó da lista
        }
    }

    public void show(){
        Node aux = inicio;

        while(aux!=null){    
            System.out.println(aux.getX());
            aux = aux.getProx();
        }
    }

    public void doubleX(){
        Node aux = inicio;

        while(aux!=null){  
            System.out.println(aux.getX()*2);
            aux = aux.getProx();
        }
        
    }   
    
}
