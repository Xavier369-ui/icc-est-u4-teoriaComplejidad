
# **INFORME DE INVESTIGACION**



![alt text](image.png)


### **Asignatura:** Estructura de Datos

### **Tema:** Proyecto de Complejidad y Eficiencia de Algoritmos


# Integrantes:
- Xavier Josue Fajardo Zumba - https://github.com/Xavier369-ui/icc-est-u4-teoriaComplejidad.git
- Nombre Completo 1 - Enlace a GitHub

# Objetivos: Eduardp

1. Identificar y analizar la complejidad de algoritmos comunes o faciles comprendimiento su rendimiento. 

2. Implementar ejemplos prácticos en Java que permitan evaluar y comparar diferentes niveles de complejidad. 

3. Aplicar métodos de análisis teórico y práctico para para observar el comportamiento de los algoritmos con diferentes tamaños de entrada y condiciones.


# Marco Teórico: Eduardo

La complejidad algorítmica es una rama fundamental de la informática que estudia el comportamiento y rendimiento de los algoritmos dependiendo el tamaño de los datos de entrada. Su objetivo es medir el uso de recursos, principalmente el tiempo de ejecución y la memoria, este determina si un algoritmo es eficiente o no. Este análisis es esencial porque permite anticipar cómo crecerá el costo computacional cuando aumente la cantidad de datos, esto afecta directamente los planes de viabilidad de un programa en situaciones reales, se necesita ver su eficiencia. 

Se distinguen dos tipos principales: la complejidad temporal, que se refiere al tiempo que toma de ejecución y la complejidad espacial, esta mide la cantidad de memoria adicional requerida. Estos valores dependen también de factores como el lenguaje de programación, la arquitectura del hardware y la implementación realizada por el programador.

Para expresar de forma estándar la eficiencia de los algoritmos se utiliza la notación Big O. Estas notaciones permiten describir cómo crece el costo computacional de un algoritmo y clasificarlo en categorías como O(1), O(n), O(log n) u O(n²). Gracias a estas notaciones es posible comparar algoritmos que resuelven el mismo problema y seleccionar según se necesite y requiera para tener un diseño más óptimo y eficiente. 

## **1. Teoría de la Complejidad** 

La teoría de la complejidad es una parte fundamental de la informática que se encarga de analizar cómo se comportan los algoritmos cuando aumenta el tamaño de los datos que deben procesar. Su propósito principal es medir el uso de recursos, especialmente el tiempo de ejecución y la memoria, para determinar si una solución es realmente eficiente. A través de este análisis es posible identificar qué métodos pueden manejar grandes cantidades de información y cuáles podrían volverse lentos o poco prácticos. Además, esta teoría proporciona herramientas formales, como la notación Big O, que permiten describir matemáticamente cómo crece el costo computacional de un algoritmo, facilitando la comparación entre distintas soluciones y ayudando a predecir su rendimiento futuro sin necesidad de probarlas en todos los escenarios posibles.

Estudiar la teoría de la complejidad también ayuda a desarrollar un criterio más sólido al momento de diseñar soluciones informáticas, ya que permite identificar qué partes de un algoritmo pueden optimizarse y cuáles representan posibles cuellos de botella. Esto no solo mejora el rendimiento general del programa, sino que contribuye a la creación de sistemas más eficientes, escalables y capaces de adaptarse a diferentes volúmenes de información. Gracias a este enfoque, es posible garantizar que las aplicaciones mantengan un buen desempeño en contextos reales, incluso cuando la demanda o la cantidad de datos crezca con el tiempo.

### 1.1 Definición general

La complejidad se define como la medida del costo computacional que requiere un algoritmo para ejecutarse, considerando principalmente el tiempo que tarda y la memoria que utiliza. Esta medida depende del tamaño de la entrada y se expresa mediante funciones que muestran cómo crecen los recursos necesarios a medida que aumentan los datos.

### 1.2 Importancia en la resolución de problema

La complejidad es importante porque permite determinar qué algoritmos resuelven un problema de manera eficiente y cuáles presentan dificultades cuando la entrada crece. Evaluarla ayuda a evitar soluciones que parecen correctas pero que no funcionan bien con datos más grandes, asegurando que el rendimiento del programa sea adecuado en distintos escenarios.

Además, comprender la complejidad facilita la elección de estructuras de datos y métodos más apropiados durante el desarrollo de software. Esto permite anticipar posibles cuellos de botella, optimizar el rendimiento y garantizar que la aplicación pueda adaptarse a diferentes condiciones sin perder eficiencia ni estabilidad.

### 1.3 Eficiencia de algoritmos

* Coste temporal
* Coste espacial

### 1.4 Factores de tiempo de ejecución Eduardo

* Factores propios
* Factores circunstanciales
* Análisis teórico
* Análisis experimental

### 1.5 Notación de complejidad

* Big O
* Mejor caso
* Peor caso
* Caso promedio
* Big O, Ω, Θ

---

## **2. Ejemplos de Complejidad en Java**

En esta sección se presentan las clases creadas dentro del proyecto y el análisis correspondiente a cada una.

---

## **2.1 Complejidad O(1) – Constante**

### **Archivo:** `ComplejidadConstante.java`

### **Código del ejemplo**

```java
public void ejemplo() {
    System.out.println("Ejemplo O(1)");
    int x = 10;
    int y = 5;
    int suma = x + y;
}
```

### **Explicación resumida** Eduardp

*(Aquí el estudiante explica por qué es O(1))*

---
**PARA CADA COMPLEJIDAD, REPETIR LA ESTRUCTURA ANTERIOR** Eduardo


# **Conclusiones**

*(Aquí el estudiante agrega conclusiones propias del trabajo)*

**POR ESTUDIANTE**: *(Xavier Josue Fajardo Zumba,
)*


---
