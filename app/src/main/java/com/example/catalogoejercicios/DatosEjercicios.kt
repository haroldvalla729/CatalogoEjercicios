package com.example.catalogoejercicios

object DatosEjercicios {

    val listaEjercicios = listOf(

        Ejercicio(
            nombre = "Sentadillas",
            grupoMuscular = "Piernas",
            series = 3,
            repeticiones = 12,
            descripcion = "Ejercicio básico que fortalece principalmente las piernas, trabajando los cuádriceps, glúteos e isquiotibiales.",
            indicaciones = "Mantén la espalda recta, separa los pies al ancho de los hombros, flexiona las rodillas y baja la cadera. Después regresa lentamente a la posición inicial.",
            imagen = R.drawable.img_sentadillas
        ),

        Ejercicio(
            nombre = "Flexiones de brazos",
            grupoMuscular = "Pecho",
            series = 3,
            repeticiones = 10,
            descripcion = "Ejercicio que fortalece el pecho, los hombros y los tríceps utilizando el peso corporal.",
            indicaciones = "Coloca las manos en el suelo, mantén el cuerpo recto, flexiona los codos para bajar el pecho y luego empuja para regresar a la posición inicial.",
            imagen = R.drawable.img_flexiones_brazos
        ),

        Ejercicio(
            nombre = "Abdominales",
            grupoMuscular = "Abdomen",
            series = 3,
            repeticiones = 15,
            descripcion = "Ejercicio destinado a fortalecer los músculos abdominales y mejorar la estabilidad del tronco.",
            indicaciones = "Acuéstate boca arriba, flexiona las rodillas, coloca las manos detrás de la cabeza y eleva ligeramente el torso. Baja de manera controlada.",
            imagen = R.drawable.img_abdominales
        ),

        Ejercicio(
            nombre = "Zancadas",
            grupoMuscular = "Piernas",
            series = 3,
            repeticiones = 12,
            descripcion = "Ejercicio que fortalece los cuádriceps y glúteos, además de mejorar el equilibrio y la coordinación.",
            indicaciones = "Da un paso hacia adelante, flexiona ambas rodillas manteniendo el torso recto y regresa a la posición inicial. Alterna las piernas.",
            imagen = R.drawable.img_zancadas
        ),

        Ejercicio(
            nombre = "Curl de bíceps",
            grupoMuscular = "Brazos",
            series = 3,
            repeticiones = 10,
            descripcion = "Ejercicio que desarrolla y fortalece los músculos bíceps de los brazos.",
            indicaciones = "Sujeta las mancuernas con las palmas hacia adelante. Flexiona los codos para elevarlas y bájalas lentamente sin mover los hombros.",
            imagen = R.drawable.img_curl_biceps
        ),

        Ejercicio(
            nombre = "Elevaciones laterales",
            grupoMuscular = "Hombros",
            series = 3,
            repeticiones = 12,
            descripcion = "Ejercicio enfocado en fortalecer los hombros, especialmente la parte lateral del deltoides.",
            indicaciones = "Sujeta una mancuerna en cada mano, mantén los brazos ligeramente flexionados y elévalos hacia los lados hasta la altura de los hombros. Baja lentamente.",
            imagen = R.drawable.img_elevaciones_laterales
        ),

        Ejercicio(
            nombre = "Elevación de talones",
            grupoMuscular = "Pantorrillas",
            series = 3,
            repeticiones = 15,
            descripcion = "Ejercicio que fortalece los músculos de las pantorrillas y mejora la estabilidad de los tobillos.",
            indicaciones = "Mantente de pie con los pies separados al ancho de las caderas. Eleva los talones apoyándote en las puntas de los pies y baja lentamente.",
            imagen = R.drawable.img_elevacion_talones
        ),

        Ejercicio(
            nombre = "Puente de glúteos",
            grupoMuscular = "Glúteos",
            series = 3,
            repeticiones = 12,
            descripcion = "Ejercicio que fortalece los glúteos y contribuye a mejorar la estabilidad de la cadera.",
            indicaciones = "Acuéstate boca arriba con las odillas flexionadas. Eleva la cadera contrayendo los glúteos, mantén unos segundos y desciende lentamente.",
            imagen = R.drawable.img_puente_gluteos
        )
    )
}