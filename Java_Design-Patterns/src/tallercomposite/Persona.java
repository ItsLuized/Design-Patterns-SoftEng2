package tallercomposite;

public class Persona implements Componente {

    private String nombre;
    private String direccion;
    private String clave;
    private String correo;
    private String telefono;
    private String ciudad;

    public Persona() {
        this.nombre = "";
        this.direccion = "";
        this.clave = "";
        this.correo = "";
        this.telefono = "";
        this.ciudad = "";
    }

    public Persona(String nombre, String direccion, String clave, String correo, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.clave = clave;
        this.correo = correo;
        this.telefono = telefono;
        this.ciudad = "";
    }

    @Override
    public void lugar(String ciudad) {
        this.ciudad = ciudad;
        System.out.println(this.nombre + " con dirección " + this.direccion + ", de correo " + this.correo + ", telefono " + this.telefono + " es de la ciudad " + this.ciudad);
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
