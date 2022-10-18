
package test;

public class TrabArrays {
    public static void main(String [] args){
        int edades[]= new int[3];
        
        //MODIFICAR ELEMENTOS
        edades[0] = 15;
        System.out.println("Edades 0 = "+edades[0]);
        
        edades[3] = 24;
        
        //RECORRER ARRAY
        for(var i=0; i<edades.length; i++){
            System.out.println("Edades[" +i+ "] ="+edades[i]);
        }
    }
}
