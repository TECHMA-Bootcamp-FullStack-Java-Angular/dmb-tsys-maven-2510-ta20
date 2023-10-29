export const lessons = [
  {
    numLessons: 4,
    issue: 'Maven',
    day: 32,
    msg: 'El mejor reto en la vida <br>Es ser la mejor version de tí cada dia',
    myProgress: '🥚>🐣>🐤>🐓>🕊️>🦃>🦅>🪂>🛩️>✈️>👨‍🚀>🚀>🛸>🦸‍♂️',

    exercise: [
      {
        numExercise: 1,
        title: '',
        description:`
        Intenta escribir una aplicación con interfaz gráfica en la que se construya una
        ventana con título y marco que tenga los controles básico (es decir, restaurar,
        maximizar y cerrar) y que al pulsar sobre el aspa de la ventana (cerrar) se salga completamente de la aplicación. 
        <br>La ventana contendrá una etiqueta y el usuario debe poder cambiar su tamaño.`,
        urlCode: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-maven-2510-ta20/blob/main/src/main/java/ejercicio_01/Ejercicio_01.java',
        urlPG: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-maven-2510-ta20/blob/main/docs/assets/20-1.png?raw=true',
      },
      {
        numExercise: 2,
        title: '',
        description: `
        Escribe una aplicación gráfica con una ventana que tenga una etiqueta y dos botones de operación.
        <br>El comportamiento de la aplicación debe reflejar en el texto de la etiqueta cuál es el último botón en el que el usuario ha hecho clic.`,
        urlCode: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-maven-2510-ta20/blob/main/src/main/java/ejercicio_02/Ejercicio_02.java',
        urlPG: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-maven-2510-ta20/blob/main/docs/assets/20-2.png?raw=true'
      },
      {
        numExercise: 3,
        title: '',
        description: `Intenta escribir una aplicación gráfica con una ventana que tenga dos etiquetas y dos
        botones de operación.<br> El comportamiento de la aplicación debe reflejar en el texto
        de las etiquetas el número de veces que el usuario ha hecho clic en cada uno de los
        botones`,
        urlCode: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-maven-2510-ta20/blob/main/src/main/java/ejercicio_03/Ejercicio_03.java',
        urlPG: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-maven-2510-ta20/blob/main/docs/assets/20-3.png?raw=true'
      },
      {
        numExercise: 4,
        title: '',
        description: `Intenta escribir una aplicación gráfica con una ventana que tenga una etiqueta y un
        área de texto. <br> La aplicación debe reflejar en el área de texto todos los eventos de
        ventana que se produzcan por la creación de la ventana o por las interacciones del
        usuario.`,
        urlCode: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-maven-2510-ta20/blob/main/src/main/java/ejercicio_04/Ejercicio_04.java',
        urlPG: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-java-0310-ta06/blob/main/src/com/tmbs/ta06_04/Main_EJ04.java'
      },
      {
        numExercise: 5,
        title: '',
        description: `
        Escribe una aplicación gráfica con una ventana que tenga un botón y un área de
        texto.  <br> La aplicación debe reflejar en el área de texto los principales eventos de ratón
        que se produzcan sobre dicha área por las interacciones del usuario. <br>Haciendo clic en
        el botón se limpiará el contenido del área de texto`, 
        urlCode: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-maven-2510-ta20/blob/main/src/main/java/ejercicio_05/Ejercicio_05.java',
        urlPG: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-maven-2510-ta20/blob/main/docs/assets/20-5.png?raw=true'
      },
      {
        numExercise: 6,
        title: '',
        description: `
        Intenta escribir una aplicación gráfica que permita calcular el índice de masa
        corporal. <br> Os recuerdo que este índice se calcula dividiendo el peso de una persona en
        kilos por el cuadrado de su altura en metros.`,
        urlCode: 'hhttps://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-maven-2510-ta20/blob/main/src/main/java/ejercicio_06/Ejercicio_06.java',
        urlPG: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-maven-2510-ta20/blob/main/docs/assets/20-6.png?raw=true'
      },
      {
        numExercise: 7,
        title: '',
        description: `
        Intenta escribir una aplicación gráfica que permita de forma sencilla realizar el
        cambio de pesetas a euros (y viceversa).<br> Por si acaso, os recuerdo que la tasa de
        cambio que se aplica es 1 euro a 166,386 pesetas.<br> En todo momento, el usuario debe
        estar informado de la conversión que se está realizando`,
        urlCode: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-maven-2510-ta20/blob/main/src/main/java/ejercicio_07/Ejercicio_07.java',
        urlPG: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-maven-2510-ta20/blob/main/docs/assets/20-7.png?raw=true'
      },
      {
        numExercise: 8,
        title: '',
        description: `Intenta mejorar la aplicación gráfica del ejercicio anterior. <br>Además de las
        funcionalidades anteriores, se debe permitir operar con los botones desde el teclado
        y hay que añadir un botón que permita borrar los campos de datos y resultado.<br>
        También para darle mayor robustez, puedes incluir un control de errores que avise
        mediante una ventana emergente si se ha introducido un número en formato
        erróneo, evitando que la aplicación se detenga.`,
        urlCode: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-maven-2510-ta20/blob/main/src/main/java/ejercicio_08/Ejercicio_08.java',
        urlPG: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-maven-2510-ta20/blob/main/docs/assets/20-8.png?raw=true'
      },
    ]
  },
]


 
