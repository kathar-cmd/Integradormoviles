# Sistema de Préstamo de Libros - Biblioteca CESDE

![Version](https://img.shields.io/badge/version-1.0.0-blue)
![Estado](https://img.shields.io/badge/estado-en%20desarrollo-yellow)

---

## 📄 Resumen Ejecutivo

### Descripción Técnica del Problema
Actualmente, el proceso de préstamo de libros en la biblioteca del CESDE se gestiona de manera manual mediante registros físicos, lo cual genera graves deficiencias operativas y de seguridad:
- **Falta de Trazabilidad:** La ausencia de un registro digitalizado impide conocer en tiempo real la ubicación exacta de los ejemplares y la identidad del usuario responsable, incrementando el riesgo de pérdida o hurto.
- **Ausencia de Automatización de Notificaciones:** No existe un sistema de alertas que identifique o notifique las fechas de vencimiento de los préstamos, lo que deriva en entregas extemporáneas y retrasos continuos en las devoluciones.
- **Ineficiencia y Errores en la Captura de Datos:** La toma manual de datos de contacto de los usuarios resulta lenta, ineficiente y propensa a errores tipográficos, lo que dificulta las gestiones de cobro, rastreo y recuperación de activos.

### Solución Propuesta
Diseño e implementación de un sistema web automatizado de gestión de préstamos de biblioteca con arquitectura orientada a la persistencia de datos digitalizada. El sistema permitirá:
- **Centralización en Base de Datos Relacional:** Registro digitalizado e inmediato del 100% de los préstamos activos, inventario de ejemplares y perfiles de usuarios con sus respectivos datos de contacto validados.
- **Control de Trazabilidad y Estado:** Monitoreo en tiempo real del estado de cada libro (disponible, prestado, en mora).
- **Gestión de Alertas y Vencimientos:** Motor de control de fechas límite para identificar de manera automática los préstamos vencidos y optimizar los procesos de notificación y recuperación.

### Valor del Sistema
- **Reducción de Pérdidas:** Mitigación de al menos un 80% en los casos de extravío, deterioro o pérdida no trazable de libros.
- **Optimización Operativa:** Eliminación del margen de error humano en el registro de datos y reducción drástica de los tiempos de atención en taquilla.
- **Control Total del Inventario:** Visibilidad y control del 100% del catálogo físico de la biblioteca en tiempo real, garantizando la recuperación oportuna de los activos institucionales.

---

## 🏗️ Arquitectura

El proyecto está diseñado bajo una arquitectura en 3 capas:

- **Capa de Presentación (Frontend):** Responsable de las interfaces gráficas y la interacción con los bibliotecarios y estudiantes mediante Vaadin Flow.
- **Capa de Lógica (Backend):** Encargada de gestionar la lógica de préstamos, validación de inventarios y cálculo de estados de mora en Java.
- **Capa de Datos (Database):** Motor relacional SQL Server encargado de garantizar la persistencia e integridad de los datos.

---

## 📊 Modelo Entidad Relación

![Modelo Entidad Relación](./img/merbdproyecto.png)

---

## 🛠️ Stack Tecnológico

- **Lenguaje principal:** Java 17
- **Framework de interfaz:** Vaadin Flow
- **Base de Datos:** SQL Server 2022
- **Gestión de dependencias:** Apache Maven

---

## ⚙️ Guía de Configuración

### Pre-requisitos
* Java JDK 17 instalado.
* SQL Server y SQL Server Management Studio (SSMS).
* Git instalado en el equipo.

### Pasos para ejecución local

git clone https://github.com/kathar-cmd/Proyecto-Integrador-G1M.git

## 🔄 Flujo de Trabajo

Para mantener la organización del equipo, además de las reuniones frecuentes donde distribuimos el trabajo, utilizamos **Git** y **GitHub**. 

Trabajamos directamente sobre el repositorio remoto donde los 3 integrantes somos colaboradores, enviando los avances de manera progresiva mediante *commits* e integrando los cambios desarrollados por cada integrante.

---

## 📜 Licencia y Créditos

### Equipo de Trabajo
* **Líder de Proyecto:** Miguel Ángel Herrera
* **Desarrolladores Colaboradores:** Juan Lopez, Daniel Machado

### Créditos
El proyecto fue iniciado a partir de la plantilla base proporcionada por el docente de la asignatura. Se configuró un repositorio colaborativo en GitHub para el desarrollo en equipo.