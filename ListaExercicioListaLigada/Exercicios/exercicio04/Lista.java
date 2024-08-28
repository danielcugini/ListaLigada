package exercicio04;

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

    public int menor(){
        int menor = 0;
        Node aux = inicio;

        menor = aux.getX();//Colocar dentro do Loop na subtração, apenas os números da classe app forem negativos. Pq menor está inicializado com zero
        while(aux!=null){    
        if(aux.getX() < menor){
           
        }
            aux = aux.getProx();
        }
        return menor;
    }   
    
}
