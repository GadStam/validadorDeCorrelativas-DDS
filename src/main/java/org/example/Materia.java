package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Materia {
    private String nombre;
    private int codigo;
    private List<Materia> correlativas;

    public Materia(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.correlativas = new ArrayList<>();

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public void agregarCorrelativa(Materia ... materias) {
        Collections.addAll(this.correlativas, materias);
    }
}
