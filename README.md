###Diseño con Layout###

**Introducción**
Los entornos de diseño, también conocidos  como entornos de maquetación o entornos de composición, son herramientas digitales que permiten a los usuarios crear y organizar elementos visuales.

**Desarrollo**

Este programa utiliza JavaFX para crear una interfaz de usuario interactiva. A continuación, se detallan los componentes principales y las funcionalidades clave del prog:


### Componentes Principales:

1. **ListView**: Una lista donde se pueden agregar elementos de texto. Se utiliza para mostrar información cuando se interactúa con partes específicas de la interfaz.
2. **TextField**: Un campo de texto donde el usuario puede escribir y enviar información. En este caso, se utiliza para añadir elementos a la lista.
3. **Label**: Estas contienen el nombre de cada uno de los usuarios.
4. **ImageView**: Elementos gráficos que muestran imágenes cargadas desde archivos locales.
5. **BorderPane**: Un contenedor de JavaFX que divide la ventana en cinco regiones: superior, inferior, izquierda, derecha y centro. En este programa, la región izquierda alberga etiquetas e imágenes, mientras que la región derecha contiene el ListView y el TextFiel


![Captura de pantalla (135)](https://github.com/Dayana-Sabando/tarea/assets/168872451/38ff506f-8250-45fb-9d7b-6fb3ac292d61)



- El programa comienza creando un **BorderPane** como raíz de la escena principal.
- En el lado izquierdo (*leftPane*), se colocan cinco imágenes junto con sus etiquetas asociadas. Cada etiqueta tiene un nombre (como "Erick Marcos Rivera Salazar") y una imagen correspondiente.
- En el lado derecho (*rightPane*), se encuentra un **ListView** y un **TextField**. El ListView muestra texto de diferentes fuentes, mientras que el TextField permite al usuario agregar nuevos elementos a la lista.
- **Evento de Clic en las Etiquetas**: Se definen manejadores de eventos para cada etiqueta en el leftPane. Al hacer clic en una etiqueta, se agrega información al ListView en el rightPane. La información proviene de un mapa llamado labelData, que contiene detalles como cédula, profesión, edad, teléfono, correo electrónico y fecha de nacimiento.
- **Evento de Presión de Tecla**: El TextField está configurado para añadir su contenido al ListView cuando el usuario presiona la tecla Enter. Luego, el campo se vacía automáticamente para permitir nuevas entradas.
- **Posicionamiento de Elementos**: Se utiliza AnchorPane y sus métodos para establecer la posición de cada elemento. Por ejemplo, se define la posición de cada etiqueta y su imagen, con separación vertical entre ellas.
- **Estilos Visuales**: El programa aplica estilos personalizados al ListView y al TextField, utilizando colores específicos para el fondo y el texto.


![Captura de pantalla (130)](https://github.com/Dayana-Sabando/tarea/assets/168872451/8e92d8ae-3cc1-481f-9bc6-d569238d4111)
