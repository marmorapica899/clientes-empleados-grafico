//package Menus;
//
//import Persona.*;
//import java.sql.Date;
//import javax.print.attribute.DateTimeSyntax;
//import javax.swing.ImageIcon;
//import javax.swing.Icon;
//
//import javax.swing.JOptionPane;
//import proyecto1.Proyecto1;
//
//
//
//public class Menu {
//    
//    public Empleado empleado;
//    public Cliente cliente;
//    
//public int MenuPrincipal(){
//    String[] opciones = {"Menú Empleado", "Menú Cliente", "Salir"};
//    
//    Icon icono = new ImageIcon(getClass().getResource("/Menus/uam.jpg"));
//    int seleccion = JOptionPane.showOptionDialog(null, "Seleccione la opción que desee", "UAM Express", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,icono, opciones, opciones[0]);
//
//    return seleccion;
//}
//    
//public Empleado getEmpleado(){
//    int idE = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Cédula del Empleado"));
//    int edadE = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad del Empleado"));
//    char generoE;
//    String[] opcionesGenE = {"Masculino", "Femenino"};
//    int seleccionGenE = JOptionPane.showOptionDialog(null, "Elija el Genero del Empleado"," Empleado", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesGenE, opcionesGenE[0]);
//    if (seleccionGenE == 0){
//        generoE = "Masculino".charAt(0);
//    }else { 
//        generoE = "Femenino".charAt(0);
//    }
//    String nombreE = JOptionPane.showInputDialog("Ingrese el Nombre del Empleado");
//    String apellidoE = JOptionPane.showInputDialog("Ingrese el Apellido del Empleado");
//    String direccionE = JOptionPane.showInputDialog("Ingrese la Direccion del Empleado");
//    String telefonoE = JOptionPane.showInputDialog("Ingrese el Número Telefónico del Empleado");
//    String emailE = JOptionPane.showInputDialog("Ingrese el email del Empleado");
//    String FechaE=JOptionPane.showInputDialog("Ingrese Fecha ingreso del Empleado");
//    String licenciaE = JOptionPane.showInputDialog("Ingrese la Licencia del Empleado");
//    String marca = JOptionPane.showInputDialog("Ingrese la Marca del Taxi");
//    String modelo = JOptionPane.showInputDialog("Ingrese el Modelo del Taxi");
//    String placa = JOptionPane.showInputDialog("Ingrese la PLaca del Taxi");
//    int anno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año del Taxi"));
//    int cilindraje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Cilindraje del Taxi"));
//    int puertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Número de Puertas del Vehiculo"));
//    int pasajeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Cantidad de Máxima de Pasajeros del Taxi"));
//
//    boolean gps = false; 
//    int opcionGps = JOptionPane.showConfirmDialog(null,
//            "El Taxi tiene GPS?", "Por Favor elija",
//            JOptionPane.YES_NO_OPTION);
//        if(opcionGps==1) 
//            gps = true;
//            else
//                if(opcionGps==0)
//                gps = false;
//
//    boolean rampa = false;
//    int opcionRampa = JOptionPane.showConfirmDialog(null,
//                                         "El Taxi tiene Rampa?", "Por Favor elija",
//                                         JOptionPane.YES_NO_OPTION);
//        if(opcionRampa==1) 
//            rampa = true;
//        else
//            if(opcionRampa==0)
//            rampa = false;
//    JOptionPane.showMessageDialog(null, "El Empleado se almacenó Correctamente");
//    Empleado empleado = new Empleado(idE, edadE, generoE, nombreE, apellidoE, direccionE, telefonoE, emailE, licenciaE, marca, modelo, anno, cilindraje, puertas, pasajeros, placa, gps, rampa, FechaE);
//    return (empleado);
//}
//
//public Cliente getCliente(){
//    int idC = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Cédula del Cliente"));
//    int edadC = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad del Cliente"));
//    char generoC;
//    String[] opcionesGenC = {"Masculino", "Femenino"};
//    int seleccionGenC = JOptionPane.showOptionDialog(null, "Elija el Genero del Cliente"," Cliente", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesGenC, opcionesGenC[0]);
//    if (seleccionGenC == 0){
//        generoC = "Masculino".charAt(0);
//    }else { 
//        generoC = "Femenino".charAt(0);
//    }
//    String nombreC = JOptionPane.showInputDialog("Ingrese el Nombre del Cliente");
//    String apellidoC = JOptionPane.showInputDialog("Ingrese el Apellido del Cliente");
//    String direccionC = JOptionPane.showInputDialog("Ingrese la Direccion del Cliente");
//    String telefonoC = JOptionPane.showInputDialog("Ingrese el Número Telefónico del Cliente");
//    String emailC = JOptionPane.showInputDialog("Ingrese el email del Cliente");
//    String FechaC=JOptionPane.showInputDialog("Ingrese Fecha ingreso del Cliente");
//    JOptionPane.showMessageDialog(null, "El Cliente se almacenó Correctamente");
//    Cliente cliente = new Cliente(idC, edadC, generoC, nombreC, apellidoC, direccionC, telefonoC, emailC,FechaC);
//    return (cliente);
//}
//
//public int MenuEmpleado(){
//    Icon icono = new ImageIcon(getClass().getResource("/Menus/empleados.png"));
//    String[] opciones = {"Ingresar Empleado", "Buscar Empleado", "Eliminar un Empleado", "Atender Cliente", "Cobrar Tarifa"};
//    int seleccion = JOptionPane.showOptionDialog(null, "Seleccione la opción que desee", "UAM Express: Menu Empleado", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icono, opciones, opciones[0]);
//    return seleccion;
//}
//
//public int MenuCliente(){
//    Icon icono = new ImageIcon(getClass().getResource("/Menus/clientes.jpg"));
//    String[] opcionesC = {"Ingresar Cliente", "Buscar Cliente", "Eliminar Cliente", "Solicitar Taxi"};
//    int seleccion = JOptionPane.showOptionDialog(null, "Seleccione la opción que desee", "UAM Express: Menu Cliente", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,icono, opcionesC, opcionesC[0]);
//    return seleccion;
//
//}
//}
