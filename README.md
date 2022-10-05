## Elementos fundamentales en el comportamiento de esta prueba automatizada


Carpeta `Pages` contiene clases con las funciones a realizar de cada caso de prueba *programado en Java* y la ruta del webdriver instalado.
`Steps` contiene clases e intancias de metodos  que vienen de pages donde se encuentra el orden 
de los pasos a ejecutar pertenecientes al  archivo `Form.feature`.
(`runner.java`)Contiene etiquetas para la ejecución de las pruebas.
(`hooks.java`)Contiene funcion que agrega screenshots al reporte de las pruebas.
(`build.gradle`)Contiene dependencias de los repositorios : Selenium WebDriver y Cucumber.

## Puntos Optimos de esta prueba.

Se facilita el hallazgo de posibles errores  ya que tenemos funciones que nos ayuda a encontrar
el momento exacto del problema a la hora de ejecutar las pruebas.
Buena organización en las carpetas y archivos para un mejor entendimiento del proceso de las pruebas.

## Casos de prueba que se automatizaron
### Descripción del aplicativo a probar.
- Formulario de contacto donde se tiene registro de varios tipos de casos de pruebas. 
### Modúlos o Componentes
- 1. Caso 1
- 2. Caso 2
- 3. Formulario
- 4. Registrate
- 5. Iniciar sesión
### Criterios de aceptación
- 1. Se tiene permitido ingresar a la seccion Caso 1
- 2. Se tiene permitido ingresar a la seccion Caso 1
- 3. Todos los campos del formulario deben tener validaciones y que no permita dejarlos vacios.
- 4. Se tiene permitido ingresar a la seccion de registro
- 5. Se tiene permitido ingresar a la seccion de inicio de sesión
### Precondiciones
-  ingresar link del formulario
### Datos de entrada
- Link
### Descrición de la prueba
- 1. Ingresar a la sección CASO 1
- 2. Ingresar a la sección CASO 2
- 3. Verificar que los campos que se dejan vacios tengan validaciones
- 4. Ingresar a la sección de Registro
- 5. Ingresar a la sección de Inicio de Sesión
### Guión de la prueba
- 1. Dar click en CASO 1
- 2. Dar click en CASO 2
- 3. Dar click en cada campo del formulario sin digitar ningún dato
- 4. Dar click en Registrate
- 5. Dar click en Iniciar sesión
### Resultado esperado
- 1. Se visualiza el formulario correspondiente al caso 1.
- 2. Se visualiza el formulario correspondiente al caso 2.
- 3. Se visualizan validaciones que no permiten dejar campos vacios
- 4. Se visualiza el formulario de registro
- 5. Se visualiza el formulario de inicio de sesión

