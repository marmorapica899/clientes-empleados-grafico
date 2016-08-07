
package clientes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class FXMLClientesController implements Initializable {

   @FXML
    private Button btnRegresar;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        
        Stage stage;
        Parent root;
        
      
        stage=(Stage) btnRegresar.getScene().getWindow();            
        root = FXMLLoader.load(getClass().getResource("/navegacion/FXMLDocument.fxml"));
    
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
