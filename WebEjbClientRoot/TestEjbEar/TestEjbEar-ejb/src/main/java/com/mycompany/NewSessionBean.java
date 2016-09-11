/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.util.Date;
import javax.ejb.Stateless;

/**
 *
 * @author Belgelerim
 */
@Stateless(name = "newSessionBean",mappedName = "newSessionBean",description = "test ejb for remote Clients")
public class NewSessionBean implements NewSessionBeanRemote, NewSessionBeanLocal {

    @Override
    public void businessMethod() {
        System.out.println(new Date());
    }
}
