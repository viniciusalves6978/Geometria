package br.senai.sp.model;

import java.util.Scanner;

public class triangulo {

    public double altura, base;

    public double calcularArea(){

        double area = (base * altura) / 2;
        return area;
    }
    public double calcularPerimetro(){

        double perimetro = altura * 2 + base;
        return perimetro;

    }
}
