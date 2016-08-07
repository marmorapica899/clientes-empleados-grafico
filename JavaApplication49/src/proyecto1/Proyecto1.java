//
//package proyecto1;
//
//import java.util.ArrayList;
//import Persona.*;
//import javax.swing.JOptionPane;
//import Menus.Menu;
//
//public class Proyecto1 {
//
//    public static void main(String[] args) {
//        
//        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
//        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
//        Empleado InstEmpleado = new Empleado(); 
//        Cliente InstCliente = new Cliente();
//        
//        Menu menu = new Menu();
//        boolean salir = false;
//        boolean found;
//        do{
//        int opcion = menu.MenuPrincipal();
//        switch (opcion){
//        
//            case 0:
//                int opcionE = menu.MenuEmpleado();
//                    switch (opcionE){
//                        case 0:
//                            empleados.add(menu.getEmpleado());
//                            javamail email1 = new javamail();
//                            
//                            
//                            
//                                String de = "ordenjedi2016";
//                                String clave = "mmmmpppp";
//                                String para = "adrian.ortiz@uamcr.net";
//                                String mensaje = "Se ha agregado correctamente el Empleado";
//                                String asunto = "ORDEN JEDI:Ingreso de Nuevo Empleado";
//                                
//                                JOptionPane.showMessageDialog(null,"Enviando correo . . . .");
//                            email1.EnvioCorreo(de, clave, para, mensaje, asunto); 
//                               
//                            break;
//                        case 1:
//                            String[] opciones = {"Busqueda por ID", "Búsqueda por Placa"};
//                            int seleccion = JOptionPane.showOptionDialog(null, "Elija el Tipo de Búsqueda", "Búsqueda de Empleados", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
//                            switch (seleccion){
//                                case 0:
//                                            int comparadorInt = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Cédula del Empleado a Buscar"));
//                                            found = false;
//                                            for (int i=0;i < empleados.size(); i++){
//                                                if (comparadorInt == empleados.get(i).getId()){
//                                                    InstEmpleado.MostrarEmpleado(empleados.get(i));
//                                                    found = true;
//                                                }
//                                            }
//                                            if (found == false){
//                                                    JOptionPane.showMessageDialog(null, "El Empleado no se encuentra en la Base de Datos");
//                                                }
//                                break;
//                                case 1: 
//                                            String comparadorStr = JOptionPane.showInputDialog("Ingrese la Placa del Taxi a Buscar");
//                                            found = false;
//                                            for (int e=0;e < empleados.size(); e++){
//                                                if (comparadorStr.equals(empleados.get(e).getTaxi().getPlaca())){
//                                                    InstEmpleado.MostrarEmpleado(empleados.get(e));
//                                                    found = true;
//                                                }
//                                            }
//                                            if (found == false){
//                                                    JOptionPane.showMessageDialog(null, "El Empleado no se encuentra en la Base de Datos");
//                                            }
//                                break;    
//                                        }
//                            break;
//                        case 2:
//                            String[] opciones2 = {"Eliminación por ID", "Eliminación por Placa"};
//                            int seleccion2 = JOptionPane.showOptionDialog(null, "Elija el tipo de Búsqueda", "Búsqueda de Empleados", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones2, opciones2[0]);
//                            switch (seleccion2){
//                                case 0:
//                                            int comparadorInt = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Cédula del Empleado a Buscar"));
//                                            found = false;
//                                            for (int o=0;o < empleados.size(); o++){
//                                                if (comparadorInt == empleados.get(o).getId()){
//                                                    String nombreE = empleados.get(o).getNombre();
//                                                    empleados.remove(o);
//                                                    JOptionPane.showMessageDialog(null, "El Empleado " + nombreE + " fue eliminado Correctamente de la Base de Datos");
//                                                    found = true;
//                                                } 
//                                            }
//                                            if ( found == false) {
//                                                    JOptionPane.showMessageDialog(null, "El Empleado no se encuentra en la Base de Datos");
//                                                }
//                                            break;
//                                case 1: 
//                                            String comparadorStr = JOptionPane.showInputDialog("Ingrese la Placa del Taxi a Buscar");
//                                            found = false;
//                                            for (int e=0;e < empleados.size(); e++){
//                                                if (comparadorStr.equals(empleados.get(e).getTaxi().getPlaca())){
//                                                    String nombreE = empleados.get(e).getNombre();
//                                                    empleados.remove(e);
//                                                    JOptionPane.showMessageDialog(null, "El Empleado " + nombreE + " fue eliminado Correctamente de la Base de Datos");
//                                                    found = true;
//                                                } 
//                                            }
//                                            if (found == false) {
//                                                    JOptionPane.showMessageDialog(null, "El Empleado no se encuentra en la Base de Datos");
//                                                }
//                                break;    
//                                        }
//                            break;
//                        case 3:
//                            JOptionPane.showMessageDialog(null, InstEmpleado.Atender());
//                            break;
//                        case 4:
//                            JOptionPane.showMessageDialog(null, InstEmpleado.Cobrar());
//                            break;
//                    }
//                break;
//            case 1:
//                int opcionC = menu.MenuCliente();
//                switch (opcionC){
//                    case 0:
//                        clientes.add(menu.getCliente());
//                        javamail email1 = new javamail();
//                                String de = "ordenjedi2016";
//                                String clave = "mmmmpppp";
//                                String para = "adrian.ortiz@uamcr.net";
//                                String mensaje = "Se ha agregado correctamente el Cliente";
//                                String asunto = "ORDEN JEDI:Ingreso de Nuevo Cliente";
//
//                                
//                                JOptionPane.showMessageDialog(null,"Enviando correo . . . .");
//                                email1.EnvioCorreo(de, clave, para, mensaje, asunto);
//                                
//                        break;
//                    case 1:
//                        int comparadorIntC = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Cédula del Cliente a Buscar"));
//                        found = false;
//                        for (int a=0;a < clientes.size(); a++){
//                            if (comparadorIntC == clientes.get(a).getId()){
//                                InstCliente.MostrarCliente(clientes.get(a));
//                                found = true;
//                            } 
//                        }
//                        if (found == false) {
//                                JOptionPane.showMessageDialog(null, "El Cliente no se encuentra en la Base de Datos");
//                            }
//                        break;
//                    case 2:
//                        int comparadorIntC2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Cédula del Cliente a Eliminar"));
//                        found = false;
//                        for (int u=0;u < clientes.size(); u++){
//                            if (comparadorIntC2 == clientes.get(u).getId()){
//                                clientes.remove(u);
//                                JOptionPane.showMessageDialog(null, "El Cliente se eliminó Correctamente");
//                                found = true;
//                            } 
//                        }
//                        if (found == false){
//                            JOptionPane.showMessageDialog(null, "El Cliente no se encuentra en la Base de Datos");
//                        }
//                        break;
//                    case 3:
//                        JOptionPane.showMessageDialog(null, "El Cliente Solicitó un Taxi");
//                        break;
//                }
//                break;
//            case 2:
//                salir = true;
//                break;
//        }           
//        }while(salir == false);
//    
//        
//    }
//    
//}
