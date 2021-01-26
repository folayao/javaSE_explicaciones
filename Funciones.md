# Funciones 
* Organizar y modularizar el Código
* Reutilizar Codigo
* Evitar Codigo Repetido 

Esto hace referencia a la filosofia de *Dividir para vencer.*

~~~
/**
*   Descripcion: Funcion para sumar dos enteros.
*   @param a Cantidad a sumar # 1
*   @param b Cantidad a sumar # 2
* */
public int suma(int a , int b){
    return a + b;
}
~~~

Una función esta conformada por:
* mod. Acceso
* valor de regreso
* nombre
* argumentos

**Todo en este orden que se menciona, tome como ref, el ejemplo anterior**

Cuando tienen un valor de regreso, la palabra clave para que regrese un valor del tipo especificado usamos, ***return***

y para llamar una función se hace así, tomando como ejemplo la funcion suma:

~~~
int c = suma(1,2);
~~~
