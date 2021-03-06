package aula02;

public class aula02ex {

    //Exercicios de trabalho autonomo da aula02
    public static void main(String[] args) {
        // 1.Obter a soma de dois números. - testes
        System.out.println("Soma dos inteiros a e b");
        System.out.println(soma(2, 3));
        // 2.Obter o quadrado de um número. - testes
        System.out.println("Quadrado de um numero a");
        System.out.println(quadrado(2));
        // 3.Obter a diferença entre dois números - testes
        System.out.println("Diferença entre dois numeros inteiros");
        System.out.println(diff(3, 4));
        // 4.Obter a média entre dois números - testes
        System.out.println("Media entre a e b");
        System.out.println(average(6, 4));
        // 5.Obter a área de um retângulo, dando os lados - testes
        System.out.println("Área Rectangulo com lados de comprimento a e b");
        System.out.println(areaRect(2, 4));
        // 6.Dada uma temperatura em Celcius, obtera temperatura em Fahrenheit.
        // Resolvido na aula02.java
        // 7. Dada uma temperatura em Celsius, obter a temperatura em kelvin. - testes
        System.out.println("Converte temperatura em Celsius (tempC) para Kelvin");
        System.out.println(celsiusToKelvin(0));
        // 8.Dado um comprimento em centímetros, obter o valor em polegadas. - testes
        System.out.println("Converte a de cm para Inch");
        System.out.println(cmToInch(2));
        // 9.Dado um preço, obter o IVAa 23%correspondente ao mesmo. (Ex: 100€ -> 18.70€). - testes
        // Assumo que o enunciado pede para obter os 23% do IVA de um preço
        System.out.println("Calcula os 23% de IVA de a");
        System.out.println(iva(100));
        // 10.Dado um número com casas decimais (double), devolve o inteiro aproximado. (Ex: 4.3 -> 4, 5.7 -> 6). - testes
        System.out.println("Arredonda um numero a");
        System.out.println(arredondar(12.6));
        // 11.Obter o perímetro de um círculo, dado o seu diâmetro. - testes
        System.out.println("Perimetro de um circulo com raio r");
        System.out.println(circleperimeter(3));
        // 12.Obter a área de um prisma retangular, dando a sua largura, altura e comprimento - testes
        System.out.println("Area do prisma com comprimento c, largura l e altura a");
        System.out.println(areaPrisma(2, 3, 4));
    }

    // 1. Soma dos inteiros a e b
    static int soma(int a, int b) {
        return a + b;
    }

    // 2. Quadrado de um numero a
    static int quadrado(int a) {
        return a * a;
    }

    // 3. Diferença entre dois numeros inteiros
    static int diff(int a, int b) {
        return a - b;
    }

    // 4. Media entre a e b
    static double average(int a, int b) {
        return (double) (a + b) / 2;
    }

    // 5. Área Rectangulo com lados de comprimento a e b
    static int areaRect(int a, int b) {
        return a * b;
    }

    // 6. Converte temperatura C (tempC) para Kelvin
    static double celsiusToKelvin(int tempC) {
        return tempC + 273.15;
    }

    // 7. Converte a de cm para Inch
    static double cmToInch(int a) {
        return a * 0.393;
    }

    // 8. Calcula os 23% de IVA de a
    static double iva(int a) {
        return 0.23 * a;
    }

    // 9. Arredonda um numero a
    static int arredondar(double a) {
        return (int) Math.round(a);
    }

    // 10. Perimetro de um circulo com raio r
    static double circleperimeter(int r) {
        return 2 * Math.PI * r;
    }

    // 11. Area do prisma com comprimento c, largura l e altura a
    // Formula area  A=2(lc+ac+al)
    static int areaPrisma(int c, int l, int a) {
        return 2 * ((l * c) + (a * c) + (a * l));
    }
}

