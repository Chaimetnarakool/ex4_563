/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converttempclient;

import beans.convertBeanRemote;
import java.util.Scanner;

/**
 *
 * @author Nai
 */
public class Main {

    @javax.ejb.EJB
    private static convertBeanRemote convertBean;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter degree in Fahrenheit : ");
        double F = sc.nextDouble();
        System.out.println(F + "Fahrenheit = " + convertBean.fToC(F));
        // TODO code application logic here
    }
    
}
