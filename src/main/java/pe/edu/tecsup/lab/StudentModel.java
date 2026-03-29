package pe.edu.tecsup.lab;

public class StudentModel {

    private int id;
    private String nombre;
    private String apellido;

    public StudentModel(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public void actualizarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
        System.out.println("Nombre actualizado correctamente");
    }

    public void mostrarInfo() {
        System.out.println("===== DATOS DEL ESTUDIANTE =====");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }
}