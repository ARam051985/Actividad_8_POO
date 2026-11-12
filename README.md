# Actividad 8. Pruebas unitarias con JUnit

## Nombre: Peña Ramírez Ángel Antonio 

## Objetivo de la actividad
Esta actividad sirve como aprendizaje para realizar pruebas unitarias en Java
con JUnit. Se tiene un código en la cual se le hará una serie de pruebas
unitarias para verificar los distintos resultados que arroja la función, además
de observar el comportamiento de su sintaxis. La actividad pide realizar al
menos 5 pruebas con JUnit para evaluar el método `ArrayOperations.numZero()`.

## Método de resolución
En esta actividad se realizan, como mínimo, 5 pruebas para la función `public
static int numZero(int[] x)` de la clase `ArrayOperations`. Para esta actividad
se han realizado 5 pruebas exclusivamente para `numZero(int[] x)`:
1. **Probar entrada null**. Debido a que los arreglos pueden poseer valores
nulos, se realiza una prueba dedicada a pasar un arreglo sin contenido a la
función.
2. **Probar entrada sin ceros**. Para probar que el contador aumenta cuando
haya ceros en el arreglo o no, se realiza una prueba en la cual se pasa un
arreglo sin ceros a la función.
3. **Probar entrada con algunos ceros**. Para probar que el ciclo for funcione
correctamente, se realiza una prueba en la cual se pasa una entrada con,
exactamente, 3 ceros en el arreglo a la función.
4. **Probar entrada con puros ceros**. Para probar que el contador cuente
todos los ceros correctamente, se realiza una prueba en la cual se pasa una
entrada con puros ceros en el arreglo (exactamente 5 ceros).
5. **Probar resultado del contador empezando en el índice 1**. Debido a que el
ciclo for empíeza en el índice 1 y no en el índice 0, se realiza una prueba
exclusiva en la cual se pasa un arreglo con puros ceros (exactamente 5) y
restarle 1 unidad para ver si el ciclo for está mal diseñado o no.

## Resultados obtenidos
Al realizar la codificación en `ArrayOperationsTest.java` para realizar las
pruebas unitarias antes mencionadas y, posteriormente ejecutarlo, se ha
mostrado los siguientes resultados:

![img.png](Ejecución%20de%20las%20pruebas%20unitarias.png)

Como se puede observar, se pasaron con éxito las siguientes pruebas:
1. **Probar entrada null**. Debido a que hay un
`throw new NullPointerException();`, el programa indica que no se pueden pasar
arreglos nulos.
2. **Probar entrada sin ceros**. Como el contador aumenta solo cuando se
detecta un 0 en el arreglo, y como no hay un solo 0 en el arreglo de prueba, su
contador final deberá ser 0, y esto pasa, y pasa la prueba unitaria.
3. **Probar resultado del contador empezando en el índice 1**. Como el contador
del ciclo for inicia en 1, quiere decir que no contará el primer índice del
arreglo. Además, como hay un 0 en el primer índice del arreglo de prueba, el
resultado del contador deberá indicar 2, lo cual sí pasa, y pasa la prueba
unitaria.

Ahora, se listan las pruebas que **NO** se han pasado.
1. **Probar entrada con algunos ceros**. Se ha realizado esta prueba para
verificar que la sintaxis del ciclo for esté escrito correctamente, y se pasa
un arreglo con 3 ceros. El supuesto resultado debe ser "3" porque hay 3 ceros
en el arreglo, pero esto no es así, ya que el ciclo for empieza a recorrer en
el segundo índice, y hay un 0 al puro inicio, entonces el for omite este cero
y su contador de ceros es en realidad 2.
2. **Probar entrada con puros ceros**. Misma cosa a la hora de probar la
entrada con algunos ceros. Hay 5 ceros en el arreglo de prueba, el supuesto
resultado es 5, y el contador arroja como resultado "4" debido a que el ciclo
for no inicia en el primer índice, sino en el segundo, y omite el cero ubicado
en el puro inicio del arreglo.

## Retos presentados
El único reto que se ha presentado fue el siguiente:
- **Configurar el entorno de pruebas**. Para poder realizar las pruebas
unitarias de manera correcta con JUnit, es necesario configuar todo para que
todo funcione a la perfección; de otra manera, se irá lanzando una serie de
errores.

## Aprendizajes adquiridos
Los aprendizajes que adquirí fue sobre cómo puedo realizar pruebas unitarias de
manera profesional utilizando herramientas indicadas y funciones especializadas
para llevar estas tareas a cabo. Siento que te puede facilitar muchísimo el
avance de diversos proyectos a la hora de utilizar estas herramientas.
También aprendí a cómo configurar de manera correcta el entorno para poder
realizar las pruebas unitarias con JUnit y Maven.

## Tecnologías utilizados
IDE: IntelliJ IDEA
Versión de Java: 26.2.1
Tecnología utilizada para las pruebas unitarias: Maven para JUnit

## NO SE HA UTILIZADO INTELIGENCIA ARTIFICIAL
No se ha utilizado a ninguna inteligencia artificial durante la realización de
esta actividad. Todo lo que ha sido escrito (tanto `ArrayOperationsTest.java`
como este README) en esta actividad ha sido de forma manual.