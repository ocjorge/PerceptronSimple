# PerceptronSimple
Perceptron Simple en Java, cambiando valores de 0 por -1

# Perceptrón Simple en Java

## Descripción
Este proyecto implementa un Perceptrón Simple para modelar la función lógica AND. El perceptrón es uno de los modelos más básicos de redes neuronales artificiales, capaz de clasificar patrones linealmente separables a través de un proceso de aprendizaje supervisado.

## Características
- Implementación de un perceptrón con 3 entradas (x0, x1, x2)
- Aprendizaje por corrección de error usando la regla del delta
- Factor de aprendizaje aleatorio entre 0.2 y 0.9
- Visualización paso a paso del proceso de aprendizaje
- Interfaz simple para probar el perceptrón entrenado

## Requisitos
- Java JDK 8 o superior
- IDE Java compatible (opcional)

## Instalación
1. Clona este repositorio o descarga el archivo `PerceptronSimple.java`
2. Compila el archivo usando:
   ```
   javac PerceptronSimple.java
   ```
3. Ejecuta el programa:
   ```
   java PerceptronSimple
   ```

## Uso
El programa sigue estos pasos:

1. **Inicialización**: El perceptrón se inicializa con pesos aleatorios y un factor de aprendizaje aleatorio.
2. **Entrenamiento**: El perceptrón se entrena con los siguientes patrones para aprender la función AND:
   - [1, 1] → 1
   - [1, -1] → -1
   - [-1, 1] → -1
   - [-1, -1] → -1
3. **Prueba**: Después del entrenamiento, puedes ingresar valores de entrada (1 o -1) para probar el perceptrón.

## Funcionamiento Interno
El perceptrón utiliza:
- Una función de activación de tipo escalón bipolar (salida 1 o -1)
- Tres pesos (w0, w1, w2) que se ajustan durante el entrenamiento
- Un proceso iterativo que continúa hasta que todos los patrones se clasifican correctamente

## Fórmulas
- **Salida**: y = f(w0*x0 + w1*x1 + w2*x2)
- **Función de activación**: f(x) = 1 si x ≥ 0, -1 si x < 0
- **Ajuste de pesos**: wi = wi + α * error * xi
  donde:
  - α: factor de aprendizaje
  - error: diferencia entre la salida deseada y la obtenida
  - xi: valor de entrada correspondiente

## Ejemplo de Salida
```
Perceptron AND
Factor de Aprendizaje: 0.5
Peso 0: 0.234
Peso 1: 0.654
Peso 2: 0.321

Iteración 1----------
y = 1.209
Como y >= 0 entonces y = 1
Error = 0.0
y = 0.567
Como y >= 0 entonces y = 1
Error = -2.0
Se recalculan pesos
...
```

## Contribuciones
Las contribuciones son bienvenidas. Por favor, siente libre de hacer fork del repositorio y enviar pull requests.

## Licencia
Este proyecto está licenciado bajo la Licencia MIT - ver el archivo LICENSE para más detalles.

## Autor
[Tu Nombre]
