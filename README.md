 Configuración de Entorno Java/Maven e Implementación de Stack

Estudiante:
Arlin Guisel Castillo Cermeño

 Objetivo de la Práctica
Verificar la correcta configuración del entorno Java y Maven, crear y ejecutar un proyecto Maven desde consola, e implementar manualmente una estructura de datos tipo **Stack (Pila)** utilizando nodos enlazados.
 Configuración del Entorno
Se verificó la instalación y funcionamiento correcto de:
- ☕ Java (JDK)
- 📦 Apache Maven
- 💻 Consola CMD
- 🌐 Git y GitHub

 Verificación realizada
Se ejecutaron los siguientes comandos en consola:

```bash
java -version
mvn -v
Posteriormente se compiló el proyecto:
Bash
mvn clean package
Resultado obtenido:

BUILD SUCCESS
Lo cual confirma que el entorno está correctamente configurado.
📂 Estructura del Proyecto
El proyecto fue creado utilizando Maven y tiene la siguiente estructura:

src/
 └── main/
      └── java/
           └── umg/
                └── edu/
                     └── gt/
                          └── datastructure/
                               └── stack/
                                    ├── App.java
                                    ├── MyStack.java
                                    ├── Node.java
                                    └── SymbolValidator.java
 Implementación de la Estructura Stack
Se implementó una pila utilizando nodos enlazados, sin utilizar la clase java.util.Stack.
🔹 Clase Node
Representa un nodo con:
Un dato de tipo char
Una referencia al siguiente nodo
Java

🔹 Clase MyStack
Implementa la lógica de la pila bajo el principio LIFO (Last In, First Out).
Métodos implementados:
push(char data) → Inserta un elemento.
pop() → Elimina el elemento superior.
isEmpty() → Verifica si la pila está vacía.
getCount() → Devuelve la cantidad de elementos en la pila.
getNodeInit() → Devuelve el nodo superior (inicio de la pila).
Java.

 Pruebas del Proyecto
En App.java se realizaron pruebas para verificar el funcionamiento correcto de la pila:
Inserción de elementos
Eliminación de elementos
Conteo de elementos
Verificación del nodo superior
Ejemplo de salida obtenida en consola:
Cantidad: 3
Nodo inicial: C
Pop
Cantidad luego pop: 2

▶️ Ejecución del Proyecto
Desde la carpeta donde se encuentra el pom.xml, se ejecutaron los siguientes comandos:
Compilación:
Bash
mvn clean package
Resultado:

BUILD SUCCESS
Ejecución:
Bash
mvn exec:java -Dexec.mainClass=umg.edu.gt.datastructure.stack.App
El programa ejecutó correctamente mostrando los resultados esperados.

🌐 Control de Versiones
El proyecto fue subido a GitHub utilizando los siguientes comandos:
Bash
git add .
git commit -m "Proyecto Stack funcionando"
git push
El repositorio contiene:
Código fuente completo
Carpeta /docs con capturas de evidencia
Archivo pom.xml
README documentado.

✅ Conclusión
Se logró:
✔ Configurar correctamente el entorno Java y Maven.
✔ Crear un proyecto Maven funcional.
✔ Implementar manualmente una estructura de datos tipo Stack.
✔ Ejecutar el proyecto exitosamente desde consola.
✔ Documentar el proceso intermedio.
✔ Subir el proyecto correctamente a GitHub.
