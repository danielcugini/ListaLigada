package exercicio06;

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

        public int posicao(int pos){
            Node aux = inicio;
            int p=0, resposta = -9999;

            while(aux!=null){    
                if(p == pos)  {
                resposta = aux.getX();
                break;
            }
             p++;
             aux = aux.getProx();

        }
             return resposta;
    }
    
} 
