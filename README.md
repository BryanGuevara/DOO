# DOO

**DOO** (**D**iseño **O**rientado a **O**bjetos) ofrece un conjunto de diseños predeterminados que se pueden aplicar de manera uniforme en todos tus proyectos, asegurando una apariencia estética consistente. Los estilos cubren una amplia variedad de componentes visuales (como tablas, botones, campos de texto, etc.), y el color predeterminado para estos elementos es RGB(56, 56, 56). 

Todos los componentes pueden ser configurados y personalizados mediante los métodos `style()` y `colorSet()`.

Además, algunos comportamientos interactivos están integrados:

- **Efecto de hover (pasar el ratón)**: Este efecto está disponible para las tablas y para los items de los ComboBox. Cuando el ratón pasa sobre una fila de la tabla y los items del ComboBox, el fondo de esa fila cambia al **color complementario** para resaltar visualmente la fila sobre la que el usuario está interactuando.

- **Efecto al presionar**: Este comportamiento está disponible tanto para los botones como para las filas de la tabla. Cuando se **presiona un botón** o **se hace clic en una fila de la tabla**, el fondo de ese componente se cambia automáticamente al **color complementario**, proporcionando una retroalimentación visual clara para el usuario.

Además, en cuanto al color del texto (foreground), el sistema realiza una conversión de los valores RGB a HSL (Hue, Saturation, Lightness) para determinar el nivel de **brillo** del color. Según el valor de luminosidad, el sistema selecciona automáticamente el color de texto adecuado: **blanco** o **negro**, asegurando un buen contraste y legibilidad en cualquier fondo.

## Frame

- Bloquedo del redimencionado.
- Aparece en el centro de la pantalla.
- Icono personalizado.
- Titulo personalizado

### Requisitos para usarlo

Para usar este diseño, necesitas:
- Un `jFrame`

### Forma de uso

#### Pasos:

1. Crea una instancia de `GlobalStyle`
2. Configura el frame

**1. Crea una instancia de `GlobalStyle`**

```java
// Crea la instancia
GlobalStyle global = new GlobalStyle();
```

**2. Configuración del frame**

```java
// Aplica el estilo a la tabla, pasando los parámetros necesarios, un this para marcarle que es el frame usado actualmente, el nombre del frame para el titlulo, la ruta de el icono a usar
global.Frame().configureFrame(this, "Pagina Principal", "src/img/icono.png");
```

## Table

- Nuevo diseño predeterminado para las tablas.
- Opción de personalizar el color.

### Requisitos para usarlo

Para usar este diseño, necesitas:
- Un `JTable`
- Un `Table Model`
- Un array con los nombres de las columnas
- Un array bidimensional con las filas de la tabla

### Forma de uso

#### Pasos:

1. Crea una instancia de `GlobalStyle`
2. Configura la tabla
3. Añade las filas

**1. Crea una instancia de `GlobalStyle`**

```java
// Crea la instancia
GlobalStyle global = new GlobalStyle();
```

**2. Configuración de la tabla**

```java
// Crea un modelo para la tabla
DefaultTableModel animales = new DefaultTableModel();

// Aplica el estilo a la tabla, pasando los parámetros necesarios
global.Table().style(jTable, jScrollPane, animales, new String[]{"Animal", "Nombre posible"});
```

**3. Añadir filas a la tabla**

```java
String[][] localesData = {
    {"Gato", "Mufasa"},
    {"Perro", "Firulais"},
    {"Conejo", "Bugs"},
    {"Tortuga", "Donatello"},
    {"Pájaro", "Rio"},
    {"Hamster", "Turbo"},
    {"Pececito", "Nemo"},
    {"León", "Simba"},
    {"Caballo", "Spirit"},
    {"Cebra", "Zazu"}
};

// Añade las filas a la tabla
global.Table().addRowTable(localesData);
```

**(Opcional) cambia el color**

```java
global.Table().ColorSet(R, G, B);
```

## Button

- Nuevo diseño predeterminado para los botones.
- Opción de personalizar el color.

### Requisitos para usarlo

Para usar este diseño, necesitas:
- Un `JButton`

### Forma de uso

#### Pasos:

1. Crea una instancia de `GlobalStyle`
2. Configura el boton

**1. Crea una instancia de `GlobalStyle`**

```java
// Crea la instancia
GlobalStyle global = new GlobalStyle();
```

**2. Configuración del button**

```java
// Aplica el estilo a la tabla, pasando los parámetros necesarios
global.Button().style(JButton);
```

#### Pasos (Opción de varios buttons):

1. Crea una instancia de `GlobalStyle`
2. crear un array de buttons
2. Configura el boton

**1. Crea una instancia de `GlobalStyle`**

```java
// Crea la instancia
GlobalStyle global = new GlobalStyle();
```

**2. Crear un array con los buttons**

```java
 JButton[] botones = new JButton[]{
            JButton1, JButton2, JButton3
        };
```

**3. Configuración de los buttons**

```java
// Aplica el estilo a los buttons, pasando los parámetros necesarios
global.Button().styleArray(botones);
```

**(Opcional) cambia el color**

