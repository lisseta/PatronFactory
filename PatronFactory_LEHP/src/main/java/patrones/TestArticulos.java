/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones;

import PatronFactory.ArticuloFactory;
import PatronFactory.Factory;
import java.util.Scanner;


/**
 *
 * @author lisseta
 */
public class TestArticulos 
{  
    public static void main(String[] args)    
    {
        int eleccion =0;
        Scanner teclado = new Scanner(System.in);
        
        //Se crea el Menu 
        System.out.println("Selecciona el articulo para conocer sus especificaciones");
        System.out.println(Computadora.COMPUTADORA_HP + ") Computadora  HP");
        System.out.println(Computadora.COMPUTADORA_DELL + ") Computadora Dell");
        System.out.println(Computadora.COMPUTADORA_LENOVO + ") Computadora Lenovo");
        System.out.println(Smartphone.SMARTPHONE_XIAOMI + ") Xiami Redmi Note");
        System.out.println(Smartphone.SMARTPHONE_HUAWEI + ") Huawei ");
        System.out.println(Smartphone.SMARTPHONE_MOTOROLA + ") Moto G7 Play");
        System.out.println(Tablet.TABLET_SAMSUNG + ") Tableta GalaxyTab Samsung");
        System.out.println(Tablet.TABLET_POLAROID + ") Tableta PolaridTab");
            
        try {
            System.out.print("Elige el numero ");
            eleccion = teclado.nextInt(); 
            
        } catch (Exception e) {
            System.out.println("Intentalo de nuevo");
        }  
        //Articulo producto = ArtFactory.crearArticulo(seleccion);
        //System.out.println(producto.toString());
        
        Factory articulo = ArticuloFactory.createArticulo(eleccion);
        System.out.println(articulo.toString ());
        
                
    }

    
}
