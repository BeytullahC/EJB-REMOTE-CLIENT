/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testejbweb;

import com.mycompany.NewSessionBeanLocal;
import com.mycompany.NewSessionBeanRemote;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Belgelerim
 */
@ManagedBean
@RequestScoped
public class NewJSFManagedBean {

    @EJB(mappedName = "newSessionBean")
    private NewSessionBeanRemote newSessionBean;

    @PostConstruct
    public void init() {
      
    }

    
    public void test(){
        newSessionBean.businessMethod();
    }
}
