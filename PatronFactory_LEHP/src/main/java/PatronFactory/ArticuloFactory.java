/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronFactory;

import patrones.Computadora;
import patrones.Smartphone;
import patrones.Tablet;

/**
 *
 * @author lisseta CORRECTO Y COMPLETO 
 */
public class ArticuloFactory { //Se da el acoplamiento de las clases 
    public static Factory createArticulo (int tipo)
    {
        switch (tipo) 
        {
         
            case Factory.COMPUTADORA_HP:
                return new Computadora ("HP", "Ryzen 6", "Linux",16, true, (float) 32.2);
                
            case Factory.COMPUTADORA_DELL:
                return new Computadora ("DELL", "Intel Inside", "Windows",18, false, (float) 64.2);
            
            case Factory.COMPUTADORA_LENOVO:
                return new Computadora ("lENOVO", "Ryzen 6", "Windows",12, true, (float) 30.0);
                
            case Factory.SMARTPHONE_HUAWEI:
                return new Smartphone("Huawei 20g", 32, 100, "TFT", "iOS", 4);
                
            case Factory.SMARTPHONE_MOTOROLA:
                return new Smartphone("Motorola G7 Play ", 64, 120, "LED", "Android", 4); 
                
            case Factory.SMARTPHONE_XIAOMI:
                return new Smartphone("Redmi Note", 30, 100, "Super PLS", "iOS", 2);  
                
            case Factory.TABLET_SAMSUNG:
                return new Tablet("Samsung GalaxyTab", 32, (float) 64.2,(float) 14.2, false);
                
            case Factory.TABLET_POLAROID:
                return new Tablet("modelo", 18, (float) 32.0, (float) 14.2, true);    
                                                      
            default:
                throw new AssertionError();
        }
        
    }
        
}
