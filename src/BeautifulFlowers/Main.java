package BeautifulFlowers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("BeautifulFlowers.fxml")); // Loads the FXML file
        primaryStage.setTitle("Beautiful Flowers"); // Displays the text Beautiful Flowers in the window title
        primaryStage.setScene(new Scene(root)); // Builds the scene graph in memory; dimensions will be calculated as that of the AnchorPane 650x400
        primaryStage.show(); // Displays the GUI: application will display information about five flowers, including an image and fact note
    }

    // Application main method
    public static void main(String[] args) {
        launch(args);
    }
}
