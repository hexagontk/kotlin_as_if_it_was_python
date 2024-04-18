
# Kotlin como si fuese Python

---

## Objetivo
* No es sustituir Python, si estás contento con Python está bien
  <!-- .element: class="fragment" data-fragment-index="1" -->
* Aprender a usar Kotlin desde la terminal
  <!-- .element: class="fragment" data-fragment-index="2" -->
* Comparar Kotlin con otras opciones
  <!-- .element: class="fragment" data-fragment-index="3" -->
* Ver casos de uso para Kotlin en la línea de comandos
  <!-- .element: class="fragment" data-fragment-index="4" -->
* Hemos visto previamente el lenguaje, ahora vamos a ver la plataforma
  <!-- .element: class="fragment" data-fragment-index="5" -->

---

## ¿Por qué?
* Proyecto en Java
  <!-- .element: class="fragment" data-fragment-index="1" -->
* Cargar localizaciones en ficheros CSV
  <!-- .element: class="fragment" data-fragment-index="2" -->
* Poner las zonas horarias
  <!-- .element: class="fragment" data-fragment-index="3" -->
* Guardar datos en formato properties
  <!-- .element: class="fragment" data-fragment-index="4" -->

---

## Acerca de la sesión
* Veremos un poco de teoría (pero poco)
  <!-- .element: class="fragment" data-fragment-index="1" -->
* Revisaremos código de ejemplo
  <!-- .element: class="fragment" data-fragment-index="2" -->
* Podéis interrumpir para preguntar (TBC)
  <!-- .element: class="fragment" data-fragment-index="3" -->

---

## Kotlin para scripting
* Kotlin permite ejecutar código directamente (sin compilar)
  <!-- .element: class="fragment" data-fragment-index="1" -->
* Puedes usar cualquier librería de la JVM
  <!-- .element: class="fragment" data-fragment-index="2" -->
* Permite aprovechar el conocimiento del ecosistema Java
  <!-- .element: class="fragment" data-fragment-index="3" -->
* Tarda más en arrancar (realmente, sí que compila)
  <!-- .element: class="fragment" data-fragment-index="4" -->

---

## Requisitos
* Requiere un JDK instalado
  <!-- .element: class="fragment" data-fragment-index="1" -->
* Necesitas Kotlin (tenerlo en cuenta en CI)
  <!-- .element: class="fragment" data-fragment-index="2" -->
* IntelliJ es conveniente para el desarrollo (aquí gana Python)
  <!-- .element: class="fragment" data-fragment-index="3" -->

---

## Primeros pasos
* Abrir interprete: <!-- .element: class="fragment" data-fragment-index="1" -->
  `kotlin` <!-- .element: class="fragment" data-fragment-index="1" -->
* Evaluar expresión: <!-- .element: class="fragment" data-fragment-index="2" -->
  `kotlin -e '"text".uppercase()'`<!-- .element: class="fragment" data-fragment-index="2" -->
* Ejecutar fichero: <!-- .element: class="fragment" data-fragment-index="3" -->
  `kotlin file.kts` <!-- .element: class="fragment" data-fragment-index="3" -->
* El resultado de un script es mostrado por salida estándar
  <!-- .element: class="fragment" data-fragment-index="4" -->

---

## IDE
* Configurar el JDK en el proyecto
  <!-- .element: class="fragment" data-fragment-index="1" -->
* Añadir módulo Kotlin/JVM (la librería estándar)
  <!-- .element: class="fragment" data-fragment-index="2" -->
* Con IntelliJ se puede hacer debug de scripts
  <!-- .element: class="fragment" data-fragment-index="3" -->
* A veces es necesario borrar caches por errores falsos
  <!-- .element: class="fragment" data-fragment-index="4" -->
* La extensión puede ser <!-- .element: class="fragment" data-fragment-index="5" -->
  `.kts` <!-- .element: class="fragment" data-fragment-index="5" -->
  , pero <!-- .element: class="fragment" data-fragment-index="5" -->
  `main.kts` <!-- .element: class="fragment" data-fragment-index="5" -->
  proporciona más ayuda en el IDE. <!-- .element: class="fragment" data-fragment-index="5" -->

---

## Usos típicos
* Obtener información de APIs REST
  <!-- .element: class="fragment" data-fragment-index="1" -->
* Convertir entre formatos (YAML, JSON, o CSV)
  <!-- .element: class="fragment" data-fragment-index="2" -->
* Hacer testing con scripts de Kotlin (pruebas de integración)
  <!-- .element: class="fragment" data-fragment-index="3" -->
* Crear pequeñas herramientas locales (backoffice sencillos)
  <!-- .element: class="fragment" data-fragment-index="4" -->

---

## Code Time
* Veremos como utilizar cada característica en ejemplos
  <!-- .element: class="fragment" data-fragment-index="1" -->
* Hay ejemplos que escenifican alguno de los usos típicos
  <!-- .element: class="fragment" data-fragment-index="2" -->
* DISCLAIMER: Algunos ejemplos usan Hexagon (toolkit que mantengo)
  <!-- .element: class="fragment" data-fragment-index="3" -->

---

## Extra ball
* Las diapositivas de la sesión se sirven usando un script Kotlin
  <!-- .element: class="fragment" data-fragment-index="1" -->
* También lo puedes hacer en Java, pero no molarás tanto
  <!-- .element: class="fragment" data-fragment-index="2" -->
* Se necesita un programa extra para gestionar dependencias: JBang
  <!-- .element: class="fragment" data-fragment-index="3" -->

---

## Recapitulando
Hemos visto como:
* Usar los comandos
  <!-- .element: class="fragment" data-fragment-index="1" -->
* Gestionar dependencias
  <!-- .element: class="fragment" data-fragment-index="2" -->
* Utilizar componentes visuales
  <!-- .element: class="fragment" data-fragment-index="3" -->
* Integrar scripts con la shell
  <!-- .element: class="fragment" data-fragment-index="4" -->
* Estructurar y reutilizar el código
  <!-- .element: class="fragment" data-fragment-index="5" -->

---

## Mantente al tanto
* Muchas gracias a Israel Saeta y a Madrid JUG
* Kotlin scripting está en beta. Aunque Gradle lo usa en su DSL
* Material y código: https://github.com/hexagontk/kotlin_as_if_it_was_python
* Sígueme en: [X (anteriormente Twitter)][Twitter], [GitHub] o [LinkedIn] (@jaguililla)
* Sigue [@hexagontk] (OSS en Kotlin)
* Y si te gusta el proyecto, compártelo... Y ponle una estrella!

![Material](qr.png)

[@hexagontk]: https://twitter.com/hexagontk
[Twitter]: https://twitter.com/jaguililla
[GitHub]: https://github.com/jaguililla
[LinkedIn]: https://www.linkedin.com/in/jaguililla
