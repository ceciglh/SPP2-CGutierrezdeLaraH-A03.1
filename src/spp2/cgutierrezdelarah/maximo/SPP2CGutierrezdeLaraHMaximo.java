/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.cgutierrezdelarah.maximo;
import java.util.*;
/**
 *Mayor numero entre dos valores
 * @author alumno
 */
public class SPP2CGutierrezdeLaraHMaximo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner (System.in);
        int n1,n2;
        System.out.println("Introduce el primer numero");
        n1=sc.nextInt();
        System.out.println("Introduce el segundo numero");
        n2=sc.nextInt();
        System.out.println("El mayor numero de los dos es" +Math.max(n1,n2));
        
    }
    
}
