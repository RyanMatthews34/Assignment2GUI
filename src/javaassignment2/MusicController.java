package javaassignment2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
/**
 * FXML Controller class
 *
 * @author ryanm
 */
public class MusicController implements Initializable 
{
     //This is for the image
     @FXML private ImageView imageView;

     //This is for favourite Genre (Choice Box)
     @FXML private ChoiceBox choiceBox;
               
    //This is for favourite song (Text Field)
    @FXML private TextField favSongTextField;
    
    //This is for the # of Instrument Played(Spinner)
    @FXML private Spinner numInstrumentOfSpinner;
    //This is the label to show errors
    @FXML private Label errMsgLabel;
    /**
     * This method will create a MusicInfo write it to text file
     * then display it in the console
     * @throws java.io.IOException
     */
    public void createMusicInfoButtonPushed() throws IOException
    {     
        try{           
            MusicInfo newMusicInfo = new MusicInfo(this.favSongTextField.getText(),
                                            this.choiceBox.getValue().toString(), 
                                            (int) this.numInstrumentOfSpinner.getValue());
        this.errMsgLabel.setText("");
        BufferedWriter writer = new BufferedWriter(new FileWriter("MusicInfo.txt", true));
        writer.write(newMusicInfo.toString());
        writer.close();
            System.out.printf("Music Info: %s %n", newMusicInfo);
        }
        catch (IllegalArgumentException e)
        {
            System.err.println(e.getMessage());
            this.errMsgLabel.setText(e.getMessage());
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        //This is for Choice Box        
        choiceBox.setValue("");       
        choiceBox.getItems().add("Rock");
        choiceBox.getItems().add("Country");
        choiceBox.getItems().add("Pop");
        choiceBox.getItems().add("Jazz");
        choiceBox.getItems().add("Metal");             
        
        //This is for the image
        imageView.setImage(new Image("bee.jpg"));
        
        //This is for the Spinner
        SpinnerValueFactory<Integer> numValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,7);
        this.numInstrumentOfSpinner.setValueFactory(numValueFactory);
        
        //set up a "clip" to apply a rounded border to the image
        Rectangle clip = new Rectangle(imageView.getFitWidth(), 
                                       imageView.getFitHeight());
        clip.setArcWidth(90);
        clip.setArcHeight(90);
        imageView.setClip(clip);           
    }     
}