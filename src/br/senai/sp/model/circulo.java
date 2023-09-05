package br.senai.sp.model;

public class circulo {

    double raio;

    public double calcularArea(){

        double area = Math.PI * (raio * raio);
        return area;
    }

    public double calcularPerimetro(){

        double perimetro = 2 + Math.PI + raio;
        return perimetro;
    }
}
