package gui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Bunzio on 15.04.2018
 * Contact: bunzeladam@gmail.com
 */

public class GuiControler implements Initializable {
    @FXML
    Label oknoDzialanie1;
    @FXML
    Label oknoZnakDzialania;
    @FXML
    Label oknoDzialanie2;
    @FXML
    TextField oknoWYnik;
    @FXML
    ProgressBar pasekPostepu;
    @FXML
    Button bSprawdz;
    @FXML
    Button bNowe;
    @FXML
    MenuItem dodawanie;
    @FXML
    MenuItem odejmowanie;
    @FXML
    MenuItem mnozenie;
    @FXML
    MenuItem dzielenie;
    @FXML
    MenuItem koniec;




    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
}
