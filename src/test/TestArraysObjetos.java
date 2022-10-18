
package test;

import domain.Persona;
import static java.lang.module.ModuleDescriptor.read;
import static javax.imageio.ImageIO.read;

public class TestArraysObjetos {
    public static void main(String [] args){
        Persona personas[] = new Persona[2];
        
        personas[0] = new Persona("Kim");
        personas[1] = new Persona("Seungmin");
        
        //System.out.println("Personas[0] = "+personas[0]);
        //System.out.println("Personas[1] = "+personas[1]);
    
        //VISUALIZAR 
        System.out.println("Introduce el nombre de cada  una de las personas de "
                + "tu listado.");
        for(var i=0; i<personas.length; i++){
            System.out.println("Personas["+i+" ] = ");
            //personas[i] = new Persona(read.nextLine());
            System.out.println(personas[i]);
        }
    }
}
