/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spprfull;

/**
 *
 * @author Da-pro
 */
public interface Damage {
    
    public void getStructureDamageValue(Double brokeQuantity, Double allQuantity);
    public void getFunctionalDamageValue(Double functionQuantity, Double allQuantity); 
    
}
