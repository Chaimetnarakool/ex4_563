/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Stateless;

/**
 *
 * @author Nai
 */
@Stateless
public class convertBean implements convertBeanRemote {

    @Override
    public double fToC(double F) {
        double C;
        return C = (5.0/9.0) * (F -32);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
