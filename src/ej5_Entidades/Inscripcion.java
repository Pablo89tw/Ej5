package ej5_Entidades;

public class Inscripcion {
    private int idInscripcion;
    private Alumno alumno;
    private Materia materia;
    private boolean estado;
    private int nota;

    public Inscripcion(int idInscripcion, Alumno alumno, Materia materia, boolean estado, int nota) {
        this.idInscripcion = idInscripcion;
        this.alumno = alumno;
        this.materia = materia;
        this.estado = estado;
        this.nota = nota;
    }

    public Inscripcion(Alumno alumno, Materia materia, boolean estado, int nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.estado = estado;
        this.nota = nota;
    }

    public Inscripcion() {
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "idInscripcion=" + idInscripcion + ", alumno=" + alumno + ", materia=" + materia + ", estado=" + estado + ", nota=" + nota + '}';
    }
}
