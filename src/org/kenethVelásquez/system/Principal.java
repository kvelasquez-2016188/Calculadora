package org.kenethVelásquez.system;

import javafx.scene.image.Image;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *  Programador: Keneth Abraham Velásquez Batz
 *  carnet: 2016188
 *  código academico: IN5AM
 *  modificaciones:
 *      Fecha de Creación: 14/04/2021
 *      SceneBuilder: 14/04/2021
 *      FXMLControler:22/04/2021
 *      Calculadora terminada:22/04/2021
 * 
 */
public class Principal extends Application {
    
    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        escenarioPrincipal.setScene(scene);
        escenarioPrincipal.setTitle("Calculadora Cientifica Keneth Velásquez");
        escenarioPrincipal.show();
        escenarioPrincipal.getIcons().add(new Image("/org/kenethVelasquez/image/Calculadora.png"));

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
