<h1 align="center">📁 APE – Manejo de ficheros en Java</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-21-orange?logo=openjdk&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/Editor-VS%20Code-007ACC?logo=visualstudiocode&logoColor=white" alt="VS Code">
  <img src="https://img.shields.io/badge/Universidad-UTA-b71c1c" alt="UTA">
</p>

Programas en Java que crean, escriben y eliminan archivos de texto usando las clases `File` y `FileWriter`.

## 👩‍💻 Información académica

| | |
|---|---|
| **Universidad** | Universidad Técnica de Ambato |
| **Carrera** | Software |
| **Asignatura** | Algoritmos y lógica de programación |
| **Docente** | Ing. José Rubén Caiza Caizabuano, Mg. |
| **Estudiante** | Valeria Valentina Ortiz Mosquera |

## 📚 Ejercicios

| # | Archivo | Qué hace | Clases y métodos |
|---|---------|----------|------------------|
| 1 | `Ejercicio1.java` | Crea el archivo `curso.txt` y avisa si ya existe | `File`, `createNewFile()`, `getName()` |
| 2 | `Ejercicio2.java` | Guarda un mensaje del teclado al final de `estudiantes.txt` | `Scanner`, `FileWriter`, `write()`, `close()` |
| 3 | `Ejercicio3.java` | Elimina el archivo `estudiantes.txt` | `File`, `delete()` |

Todos controlan los errores con `try-catch` o con `if-else`.

## ▶️ Cómo ejecutarlos

Necesitas tener instalado el JDK (Java 11 o superior). Desde la carpeta del proyecto:

```bash
java Ejercicio1.java
java Ejercicio2.java
java Ejercicio3.java
```

> ⚠️ **Importante:** el Ejercicio 2 necesita que `estudiantes.txt` exista antes de ejecutarlo, y el Ejercicio 3 lo elimina, así que ejecútalo al final.

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

## 🗂️ Estructura

```
├── Ejercicio1.java
├── Ejercicio2.java
├── Ejercicio3.java
└── README.md
```
