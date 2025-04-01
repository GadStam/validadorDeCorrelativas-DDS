package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InscripcionTest {
    @Test
    public void testInscripcionAprobada() {
        // Arrange
        Materia materia1 = new Materia("Matematica", 101);
        Materia materia2 = new Materia("Fisica", 102);
        Alumno alumno = new Alumno("Juan", 12345678);
        Inscripcion inscripcion = new Inscripcion();
        Assertions.assertEquals(true, inscripcion.aprobada(alumno, materia1, materia2));
    }
}

