/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.finlogic.utils;

import com.finlogic.model.EntiryModel;
import com.finlogic.model.FormModel;
import java.util.UUID;

/**
 *
 * @author admin
 */
public class StudentUtil {
    public static EntiryModel converts(FormModel fm){
        EntiryModel em = new EntiryModel();
        em.setId(UUID.randomUUID().toString());
        em.setName(fm.getName());
        em.setCity(fm.getCity());
        em.setStandard(fm.getStandard());
        em.setPincode(Integer.parseInt(fm.getStandard()));
        
        return em;
    }
}
