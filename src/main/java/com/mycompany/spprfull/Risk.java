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
public interface Risk {
    
       
public void getStructureRiskValue(Double damageValue, Double probabilityValue);
public void getFunctionalRiskValue(Double damageValue, Double probabilityValue);    
    
}
