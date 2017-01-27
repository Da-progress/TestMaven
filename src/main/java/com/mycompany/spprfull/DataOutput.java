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
public interface DataOutput {
    
    public void getStructureRiskData(String componentID);
    public void getFunctinalRiskData(String componentID);
    public void getStructureDamageData(String componentID);
    public void getFunctinalDamageData(String componentID);
    public void getProbabilityData(String componentID);
    public void getComponentName(String componentID);
    public void getCost(String componentID);
    public void getOperatingDuration(String componentID);
    public void getOperatingMode(String componentID);
}
