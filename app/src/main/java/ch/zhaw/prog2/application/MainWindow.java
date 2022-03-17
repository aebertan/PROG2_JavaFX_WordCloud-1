package ch.zhaw.prog2.application;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class MainWindow extends javafx.application.Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        openMainWindow(primaryStage);
    }
    private void openMainWindow(Stage stage)  {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));
            Pane rootNode = loader.load();
            MainWindowController controller = loader.getController();
            controller.connectProperties();
            Scene scene = new Scene(rootNode);
            stage.setScene(scene);
            stage.show();

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }


}
