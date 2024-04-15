/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.finlogic.repositoryImpl;

import com.finlogic.database.SqlUtility;
import com.finlogic.model.EntiryModel;
import com.finlogic.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author admin
 */
public class StudentRepositoryImpl implements StudentRepository{

    @Autowired
    SqlUtility sqlUtility;
    @Override
    public int addStudent(EntiryModel em) {
       StringBuilder sql=new StringBuilder("insert into student values('");
       sql.append(em.getId()).append("','");
       sql.append(em.getName()).append("','");
       sql.append(em.getStandard()).append("','");
       sql.append(em.getCity()).append("','");
       sql.append(em.getPincode()).append("','");
       
       int success=sqlUtility.parsist(sql.toString());
       return success;
    }
    
}
