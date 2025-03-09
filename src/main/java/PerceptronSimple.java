import java.util.Random;
import java.util.Scanner;
public class PerceptronSimple {
    public static void main(String[] args) {
        // x0 x1 x2
        float[][] entradas = {
                {1f, 1f, 1f},
                {1f, 1f, -1f},
                {1f, -1f, 1f},
                {1f, -1f, -1f},
        };
        //yd
        float[] salidas = new float[4];
        salidas[0] = 1f;
        salidas[1] = -1f;
        salidas[2] = -1f;
        salidas[3] = -1f;

        Random random = new Random();
        float w0 = random.nextFloat();
        float w1 = random.nextFloat();
        float w2 = random.nextFloat();

        float factorAprendizaje = random.nextInt(8) + 2;
        factorAprendizaje = factorAprendizaje / 10;

        float y = 0.0f;
        float error = 0.0f;
        int fila = 0;
        int repeticion = 1;

        System.out.println("Perceptron AND");
        System.out.println("Factor de Aprendizaje: " + factorAprendizaje);
        System.out.println("Peso 0: " + w0);
        System.out.println("Peso 1: " + w1);
        System.out.println("Peso 2: " + w2);
        System.out.println();
        System.out.println("Iteración " + repeticion + "----------");

        while (fila < 4) {
            y = w0 * entradas[fila][0] + w1 * entradas[fila][1] + w2 * entradas[fila][2];
            System.out.println("y = " + y);

            if (y >= 0) {
                y = 1;
                System.out.println("Como y >= 0 entonces y = " + y);
            } else {
                y = -1;
                System.out.println("Como y < 0 entonces y = " + y);
            }
            error = salidas[fila] - y;

            System.out.println("Error = " + error);

            if (error == 0f) {
                fila++;
            } else {
                System.out.println("Se recalculan pesos");
                w0 = w0 + (factorAprendizaje * error) * entradas[fila][0];
                w1 = w1 + (factorAprendizaje * error) * entradas[fila][1];
                w2 = w2 + (factorAprendizaje * error) * entradas[fila][2];

                System.out.println("Nuevo W0 = " + w0);
                System.out.println("Nuevo W1 = " + w1);
                System.out.println("Nuevo W2 = " + w2);

                fila = 0;
                repeticion++;
                System.out.println();
                System.out.println();
                System.out.println("Iteración: " + repeticion);
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Pesos Finales");
        System.out.println("Factor de Aprendizaje: " + factorAprendizaje);
        System.out.println("Peso w0: " + w0);
        System.out.println("Peso w1: " + w1);
        System.out.println("Peso w2: " + w2);
        System.out.println();
        System.out.println();

        Scanner dato = new Scanner(System.in);
        int entrada1, entrada2;

        System.out.println("Ingrese la entrada 1 (1,-1):");
        entrada1 = dato.nextInt();
        System.out.println("Ingrese la entrada 2 (1,-1):");
        entrada2 = dato.nextInt();
        y = (w0*1) + (w1*entrada1) + (w2*entrada2);
        if(y >= 0)
            y = 1;
        else
            y = -1;
        System.out.println("La salida es: " + y);

        dato.close();
    }
}