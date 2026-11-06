<h1 align="center">📁 APE – Manejo de ficheros en Java</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-21-orange?logo=openjdk&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/Editor-VS%20Code-007ACC?logo=visualstudiocode&logoColor=white" alt="VS Code">
  <img src="https://img.shields.io/badge/Universidad-UTA-b71c1c" alt="UTA">
</p>

Programas en Java que crean, escriben y eliminan archivos de texto usando las clases `File`, `FileWriter` y `BufferedWriter`.

## 👩‍💻 Información académica

| | |
|---|---|
| **Universidad** | Universidad Técnica de Ambato |
| **Carrera** | Software |
| **Asignatura** | Algoritmos y lógica de programación |
| **Docente** | Ing. José Rubén Caiza Caizabuano, Mg. |
| **Estudiante** | Valeria Valentina Ortiz Mosquera |

## 📚 Ejercicios

### APE 1 – Operaciones básicas con ficheros

| # | Archivo | Qué hace | Clases y métodos |
|---|---------|----------|------------------|
| 1 | `Ejercicio1.java` | Crea el archivo `curso.txt` y avisa si ya existe | `File`, `createNewFile()`, `getName()` |
| 2 | `Ejercicio2.java` | Guarda un mensaje del teclado al final de `estudiantes.txt` | `Scanner`, `FileWriter`, `write()`, `close()` |
| 3 | `Ejercicio3.java` | Elimina el archivo `estudiantes.txt` | `File`, `delete()` |

### APE clase 2 – Registro de datos con BufferedWriter

| # | Archivo | Qué hace | Clases y métodos |
|---|---------|----------|------------------|
| 4 | `Ejercicio4.java` | Registra 3 estudiantes (nombre y calificación, dos líneas cada uno) en `estudiantes.txt` | `Scanner`, `BufferedWriter`, `FileWriter` |
| 5 | `Ejercicio5.java` | Registra productos, calcula el valor total (precio × cantidad) y los guarda en `productos.txt` sin borrar los anteriores | `BufferedWriter`, `FileWriter(…, true)` |
| 6 | `Ejercicio6.java` | Registra ventas hasta escribir `fin`, aplica 10 % de descuento si el subtotal es ≥ $100 y guarda el total acumulado en `ventas.txt` | `Scanner`, `BufferedWriter`, `if` |

Todos controlan los errores con `try-catch` o con `if-else`.

## ▶️ Cómo ejecutarlos

Necesitas tener instalado el JDK (Java 11 o superior). Desde la carpeta del proyecto:

```bash
java Ejercicio1.java
java Ejercicio2.java
java Ejercicio3.java
java Ejercicio4.java
java Ejercicio5.java
java Ejercicio6.java
```

> ⚠️ **Importante:**
> - El Ejercicio 2 necesita que `estudiantes.txt` exista antes de ejecutarlo, y el Ejercicio 3 lo elimina, así que ejecútalo después.
> - Los Ejercicios 4, 5 y 6 crean sus archivos automáticamente. El 4 reescribe `estudiantes.txt`; el 5 y el 6 agregan al final de `productos.txt` y `ventas.txt`.
> - En los Ejercicios 5 y 6, escribe los decimales con punto (`2.50`).

## 🖥️ Ejemplo de salida

**Ejercicio 1**
```
El archivo se creó correctamente.
Nombre del archivo: curso.txt
```

**Ejercicio 2**
```
Escriba un mensaje: Hola, soy un estudiante del curso de Java
La información se guardó correctamente.
```

**Ejercicio 3**
```
El archivo estudiantes.txt se eliminó correctamente.
```

**Ejercicio 4**
```
Estudiante 1
Nombre: Ana Torres
Calificación: 9.5
Estudiante 2
Nombre: Luis Mora
Calificación: 8
Estudiante 3
Nombre: Sofía Vera
Calificación: 10
Datos guardados en estudiantes.txt
```

**Ejercicio 5**
```
Nombre del producto: Cuaderno
Precio: 2.50
Cantidad disponible: 20
Valor total: $50.00
Producto guardado en productos.txt
¿Registrar otro producto? (s/n): n
```

**Ejercicio 6**
```
Producto (escriba fin para terminar): Mochila
Precio: 35.00
Cantidad vendida: 4
Subtotal: $140.00
Descuento: $14.00
Total a pagar: $126.00
Producto (escriba fin para terminar): fin
Total acumulado de ventas: $126.00
```

## 🗂️ Estructura

```
├── Ejercicio1.java
├── Ejercicio2.java
├── Ejercicio3.java
├── Ejercicio4.java
├── Ejercicio5.java
├── Ejercicio6.java
└── README.md
```
