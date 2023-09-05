package br.senai.sp.model;

import java.util.Scanner;

public class menu {

    public void menu1() {

        Cadastro objCadastro = new Cadastro();

        Scanner teclado = new Scanner(System.in);

        exibir objExibir = new exibir();

        while (true){

            System.out.println("|========================================|");
            System.out.println("|*************** Bem vindo  *************|");
            System.out.println("|========================================|");
            System.out.println("|                 Formas                 |");
            System.out.println("|                                        |");
            System.out.println("| 1 - Quadrado                           |");
            System.out.println("| 2 - Circulo                            |");
            System.out.println("| 3 - Retangulo                          |");
            System.out.println("| 4 - Triangulo                          |");
            System.out.println("|                                        |");
            System.out.println("|========================================|");
            System.out.println("| Selecione uma opção:                   |");

            int opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    quadrado objQuadrado = objCadastro.CadastrarQuadrado();
                    objQuadrado.calcularArea();
                    objQuadrado.calcularPerimetro();
                    objExibir.exibirQuadrado(objQuadrado);

                    break;

                case 2:
                    circulo objCirculo = objCadastro.CadastrarCirculo();
                    objCirculo.calcularArea();
                    objCirculo.calcularPerimetro();
                    objExibir.exibirCirculo(objCirculo);

                    break;

                case 3:
                    retangulo objRetangulo = objCadastro.CadastrarRetangulo();
                    objRetangulo.calcularArea();
                    objRetangulo.calcularPerimetro();
                    objExibir.exibirRetangulo(objRetangulo);

                    break;

                case 4:
                    triangulo objTriangulo = objCadastro.cadastrarTriangulo();
                    objTriangulo.calcularArea();
                    objTriangulo.calcularPerimetro();
                    objExibir.exibirTriangulo(objTriangulo);

                    break;

            }
        }
    }
}
