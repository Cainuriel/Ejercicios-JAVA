package controldacces;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Superlopez
 */
public class ControlDAcces {

   public static ArrayList<Usuarios> listanegra= new ArrayList<>();
     public static ArrayList<Usuarios> asistencia= new ArrayList<>();
     private final int AFORO=340;
     
   Usuarios u1 = new Usuarios(1);
    Usuarios u2 = new Usuarios(2);
    Usuarios u3 = new Usuarios(3);
    Usuarios u4 = new Usuarios(4);
  
    

    

/**
 * Afegeix un usuari a la llista d'usuaris Que tenen l'entrada prohibida al
 * recinte.
 *
 * @ Param id Identificador de l'usuari.
 */
public void vetaUsuari (Usuarios ticket)  {
    
 listanegra.add(u1);
 listanegra.add(u3);
 listanegra.add(ticket);
 
 
 
}
/**
* Per saber si un usuari pot entrar al recinte.
*
* L'usuari pot entrar si
* 1. no és a la llista d'usuaris vetats i
* 2. no s'ha assolit l'aforament del recinte.
*
* Si l'usuari finalment pot entrar, s'afegeix
* A la llista d'usuaris que es troben dins del recinte.
*
* @ Param id Identificador de l'usuari.
* @ Return true si l'usuari pot entrar;
* False en cas contrari.
*/
public boolean entraUsuari (Usuarios ticket) {
    asistencia.add(u2);
    asistencia.add(u4);
    int i;
    for (i=0; i<listanegra.size();i++)
        
        if (ticket==listanegra.get(i)) {}
            
            else
            
         if   (asistencia.size()==AFORO) {}
    return false;
                
         
    
    
   return
    
}

/*Es demana codificar la classe ControlDAcces:
1. Camps o atributs necessaris
2. Constructor de la classe ControlDAcces
3. Mètode vetaUsuari ()
4. Mètode entraUsuari ()*/
    
    public static void main(String[] args) {
        // TODO code application logic here

//Nota: l'aforament del recinte és de 340 usuaris. Codifiqueu-lo com una constant.    

 Scanner sc = new Scanner(System.in);
 
 System.out.println("Por favor, identifiquese");
   int portero = sc.nextInt();

getEntrada()==portero;

entraUsuari(Usuarios);

System.err.println("ENTRADA PROHIBIDA ¡¡LLAMEN A SEGURIDAD!!");
            

}
    
}
