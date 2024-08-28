package exercicio08;

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

    public int size(){
        int c = 0;
        Node aux = inicio;

        while(aux!=null){    
            c++;
            aux = aux.getProx();
        }
        return c;
    }   

    public void insere(int valor){
        Node aux = inicio;
        
        System.out.println(valor);
        while(aux!=null){    
            System.out.println(aux.getX());
            aux = aux.getProx();
        }
    }

    public void remove(int pos){
        if(pos < 0 || pos >= size()){
            System.out.println("Posição não existe");
            return;
        }

        if(pos == 0){
            inicio = inicio.getProx();
            if(inicio == null){
                fim = null;
            }
        } else {
            Node aux = inicio;
            for(int i = 0; i < pos - 1; i++){
                aux = aux.getProx();
            }
            aux.setProx(aux.getProx().getProx());
            if(aux.getProx() == null){
                fim = aux;
            }
        }
    }
}