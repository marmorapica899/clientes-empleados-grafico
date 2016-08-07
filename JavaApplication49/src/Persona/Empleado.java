package Persona;

import Transporte.*;

import javax.swing.JOptionPane;

public final class Empleado extends Persona{
    public String licencia;
    
    public Taxi taxi = new Taxi();

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

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

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
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
    
    public Taxi getTaxi() {
        return this.taxi;
    }
    
    public String Atender(){
        
        return "El empleado está atendiendo al cliente";
    }
    
    public String Cobrar(){
        int km = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Cantidad de KM Recorridos"));
        double tarifa = 400;
        return "El costo del viaje es: " + (tarifa * km) + " colones.";
    }
    
    public Empleado(){
        
    }
    
    public Empleado(int id, int edad, char genero, String nombre, String apellido, String direccion, String telefono, String email, String licencia, String marca, String modelo, int anno, int cilindraje, int puertas, int pasajeros, String placa, boolean gps, boolean rampa,String Fecha){
        this.id = id;
        this.edad = edad;
        this.genero = genero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.licencia = licencia;
        this.Fecha=Fecha;
        
        this.getTaxi().setMarca(marca);
        this.getTaxi().setModelo(modelo);
        this.getTaxi().setCilindraje(cilindraje);
        this.getTaxi().setAnno(anno);
        this.getTaxi().setPuertas(puertas);
        this.getTaxi().setPasajeros(pasajeros);
        this.getTaxi().setGps(gps);
        this.getTaxi().setPlaca(placa);
        this.getTaxi().setRampa(rampa);
    }
    
    public void MostrarEmpleado(Empleado empleadoB){
        JOptionPane.showMessageDialog(null, "A continuación la Información del Empleado");
        if (empleadoB.getGenero() == 'M'){
        JOptionPane.showMessageDialog(null, "La cedula de identidad del empleado es: " + empleadoB.getId() + " y su Genero es: Masculino");
        } else {
            JOptionPane.showMessageDialog(null, "La cedula de identidad del empleado es: " + empleadoB.getId() + " y su Genero es: Femenino");
        }
        JOptionPane.showMessageDialog(null, "El nombre del empleado es: " + empleadoB.getNombre() + " " + empleadoB.getApellido());
        JOptionPane.showMessageDialog(null, "Con Licencia Tipo: "+ empleadoB.getLicencia() +", de " + empleadoB.getEdad() + " años y vecino de " + empleadoB.getDireccion());
        JOptionPane.showMessageDialog(null, "Su email es: " + empleadoB.getEmail() + " y su teléfono: " + empleadoB.getTelefono());
        JOptionPane.showMessageDialog(null, "Posee una Taxi: " + empleadoB.getTaxi().getMarca() + " " + empleadoB.getTaxi().getModelo() + ", Año: " + empleadoB.getTaxi().getAnno());
        JOptionPane.showMessageDialog(null, "Placa: " + empleadoB.getTaxi().getPlaca() + ", " + empleadoB.getTaxi().getCilindraje() + "CC");
        JOptionPane.showMessageDialog(null, empleadoB.getTaxi().getPuertas() + " Puertas y para " + empleadoB.getTaxi().getPasajeros() + " Pasajeros");
        if (empleadoB.getTaxi().isGps() == true){
            JOptionPane.showMessageDialog(null, "El Taxi tiene GPS");
        } else {
            JOptionPane.showMessageDialog(null, "El Taxi no tiene GPS");
        }
        if (empleadoB.getTaxi().isRampa() == true){
            JOptionPane.showMessageDialog(null, "El Taxi tiene Rampa");
        } else {
            JOptionPane.showMessageDialog(null, "El Taxi no tiene Rampa");
        }
        JOptionPane.showMessageDialog(null, "Fin del Reporte.");
    
        
    }
    
}
