package components.header;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import sample.Main;

public class Header {
    private double xOff = 0;
    private double yOff = 0;

    public void movePressed(MouseEvent mouseEvent) {
        xOff = Main.stage.getX() - mouseEvent.getScreenX();
        yOff = Main.stage.getY() - mouseEvent.getScreenY();
    }

    public void moveDragged(MouseEvent mouseEvent) {
        Main.stage.setX(mouseEvent.getScreenX() + xOff);
        Main.stage.setY(mouseEvent.getScreenY() + yOff);
    }

    public void closeApp(ActionEvent actionEvent) {
        Platform.exit();
    }
}
