public class Universidad {
    // Atributos
    private String nombreProfesor;
    private int numeroEmpleado;
    private String areaEspecializacion;
    private String nombreCurso;
    private int codigoCurso;
    private int creditos;
    private String nombreEstudiante;
    private int numeroMatricula;
    private String correo;

    // Constructor
    public Universidad(String nombreProfesor, int numeroEmpleado, String areaEspecializacion,
                       String nombreCurso, int codigoCurso, int creditos,
                       String nombreEstudiante, int numeroMatricula, String correo) {
        this.nombreProfesor = nombreProfesor;
        this.numeroEmpleado = numeroEmpleado;
        this.areaEspecializacion = areaEspecializacion;
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
        this.creditos = creditos;
        this.nombreEstudiante = nombreEstudiante;
        this.numeroMatricula = numeroMatricula;
        this.correo = correo;
    }

    // Métodos
    public void impartirCurso() {
        System.out.println("El profesor " + nombreProfesor + " está impartiendo el curso " + nombreCurso);
    }

    public void inscribirEstudiante() {
        System.out.println("El estudiante " + nombreEstudiante + " con matrícula " + numeroMatricula +
                " ha sido inscrito en el curso " + nombreCurso);
    }

    // Getters y Setters
    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getAreaEspecializacion() {
        return areaEspecializacion;
    }

    public void setAreaEspecializacion(String areaEspecializacion) {
        this.areaEspecializacion = areaEspecializacion;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
