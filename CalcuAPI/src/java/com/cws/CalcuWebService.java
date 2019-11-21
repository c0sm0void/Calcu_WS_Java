/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author root
 */
@WebService(serviceName = "CalcuWebService")
public class CalcuWebService {

    /**
     * This is a sample web service operation
     */
       
    @WebMethod(operationName = "add")
    public int add(int a, int b) {
        return (a + b);
    }
    @WebMethod(operationName = "sub")
    public int sub(int a, int b) {
        return (a - b);
    }
    @WebMethod(operationName = "mul")
    public int mul(int a, int b) {
        return (a * b);
    }
    @WebMethod(operationName = "div")
    public int div(int a, int b) {
        return (a / b);
    }
}
