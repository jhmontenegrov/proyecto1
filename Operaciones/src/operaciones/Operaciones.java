/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;


public class Operaciones {
/**
 * 
 * @param x recibe  un valor que debe ser de tipo double que debe ser ingresado por el usuario
 * @param y recibe un valor tipo double, el usuario debe digitarlo en el campo de texto
 * @return la suma de las variables que de dieron para x,y.
 */
   public static double sumar(double x,double y)
   {
   double z;
   z=x+y;
   return z;
   }
    
   /**
    * 
    * @param x recibe  un valor que debe ser de tipo double que debe ser ingresado por el usuario
    * @param y recibe un valor tipo double, el usuario debe digitarlo en el campo de texto
    * @return la resta de las variables x menos y.
    */
   public static double restar(double x,double y)
   {
   double z;
   z=x-y;
   return z;
   }
   
   /**
    * 
    * @param x recibe  un valor que debe ser de tipo double que debe ser ingresado por el usuario
    * @param y recibe un valor tipo double, el usuario debe digitarlo en el campo de texto
    * @return la multiplica de las variables x por y.
    */
   public static double multiplicar(double x,double y)
   {
   double z;
   z=x*y;
   return z;
   }

   /**
    * 
    * @param x recibe  un valor que debe ser de tipo double que debe ser ingresado por el usuario
    * @param y recibe un valor tipo double, el usuario debe digitarlo en el campo de texto
    * @return la división de la variable x sobre y.
    */
   public static double dividir(double x,double y)
   {
   double z;
   z=x/y;
   return z;
   }
   
}
