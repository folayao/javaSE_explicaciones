# Arreglos
Los arreglos o arrays son objetos en los que podemos guardar más de una variable, una lista de elementos. Los arrays son de una sola dimensión, pero si guardamos arrays dentro de otros arrays podemos obtener arrays multidimensionales.

Los arrays se definen en código de las siguientes maneras:
~~~
// 1. Definir el nombre de la variable y el tipo de datos
//  que va a contener, cualquiera de las siguientes dos
// opciones es válida:
TipoDato[] nombreVariable;
TipoDato nombreVariable[];

// 2. Definir el tamaño del array, la cantidad de elementos
// que podemos guardar en el array:
TipoDato[] nombreVariable = new TipoDato[capacidad];

// Array de dos dimensiones:
TipoDato[][] cities = new String[númeroFilas][númeroColumnas];
~~~
Ya que los arrays pueden guardar multiples elementos, la convención es escribir los nombres de las variables en plural.

### No depender de el tamaño del array
~~~

import java.util.ArrayList;
import java.util.List;

public class ArraysTest {
    public static void main(String[] args) {
        List<String> Days = new ArrayList<>();
        Days.add("Monday");
        Days.add("Tuesday");

        Days.forEach((n) -> System.out.println(n));
    }
}

~~~
### Forma promedio
~~~
public class Main{
	public static void main(String ... args){
		Animal animals[] = new Animal[2];

		animals[0] = new Dog();
		animals[1] = new Cat();
	}
}
~~~

# Indices y busqueda de elementos en Array
Los índices son variables simples que nos ayudan a identificar las posiciones en un arreglo. Estas variables siempre guardan números, comienzan en 0 e incrementan de abajo a arriba y de izquierda a derecha a medida que guardamos más elementos en nuestros arrays.

Para guardar un valor en alguna posición de nuestro array solo debemos usar el índice de la siguiente forma:

~~~
nombreVariable[indice] = valor;
~~~