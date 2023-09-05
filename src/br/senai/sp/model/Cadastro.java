package br.senai.sp.model;

import java.util.Scanner;

public class Cadastro {

    triangulo objTriangulo = new triangulo();
    quadrado objQuadrado = new quadrado();
    circulo objCirculo = new  circulo();
    retangulo objRetangulo = new retangulo();

    Scanner teclado = new Scanner(System.in) ;


    public triangulo cadastrarTriangulo(){
        System.out.println( "---------- Triângulo ----------" );
        System.out.println( "Informar o valor da Base: " );
        objTriangulo.base = teclado.nextDouble();
        System.out.println( "Informar o valor da Altura: " );
        objTriangulo.base = teclado.nextDouble();
        System.out.println( "----------------------------------" );

        return objTriangulo;

    }

    public quadrado CadastrarQuadrado (){
        System.out.println( "---------- Quadrado ----------" );
        System.out.println( "Informar o valor da Base: " );
        objQuadrado.lado1 = teclado.nextDouble();
        System.out.println( "Informar o valor da Altura: " );
        objQuadrado.lado2 = teclado.nextDouble();
        System.out.println( "----------------------------------" );

        return objQuadrado;

    }

    public circulo CadastrarCirculo (){
        System.out.println( "---------- Círculo ----------" );
        System.out.println( "Informe o valor do raio: " );
        objCirculo.raio = teclado.nextDouble();
        System.out.println( "-------------------------------" );

        return objCirculo;


    }

    public  retangulo  CadastrarRetangulo (){
        System.out.println( "---------- Retangulo ----------" );
        System.out.println( "Informar o valor da Base: " );
        objQuadrado.lado1 = teclado.nextDouble();
        System.out.println( "Informar o valor da Altura: " );
        objQuadrado.lado2 = teclado.nextDouble();
        System.out.println( "----------------------------------" );

        return objRetangulo;
    }
}
