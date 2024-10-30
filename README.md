# Taller de Evaluación: Corrección de Código y Uso de Git/GitHub

## Objetivo:
El propósito de este taller es evaluar tus habilidades para corregir errores en un proyecto de Java y gestionar los cambios utilizando Git y GitHub. Durante esta actividad, deberás corregir un código que tiene varios errores (sintácticos y lógicos), crear una rama, hacer commit de los cambios, y subir tu trabajo a un repositorio remoto mediante un Pull Request (PR).

## Requerimientos:

- Conocimientos básicos de **Java**.
- Conocimientos básicos de **Git** y **GitHub**.
- Tener instalado **Git** y un IDE compatible con **Java** en tu máquina.

---

## Instrucciones:

### 1. **Clonar el proyecto desde GitHub**:
   Primero, debes clonar el proyecto a tu máquina local. Ejecuta el siguiente comando en tu terminal para obtener una copia del repositorio:

   ```bash
   git clone https://github.com/RDuuke90/proyecto-java
   ```

### 2. **Revisar el código y encontrar los errores**:
- Dentro del repositorio clonado, encontrarás una clase llamada CalculadoraSimple.
   
- El código tiene errores sintácticos y lógicos. Tu tarea es identificarlos y corregirlos.
   
- Usa tu IDE para compilar y ejecutar el proyecto para encontrar y solucionar los errores.

### 3. **Flujo de trabajo con Git (sin comandos en orden)**:
Luego de corregir el código, deberás realizar los siguientes pasos:

- Crear una rama con tu nombre: La rama debe llevar tu nombre.
- Agregar los archivos corregidos.
- Hacer un commit con un mensaje que describa los cambios.
- Subir la rama al repositorio remoto en GitHub.
- Crear un Pull Request (PR) desde tu rama hacia la rama principal (main).

-- Los comandos que necesitas usar son los siguientes (pero no están en orden, asegúrate de averiguar el flujo correcto):
``` bash
git add .
git checkout -b tu-nombre
git push origin tu-nombre
git commit -m "Corrección de errores en CalculadoraSimple"
```

### 4. **Generar un Pull Request (PR)**:
Después de subir tus cambios, debes ir a GitHub y crear un Pull Request (PR) solicitando la fusión de tu rama con la rama principal main.
El título del PR debe ser: "Corrección de errores - [Tu nombre]".
