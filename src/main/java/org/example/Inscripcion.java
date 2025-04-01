package org.example;

import java.util.Arrays;

public class Inscripcion {
    public Boolean aprobada(Alumno alumno, Materia ... materias) {
        return Arrays.stream(materias)
                .allMatch(materia -> alumno.puedeInscribirse(materia));
    }
}
