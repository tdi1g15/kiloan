/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kiloan.factory;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

/**
 *
 * @author Tata
 */
public class PMF {
    private static final PersistenceManagerFactory pmfInstance =
            JDOHelper.getPersistenceManagerFactory("transactions-optional");

    private PMF(){}

    public static PersistenceManagerFactory get(){
        return pmfInstance;
    }
}
