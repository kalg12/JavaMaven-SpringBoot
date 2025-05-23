# 🚀 Guía de Instalación de Spring Boot + Maven

Esta guía te muestra cómo instalar Maven y ejecutar un proyecto de Spring Boot usando IntelliJ IDEA o Visual Studio Code.

---

## 🔧 Paso 1: Instalar Java JDK 17+

Asegúrate de que Java esté instalado en tu sistema. Para verificar:

```bash
java -version
```

Si no está instalado, descárgalo desde [https://adoptium.net/](https://adoptium.net/) (Temurin JDK).

---

## ⚙️ Paso 2: Instalar Maven

### ✅ Opción A: Windows

1. Descarga el último **archivo zip binario** desde:  
   [https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi)

2. Extrae el archivo en una carpeta (por ejemplo, `C:\Maven`)

3. Configura las **variables de entorno**:
   - Agrega una nueva variable del sistema:
     ```
     MAVEN_HOME = C:\Maven
     ```
   - Edita tu variable `Path` y añade:
     ```
     C:\Maven\bin
     ```

4. Abre una nueva terminal y prueba:
   ```bash
   mvn -v
   ```

📺 *Video recomendado para instalación en Windows:*  
[Instalar Maven en Windows](https://www.youtube.com/results?search_query=install+maven+windows)

---

### ✅ Opción B: macOS

1. Usa Homebrew:
   ```bash
   brew install maven
   ```

2. Verifica la instalación:
   ```bash
   mvn -v
   ```

📺 *Video recomendado para instalación en Mac:*  
[Instalar Maven en macOS](https://www.youtube.com/results?search_query=install+maven+mac)

---

## 📁 Paso 3: Clonar el Proyecto

```bash
git clone [https://github.com/tu-usuario/tu-repo-springboot.git](https://github.com/kalg12/JavaMaven-SpringBoot)
cd JavaMaven-SpringBoot
```

---

## 📦 Paso 4: Instalar Dependencias del Proyecto

```bash
mvn clean install
```

---

## ▶️ Paso 5: Ejecutar la Aplicación Spring Boot

```bash
mvn spring-boot:run
```

Luego abre tu navegador y visita:

```
http://localhost:8080
```

---

## 🧠 Opcional: Habilitar Recarga Automática Durante el Desarrollo

Para recargar automáticamente al guardar:

1. Agrega esto a tu archivo `pom.xml`:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <scope>runtime</scope>
    <optional>true</optional>
</dependency>
```

2. Reinicia el proyecto con `mvn spring-boot:run`.

3. (Opcional) Instala una extensión LiveReload en tu navegador.

---

## ✅ Estructura de Proyecto Sugerida

```
src/
├── main/
│   ├── java/
│   │   └── com/example/demo/
│   │       └── HelloController.java
│   └── resources/
│       └── templates/
│           └── index.html
└── pom.xml
```

---

## 🙌 ¡Listo!

Si ves `Hello from Spring Boot!` en el navegador, tu configuración está completa.

¡Modifica el controlador, la plantilla HTML o agrega tu propia lógica!
