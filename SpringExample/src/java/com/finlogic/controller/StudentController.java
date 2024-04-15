/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.finlogic.controller;

import com.finlogic.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author admin
 */
@RequestMapping("/rest")
public class StudentController {
  @RequestMapping(value = "/test" ,method = RequestMethod.GET)
  public ResponseEntity test(){
      return new ResponseEntity("Api Run Successfull", HttpStatus.OK);
  }
}
