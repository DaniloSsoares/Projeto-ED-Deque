
import dequeEstrutura.DequeEncadeado;
import dequeEstrutura.DequeLinear;
import filaEstrutura.FilaCircular;

public class App {
    public static void main(String[] args) throws Exception {
        //Teste com o Deque Composto
        DequeEncadeado dequeEncadeado = new DequeEncadeado();
        System.out.println("----------------------------------------------");
        System.out.println("Deque Encadeado");
        System.out.println("Add no Inicio :");
        dequeEncadeado.EnqueueL("A");
        dequeEncadeado.EnqueueL("B");
        dequeEncadeado.EnqueueL("C");
        dequeEncadeado.imprime();
        System.out.println("----------------------------------------------");
        System.out.println("Add no Final:");
        dequeEncadeado.EnqueueR("D");
        dequeEncadeado.imprime();

        System.out.println("----------------------------------------------");
        System.out.println("Tirando dados com o Deque Encadeado Esquerdo");
        dequeEncadeado.DequeueL();
        dequeEncadeado.imprime();
        System.out.println("Tirando dados com o Deque Encadeado Direito");
        dequeEncadeado.DequeueR();
        dequeEncadeado.imprime();
        System.out.println("----------------------------------------------");

        System.out.println("\n");
        System.out.println("\n");
        

        DequeLinear dequeLinear = new DequeLinear();
        System.out.println("----------------------------------------------");
        System.out.println("Deque Linear Direita");
        dequeLinear.enfileiraD("1");  
        dequeLinear.enfileiraD("2"); 
        dequeLinear.enfileiraD("3"); 
        dequeLinear.imprime();
        System.out.println("Deque Linear Esquerda");
        dequeLinear.enfileiraE("5");
        dequeLinear.imprime();
        
        System.out.println("----------------------------------------------");
        System.out.println("Tirar Deque (FIFO)");
        dequeLinear.desenfileiraD();
        dequeLinear.imprime();
        System.out.println("----------------------------------------------");
        System.out.println("Tirar Deque");
        dequeLinear.desenfileiraD();
        dequeLinear.imprime();
        System.out.println("----------------------------------------------");
        dequeLinear.enfileiraD("6"); 
        dequeLinear.enfileiraD("7"); 
        dequeLinear.enfileiraD("8"); 
        dequeLinear.imprime();

        FilaCircular filazinha = new FilaCircular();
        System.out.println("----------------------------------------------");
        System.out.println("Fila Circular");
        System.out.println("Está cheio?" +filazinha.cheio());
        System.out.println("Está vazio?" +filazinha.Vazio());

        System.out.println("----------------------------------------------");
        filazinha.enfileirar("A");
        filazinha.enfileirar("B");
        filazinha.enfileirar("C");
        filazinha.imprimir();

        System.out.println("\n");
        System.out.println("----------------------------------------------");
        System.out.println("Está cheio? " +filazinha.cheio());
        System.out.println("Está vazio? " +filazinha.Vazio());

        System.out.println("----------------------------------------------");
        System.out.println("Removido foi: " +filazinha.desenfileirar());
        System.out.println("Removido foi: " +filazinha.desenfileirar());
        filazinha.imprimir();

    }
}