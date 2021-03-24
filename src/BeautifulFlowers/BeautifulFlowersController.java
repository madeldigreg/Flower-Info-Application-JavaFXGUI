package BeautifulFlowers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BeautifulFlowersController implements Initializable {
    @FXML
    private ImageView flowersImageView;
    @FXML
    private Label flowersNote;
    @FXML
    private RadioButton roseRadioButton;
    @FXML
    private RadioButton callaLilyRadioButton;
    @FXML
    private RadioButton cannaRadioButton;
    @FXML
    private RadioButton bleedingHeartRadioButton;
    @FXML
    private RadioButton cherryBlossomRadioButton;

    // Declare private Image fields for the five different flowers
    private Image rose;
    private Image callaLily;
    private Image canna;
    private Image cherryBlossom;
    private Image bleedingHeart;

    // The BeautifulFlowersController class will load the images when the application start
    @Override
    public void initialize(URL url, ResourceBundle rb) { // Load the image files in the intialize method
        rose = new Image ("BeautifulFlowers/Rose.gif");
        callaLily = new Image("BeautifulFlowers/Calla Lily.gif");
        canna = new Image("BeautifulFlowers/Canna.gif");
        bleedingHeart = new Image("BeautifulFlowers/Bleeding Heart.gif");
        cherryBlossom = new Image("BeautifulFlowers/Cherry Blossom.gif");
    }

    // Handlers for each radio button
    public void roseRadioButtonListener() {
        // If this radio button is selected, display image and data notes for Rose.
        flowersImageView.setImage(rose);
        flowersNote.setText("This beautiful flower and symbol of love belongs the genus Rosa. The family name of this flower is Rosaceae and it contains different other species in almost all parts of the world. The flower of rose vary in size from each other depending upon the species to which they belong. A large number of species of this flower are found in different parts of Asia.");
    }

    public void callaLilyRadioButtonListener() {
        // If this radio button is selected, display image and data notes for Calla Lily.
        flowersImageView.setImage(callaLily);
        flowersNote.setText("One simple and common name of this beautiful flower is arum lily and this flowering plant belongs to the family known as Araceae. This flowering plant is grown well in areas which have reasonable rainfall and moderate temperatures.");
    }

    public void cannaRadioButtonListener() {
        // If this radio button is selected, display image and data notes for Canna.
        flowersImageView.setImage(canna);
        flowersNote.setText("This beautiful flowering plant belongs to a genus that contain around 10 species and its family is known as Cannaceae. This flower plant also provides large quantity of starch which is further used for different purposes. This flower is mostly found in tropical regions of the world. The flowers of this plant have three sepals and three petals.");
    }

    public void bleedingHeartRadioButtonListener() {
        // If this radio button is selected, display image and data notes for Bleeding Heart.
        flowersImageView.setImage(bleedingHeart);
        flowersNote.setText("The bleeding heart flower belongs to the family known as Papaveraceae. This heart shaped flower is famous all over the world due to its unique beauty and is found in great numbers in Siberia and China. Blooming season of this flower starts in spring when there spread beautiful pink heart-shaped flowers in gardens. Lady-in-a-bath is also a common name of this flower.");
    }

    public void cherryBlossomRadioButtonListener() {
        // If this radio button is selected, display image and data notes for Cherry Blossom.
        flowersImageView.setImage(cherryBlossom);
        flowersNote.setText("Cherry blossom, a beautiful flowering plant is found in different parts of the world including the Northern Hemisphere. It is found in those areas which have moderate climate. All species of this flowering plant do not produce cherries as there are special species of this flower that produce edible cherries.");
    }
}