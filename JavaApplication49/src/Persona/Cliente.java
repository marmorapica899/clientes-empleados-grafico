package Persona;


import javax.swing.JOptionPane;

public class Cliente extends Persona{

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    public Cliente(){
        
    }
    
    
    public Cliente (int id, int edad, char genero, String nombre, String apellido, String direccion, String telefono, String email, String Fecha){
        
        this.id = id;
        this.edad = edad;
        this.genero = genero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.Fecha=Fecha;
        
    }
    
    public void MostrarCliente(Cliente cliente){
        JOptionPane.showMessageDialog(null, "A continuación la Información del Cliente");
        if (cliente.getGenero() == 'M'){
        JOptionPane.showMessageDialog(null, "La cedula de identidad del Cliente es: " + cliente.getId() + " y su Genero es: Masculino");
        } else {
            JOptionPane.showMessageDialog(null, "La cedula de identidad del Cliente es: " + cliente.getId() + " y su Genero es: Femenino");
        }
        JOptionPane.showMessageDialog(null, "El nombre del empleado es: " + cliente.getNombre() + " " + cliente.getApellido());
        JOptionPane.showMessageDialog(null, "De " + cliente.getEdad() + " años y vecino de " + cliente.getDireccion());
        JOptionPane.showMessageDialog(null, "Su email es: " + cliente.getEmail() + " y su teléfono: " + cliente.getTelefono());       
        JOptionPane.showMessageDialog(null, "Fin del Reporte.");
    }
}    

