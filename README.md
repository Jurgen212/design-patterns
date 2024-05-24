## CREACIONALES
# Singleton

- Se crean 2 clases: Main y Singleton
- En Singleton creamos una constante statica llamada Singleton, que almacena la instancia de la propia clase, ademas se crea el metodo getInstance que retorna esta instancia.
En la clase Main se crea un objeto que llama a getInstance y queda como instancia global (Dentro de esta clase) de la clase Singleton, mediante este objeto podemos acceder a diferentes metodos de la clase Singleton.


## Estructurales
# Decorator

- Permite añadir comportamiento a objetos individuales, de manera dinámica y transparente, mediante el uso de objetos llamados "decoradores". Este patrón es especialmente útil cuando se desea extender las funcionalidades de una clase sin modificar su código original y sin utilizar la herencia de forma excesiva.


## Comportamiento
# Meditator

- Promueve la comunicación entre objetos de manera centralizada. En lugar de que los objetos se comuniquen directamente entre sí, lo hacen a través de un objeto mediador. 

# State

- Permite a un objeto cambiar su comportamiento cuando su estado interno cambia. Este patrón es particularmente útil para evitar condicionales complejos y para organizar mejor el código que maneja diferentes estados.

# Strategy

- Permite definir una familia de algoritmos, encapsular cada uno de ellos y hacerlos intercambiables. Este patrón permite que el algoritmo varíe independientemente de los clientes que lo utilizan, promoviendo así la reutilización de código y la flexibilidad.

 
