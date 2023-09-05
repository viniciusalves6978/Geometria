package br.senai.sp.model;

public class quadrado {

    public double lado1, lado2;

    public double calcularArea(){

        double area = lado1 * lado2;
        return area;
    }

    public double calcularPerimetro() {

        double perimetro = lado1 * 2 + lado2 * 2;
        return perimetro;
    }
}
