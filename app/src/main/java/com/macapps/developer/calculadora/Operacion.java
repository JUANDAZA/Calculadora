package com.macapps.developer.calculadora;

/**
 * Created by Developer on 30/3/2017.
 */

public class Operacion {


    private double operando1;
    private double operando2;
    private double resultado;
    private int operando;
    public Operacion(){

    }

    public Operacion(double operando1, double operando2, double resultado, int operando) {
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = resultado;
        this.operando = operando;
    }
    public void suma(){
        resultado=operando1+operando2;
    }
    public void resta(){
        resultado=operando1-operando2;

    }
    public void division(){
        try {
            resultado=operando1/operando2;
        }catch (ArithmeticException e){

        }
    }
    public void multiplicacion(){
        resultado=operando1*operando2;
    }

    public double getOperando1() {
        return operando1;
    }

    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }

    public double getOperando2() {
        return operando2;
    }

    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public int getOperando() {
        return operando;
    }

    public void setOperando(int operando) {
        this.operando = operando;
    }




}