```java
global.Button().ColorSet(R, G, B);
```

## TextField

- Nuevo diseño predeterminado para los campos de texto.
- Opción de personalizar el color.

### Requisitos para usarlo

Para usar este diseño, necesitas:
- Un `JTextField`

### Forma de uso

#### Pasos:

1. Crea una instancia de `GlobalStyle`
2. Configura el TextField

**1. Crea una instancia de `GlobalStyle`**

```java
// Crea la instancia
GlobalStyle global = new GlobalStyle();
```

**2. Configuración del TextField**

```java
// Aplica el estilo al TextField, pasando los parámetros necesarios
global.TextField().style(jTextField);
```

**(Opcional) Cambia el color**

```java
global.TextField().ColorSet(R, G, B);
```

## PasswordField

- Nuevo diseño predeterminado para los campos de contraseña.
- Opción de personalizar el color.

### Requisitos para usarlo

Para usar este diseño, necesitas:
- Un `JPasswordField`

### Forma de uso

#### Pasos:

1. Crea una instancia de `GlobalStyle`
2. Configura el PasswordField

**1. Crea una instancia de `GlobalStyle`**

```java
// Crea la instancia
GlobalStyle global = new GlobalStyle();
```

**2. Configuración del PasswordField**

```java
// Aplica el estilo al PasswordField, pasando los parámetros necesarios
global.PasswordField().style(jPasswordField);
```

**(Opcional) Cambia el color**

```java
global.PasswordField().ColorSet(R, G, B);
```

## TextArea

- Nuevo diseño predeterminado para las áreas de texto.
- Opción de personalizar el color.

### Requisitos para usarlo

Para usar este diseño, necesitas:
- Un `JTextArea`

### Forma de uso

#### Pasos:

1. Crea una instancia de `GlobalStyle`
2. Configura el TextArea

**1. Crea una instancia de `GlobalStyle`**

```java
// Crea la instancia
GlobalStyle global = new GlobalStyle();
```

**2. Configuración del TextArea**

```java
// Aplica el estilo al TextArea, pasando los parámetros necesarios
global.TextArea().style(textArea);
```

**(Opcional) Cambia el color**

```java
global.TextArea().ColorSet(R, G, B);
```

## Slider

- Nuevo diseño predeterminado para los deslizadores.
- Opción de personalizar el color.

### Requisitos para usarlo

Para usar este diseño, necesitas:
- Un `JSlider`

### Forma de uso

#### Pasos:

1. Crea una instancia de `GlobalStyle`
2. Configura el Slider

**1. Crea una instancia de `GlobalStyle`**

```java
// Crea la instancia
GlobalStyle global = new GlobalStyle();
```

**2. Configuración del Slider**

```java
// Aplica el estilo al Slider, pasando los parámetros necesarios
global.Slider().style(JSlider);
```

**(Opcional) Cambia el color**

```java
global.Slider().ColorSet(R, G, B);
```

## ComboBox

- Nuevo diseño predeterminado para los ComboBox.
- Opción de personalizar el color.

### Requisitos para usarlo

Para usar este diseño, necesitas:
- Un `JComboBox`

### Forma de uso

#### Pasos:

1. Crea una instancia de `GlobalStyle`
2. Configura el ComboBox

**1. Crea una instancia de `GlobalStyle`**

```java
// Crea la instancia
GlobalStyle global = new GlobalStyle();
```

**2. Configuración del ComboBox**

```java
// Aplica el estilo al ComboBox, pasando los parámetros necesarios
global.ComboBox().style(JComboBox);
```

**(Opcional) Cambia el color**

```java
global.ComboBox().ColorSet(R, G, B);
```

## TextPanel (text/html)

- Diseño **CSS** ya preestablecido en **modo obscuro**

### Requisitos para usarlo

Para usar este diseño, necesitas:
- Un `JTextPanel`
- Que el JTextPanel este configurado para renderizar **HTML**

### Forma de uso

#### Pasos:

1. Crea una instancia de `GlobalStyle`
2. Configura el TextPanel
**1. Crea una instancia de `GlobalStyle`**

```java
// Crea la instancia
GlobalStyle global = new GlobalStyle();
```

**2 v1. Configuración del TextPanel (si escribes desde el edior grafico)**

```java
// Aplica el estilo al TextPanel, aplicando un setText y concatenando lo ya escrito al final
jTextPanel.setText(global.Panel().CSS() + jTextPanel.getText());
```


**2 v2. Configuración del TextPanel (si escribes desde el codigo)**

```java
// Crea tu String con el Html que usaras
String text = "<h1>Hola mundo</h1>"

// Aplica el estilo al TextPanel, aplicando un setText
jTextPanel.setText(global.Panel().CSS());

// Ahora pon el setText con tu String que contiene el html
jTextPanel.setText(text);
```

**2 v2.5. Configuración del TextPanel**

```java
// Crea tu String con el Html que usaras
String text = "<h1>Hola mundo</h1>"

// Aplica el estilo al TextPanel, aplicando un setText concatenando tu String que contiene el html
jTextPanel.setText(global.Panel().CSS() + text);
```