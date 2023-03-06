public class list {
    public static class NODO{
        //armazena o proximo
        public NODO next; 
        //valor no ponto da lista
        public int val; 
        //contrutor 
        public NODO (int x){ 
            val = x; 
            next = null;
        }
    }

    //usado para iniciar a lista
    public NODO init;
    
    //construtor da lista
    public list(){  
        init = null;
    }

    //limpar lista
    public boolean isEmpty(){
        return init == null;
    }
    
    //buscar elementos
    public boolean search( int x){
        for(NODO nodo = init; nodo != null; nodo = nodo.next)
        //caso encontrar elementos
        if (x == nodo.val){
            return true.
        }
        //caso nao
        return false;                     
    }   

    //insercao de elementos
    public void insertInit(int x){ 
        NODO novoNo = new NODO(x);
        //novoNo referencia o inicio antigo
        novoNo.next = init;
        // inicio referenciao novoNo 
        init = novoNo;     
    }
    
    //remove elementos do inicio
    public void removeInit(){
        //remove o primiero elemento e reposiciona o o tamanho
        init = init.next; 
    }
    
    //printar os elemntos da lista
    public String printList(){
        //testar se esta vazia antes de printar
        if(isEmpty()) return "Lista vazia\n"; 
        String str = "Lista Encadeada: ";
        for (NODO nodo = init; nodo != null; nodo = nodo.next)
            str += " "+ nodo.val;
        return str + "\n";
    }
}