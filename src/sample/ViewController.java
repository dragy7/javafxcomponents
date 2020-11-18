package sample;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.HashMap;

public class ViewController {
    public static HashMap<String, Parent> views = new HashMap<>();
    public static AnchorPane view;

    public static void addView(String name, Parent view) {
        views.put(name, view);
    }

    public static void removeView(String name) {
        views.remove(name);
    }

    public static void updateView(String name) {
        view.getChildren().clear();
        view.getChildren().add(views.get(name));
        view.getChildren().get(0).prefWidth(view.getWidth());
        view.getChildren().get(0).prefHeight(view.getHeight());
    }

}
