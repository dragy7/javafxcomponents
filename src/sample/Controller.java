package sample;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    public BorderPane parent;
    public AnchorPane view;

    @Override
    public void initialize(URL location, ResourceBundle resources)  {
        ViewController.view = view;
        try {
            ViewController.addView("login", FXMLLoader.load(getClass().getResource("../components/login/login.fxml")));
            ViewController.addView("test", FXMLLoader.load(getClass().getResource("../components/test/test.fxml")));
            ViewController.updateView("login");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
