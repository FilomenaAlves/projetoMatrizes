
import Classes.Matriz;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author Ronaldo
 */
public class TesteMatrizes {

    public static void main(String[] args) {

        /*int mtx1[][] = new int[2][2];
         int mtx2[][] = new int[2][2];

         mtx1[0][0] = 1;
         mtx1[0][1] = 2;
         mtx1[1][0] = 3;
         mtx1[1][1] = 4;

         mtx2[0][0] = -1;
         mtx2[0][1] = 3;
         mtx2[1][0] = 4;
         mtx2[1][1] = 2;


         matrixMultiply(mtx1, mtx2);*/
        
        try{
        Matriz matriz = new Matriz();
        int p[] = {30, 35, 15,5,10,20, 25};

        // Matriz.MatrixChainOrder(p);
        //matriz.memoizedMatrixChain(p);
        matriz.inicializaRecursiveMatrixChain(p);
        matriz.recursiveMatrixChain(p, 0, p.length-2);

        System.out.println(matriz.getM()[0][5]);
        System.out.println(matriz.getS()[0][5]);
        }
        catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
                    
        }








    }
}
