package test;
import domain.Persona;
public class TestMatriz {

    public static void main(String[] args) {
        //DECLARAMOS UNA MATRIZ
        int edades[][] = new int[3][2];
        System.out.println("Edades = " + edades);

        edades[0][0] = 1;
        edades[0][1] = 5;
        edades[1][0] = 7;
        edades[1][1] = 10;
        edades[2][0] = 3;
        edades[2][1] = 15;
        
        //System.out.println("Edades[0][1] = "+edades[0][1]);
        
        //VISUALIZAR
        for(var i=0; i< edades.length; i++){
            for(var j=0; j<edades[i].length; j++){
                System.out.println("Elemento ["+i+"] ["+j+"] = "+
                        edades[i][j]);
            }
        }
        
        String coches[][] = {{"Ford", "Cadillac"}, {"Seat","Opel","Porche"}, {"Lexus", "Mazda"}};
        //MATRICES DE OBJETOS
        Persona personas[][]= new Persona[2][3];
        personas[0][0] = new Persona("Kim");
        personas[0][1] = new Persona("Sunoo");
        
        
    }
}
