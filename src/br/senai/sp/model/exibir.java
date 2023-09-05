package br.senai.sp.model;

public class exibir {

    public void exibirQuadrado(quadrado objquadrado){

        System.out.println("=============================");

        System.out.println("O lado informado é: "+objquadrado.lado1);
        System.out.println("O lado informado é: "+objquadrado.lado2);
        System.out.println("=============================");
        System.out.println("A area calculada é: "+objquadrado.calcularArea());
        System.out.println("O perimetro calculado é: "+objquadrado.calcularPerimetro());

        System.out.println("=============================");


    }
    public void exibirCirculo(circulo objCirculo){
        System.out.println("=============================");
        System.out.println("O raio informado é: " + objCirculo.raio);
        System.out.println("------------------------------------------------");
        System.out.println("A area calculada é: " + objCirculo.calcularArea());
        System.out.println("O perimetro calculado é: " + objCirculo.calcularPerimetro());
        System.out.println("=============================");
    }
    public void exibirRetangulo(retangulo objRetangulo){

        System.out.println("=============================");
        System.out.println("O lado 1 informado é: " + objRetangulo.lado1);
        System.out.println("O lado 2 informado é: " + objRetangulo.lado2);
        System.out.println("------------------------------------------------");
        System.out.println("A area calculada é: " + objRetangulo.calcularArea());
        System.out.println("O perimetro calculado é: " + objRetangulo.calcularPerimetro());
        System.out.println("=============================");
    }
    public void exibirTriangulo(triangulo objTriangulo){

        System.out.println("=============================");
        System.out.println("A base informado é: " + objTriangulo.base);
        System.out.println("A altura informado é: " + objTriangulo.altura);
        System.out.println("------------------------------------------------");
        System.out.println("A area calculada é: " + objTriangulo.calcularArea());
        System.out.println("O perimetro calculado é: " + objTriangulo.calcularPerimetro());
        System.out.println("=============================");
    }
}
