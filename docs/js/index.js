import { lessons } from './lessons.js'

let numLessons = 0

const getLessons = (lessonsIndex) => lessons[lessonsIndex]
getLessons(0)

// Crea una función para devolver el objeto de ejercicio para el índice de ejercicio dado
const getExercise = (exerciseIndex) => getLessons(0).exercise[exerciseIndex];

// Crea una función para asignar los valores del ejercicio dado a los elementos DOM
function assignExerciseValues(exerciseIndex) {
  const exercise = getExercise(exerciseIndex);

  // Actualiza los elementos DOM
  ud.textContent = `Unidad C${getLessons(0).numLessons}-T20`;
   urlPG.href = exercise.urlPG;
  urlCode.href = exercise.urlCode;
  lessonsUnit.textContent = `Ejercicio nº ${exercise.numExercise}`;
  description.innerHTML = exercise.description;
  day.textContent = `My progress: Dia ${getLessons(0).day} de 85`;
  issue.textContent = getLessons(0).issue;
  msg.innerHTML = getLessons(0).msg;
  myProgress.innerHTML = getLessons(0).myProgress;
  myProgress.style = `width: ${getLessons(0).day}%`;
  comment.textContent = exercise.comment
}

// Crea una función para generar elementos de elemento desplegable
function createDropdownItem(exercise) {
  const a = document.createElement('a');
  a.id = exercise.numExercise;
  a.className = 'dropdown-item';
  a.textContent = `Ejercicio ${exercise.numExercise}`;

  // Añade un controlador de eventos para manejar clics en el elemento desplegable
  a.addEventListener('click', () => {
    assignExerciseValues(exercise.numExercise - 1);
  });

  return a;
}

// Obtén el primer elemento de unidad
const unit1 = document.querySelector('li');

// Añade elementos de elemento desplegable para cada ejercicio en el array de lecciones
lessons[0].exercise.forEach((exercise) => {
  const dropdownItem = createDropdownItem(exercise);
  unit1.appendChild(dropdownItem);
});


//  const originUrlCode = urlCode.innerHTML
// const originUrlPG = urlPG.innerHTML

// Añade controladores de eventos a los botones siguiente y anterior
next.addEventListener('click', () => {
  if (numLessons < getLessons(0).exercise.length - 1) {
    assignExerciseValues(++numLessons);
  }
});


previous.addEventListener('click', () => {
  if (numLessons > 0) {
    assignExerciseValues(--numLessons);
  }
});

// Asigna los valores del primer ejercicio a los elementos DOM
assignExerciseValues(numLessons);





