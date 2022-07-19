/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kenethVelásquez.system;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author kenet
 */
public class FXMLDocumentController implements Initializable {
    
    //Botones
    @FXML private Button btnUno;
    @FXML private Button btnDos;
    @FXML private Button btnTres;
    @FXML private Button btnCuatro;
    @FXML private Button btnCinco;
    @FXML private Button btnSeis;
    @FXML private Button btnSiete;
    @FXML private Button btnOcho;
    @FXML private Button btnNueve;
    @FXML private Button btnCero;
    @FXML private Button btnSuma;
    @FXML private Button btnMenos;
    @FXML private Button btnMultiplicacion;
    @FXML private Button btnDivision;
    @FXML private Button btnEquisElevadoYe;
    @FXML private Button btnABC;
    @FXML private Button btnRaiz;
    @FXML private Button btnPorcentaje;
    @FXML private Button btnMasMenos;
    @FXML private Button btnC;
    @FXML private Button btnCE;
    @FXML private Button btnIgual;
    @FXML private Button btnPunto;
    @FXML private TextField txtPantalla;
    
    //Variables
    private double dato1;
    private double dato2;
    private double porcentaje;
    private double resultado;
    int op = 0;


    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        //NUMEROS
        // Número 1
        if (event.getSource() == btnUno)
            txtPantalla.setText(txtPantalla.getText() + "1");
        // Número 2
        else if (event.getSource()==btnDos)
            txtPantalla.setText(txtPantalla.getText()+ "2");
        // Número 3
        else if (event.getSource()==btnTres)
            txtPantalla.setText(txtPantalla.getText()+ "3");
        //Número 4
        else if (event.getSource()==btnCuatro)
            txtPantalla.setText(txtPantalla.getText()+ "4");
        // Número 5
        else if (event.getSource()==btnCinco)
            txtPantalla.setText(txtPantalla.getText()+ "5");
        // Número 6
        else if (event.getSource()==btnSeis)
            txtPantalla.setText(txtPantalla.getText()+"6");
        // Número 7
        else if (event.getSource()==btnSiete)
            txtPantalla.setText(txtPantalla.getText()+"7");
        // Número 8
        else if (event.getSource()==btnOcho)
            txtPantalla.setText(txtPantalla.getText()+"8");
        // Número 9
        else if (event.getSource()==btnNueve)
            txtPantalla.setText(txtPantalla.getText()+"9");
        // Número 0
        else if (event.getSource()==btnCero)
            txtPantalla.setText(txtPantalla.getText()+"0");
        //Suma
        else if (event.getSource()== btnSuma){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op = 1;
        }
        //Resta
        else if (event.getSource()==btnMenos){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op = 2;
        }
        //Division
        else if(event.getSource()==btnDivision){
            dato1 =Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op = 3;
        }
        //Multiplicación
        else if (event.getSource()==btnMultiplicacion){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op = 4;
        }
       
        // Boton Igual
        else if (event.getSource()==btnIgual){
            dato2 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
                switch(op){
                    //Suma
                    case 1:
                        resultado = dato1 + dato2;
                        txtPantalla.setText(String.valueOf(resultado));
                    break;
                    //Resta
                    case 2:
                        resultado = dato1 - dato2;
                        txtPantalla.setText(String.valueOf(resultado));
                    break;
                    //Division
                    case 3:
                        resultado = dato1 / dato2;
                        txtPantalla.setText(String.valueOf(resultado));
                    break;
                    //Multiplicación
                    case 4: 
                        resultado = dato1 * dato2;
                        txtPantalla.setText(String.valueOf(resultado));
                    break;
                    //Raiz
                    case 5:
                        txtPantalla.setText(String.valueOf(Math.pow(dato1, dato2)));
                    break;
                    
                }
        } 
        //Boton CE
        else if (event.getSource()==btnCE)
            txtPantalla.clear();
        //Boton C
        else if (event.getSource()==btnC){
            dato1 = 0;
            dato2 = 0;
            resultado = 0;
            op = 0;
            txtPantalla.clear();
        }
        //Boton MasMenos
        else if (event.getSource()==btnMasMenos){
            if (Double.parseDouble(txtPantalla.getText())>0)
                txtPantalla.setText(String.valueOf(Double.parseDouble(txtPantalla.getText())* -1));
            
            else 
                txtPantalla.setText(String.valueOf(Double.parseDouble(txtPantalla.getText())* -1));
                      
        }
        //Punto 
        
        else if (event.getSource()==btnPunto){
            
            if (txtPantalla.getText().length()==0)
                txtPantalla.setText(txtPantalla.getText()+"0.");
            else if(!(txtPantalla.getText().contains("."))){
               txtPantalla.setText(txtPantalla.getText()+".");
            }
             btnPunto.setDisable(false);   
        }
        //Raíz
        else if (event.getSource()==btnRaiz){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            txtPantalla.setText(String.valueOf(Math.sqrt(dato1)));
        }
        //X elevado a Y
        else if (event.getSource()==btnEquisElevadoYe){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op=5;
        }
        //boton ABC(Valor Absoluto)
        else if (event.getSource()==btnABC){
            if (Double.parseDouble(txtPantalla.getText())>0)
                txtPantalla.setText(String.valueOf(Double.parseDouble(txtPantalla.getText())* 1));
            
            else 
                txtPantalla.setText(String.valueOf(Double.parseDouble(txtPantalla.getText())* -1));
                      
        }
        //porcentaje 
        else if (event.getSource()== btnPorcentaje){
            dato2 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            resultado= (dato1*dato2)/100;
            txtPantalla.setText(String.valueOf(resultado));
            
            
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
