public class CalculadoraSimple {

    // Método para sumar dos números
    public int sumar(int a, int b) {
        return a + b // Error sintáctico: falta el punto y coma
    }

    // Método para multiplicar dos números
    public int multiplicar(int a, int b) {
        int resultado = a * b
        return resultado;
    }

    public static void main(String[] args) {
        CalculadoraSimple calc = new CalculadoraSimple();
        
        // Error lógico: la multiplicación debería ser entre dos números distintos
        int resultadoSuma = calc.sumar(10, 5);
        int resultadoMultiplicacion = calc.multiplicar(10, 10);

        // Error sintáctico: faltan las comillas para el texto
        System.out.println(Resultado de la suma: " + resultadoSuma);
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);
    }
}
