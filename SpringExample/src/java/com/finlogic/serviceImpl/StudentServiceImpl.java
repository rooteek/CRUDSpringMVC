/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.finlogic.serviceImpl;

import com.finlogic.model.EntiryModel;
import com.finlogic.model.FormModel;
import com.finlogic.repository.StudentRepository;
import com.finlogic.service.StudentService;
import com.finlogic.utils.StudentUtil;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author admin
 */
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository reposito;
    @Override
    public int addStudent(FormModel fm) {
       EntiryModel em = new EntiryModel();
       em=StudentUtil.converts(fm);
       return reposito.addStudent(em);
    }
    
}
