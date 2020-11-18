package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    public static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage = primaryStage;
        stage.setTitle("App");
        stage.setScene(new Scene(root));
        stage.setMinWidth(1280);
        stage.setMinHeight(720);
        stage.initStyle(StageStyle.UNDECORATED);
        ResizeHelper.addResizeListener(stage);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
