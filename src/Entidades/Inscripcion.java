package Entidades;

public class Inscripcion {
    private int idInscripcion;
    private int idAlumno;
    private int idMateria;
    private boolean estado;
    private int nota;

    public Inscripcion(int idInscripcion, int idAlumno, int idMateria, boolean estado, int nota) {
        this.idInscripcion = idInscripcion;
        this.idAlumno = idAlumno;
        this.idMateria = idMateria;
        this.estado = estado;
        this.nota = nota;
    }

    public Inscripcion(int idAlumno, int idMateria, boolean estado, int nota) {
        this.idAlumno = idAlumno;
        this.idMateria = idMateria;
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

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
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
        return "Inscripcion{" + "idInscripcion=" + idInscripcion + ", idAlumno=" + idAlumno + ", idMateria=" + idMateria + ", estado=" + estado + ", nota=" + nota + '}';
    }

}