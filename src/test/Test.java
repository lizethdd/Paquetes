package test;

//import com.ceep.*;
//import com.ceep.Funcionalidad;
import static com.ceep.Funcionalidad.imprimir;

public class Test {

    public static void main(String[] args) {
        //Funcionalidad.imprimir("Saludos");
        //imprimir("Adiós");

    }

    public void imprimir(Object matriz[][]) {
        for (var i = 0; i < matriz.length; i++) {
            for (var j = 0; j < matriz[i].length; j++) {
                System.out.println("Matriz [" + i + "] [" + j + "] = "
                        + matriz[i][j]);
            }
        }
    }

}
