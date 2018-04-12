/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
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
    //This is for Check Box
    @FXML private Label firstLabel;
    @FXML private CheckBox checkBox1;
    @FXML private CheckBox checkBox2;
    @FXML private CheckBox checkBox3;
    
    //This is for the image
     @FXML private ImageView imageView;
    
    
    public void firstButtonPushed()
    {
        String order = "Toppings are:";
        
        if (checkBox1.isSelected())
            order += "\n pineapple";
        if (checkBox2.isSelected())
            order += "\n banana";
        if (checkBox3.isSelected())
            order += "\n apple";
        
        this.firstLabel.setText(order);        
    }
    
     //This is for Choice Box
        @FXML private ChoiceBox choiceBox;
        @FXML private Label choiceBoxLabel;
        
    public void secondButtonPushed()
    {
        choiceBoxLabel.setText(choiceBox.getValue().toString());
    }
    
    
    //This is for the radio buttons
    @FXML private RadioButton aRadioButton;
    @FXML private RadioButton bRadioButton;
    @FXML private RadioButton cRadioButton;
    @FXML private Label radioButtonLabel;
    //This makes it so only one button can be selected
          private ToggleGroup radioToggleGroup;
          
    public void thirdButtonPushed()
    {
        if (this.radioToggleGroup.getSelectedToggle().equals(this.aRadioButton))
            radioButtonLabel.setText("The Selected Item is A");
        if (this.radioToggleGroup.getSelectedToggle().equals(this.bRadioButton))
            radioButtonLabel.setText("The Selected Item is b");
        if (this.radioToggleGroup.getSelectedToggle().equals(this.cRadioButton))
            radioButtonLabel.setText("The Selected Item is c");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        //This is for checkBox
        firstLabel.setText("memes");
        
        //This is for Choice Box
        choiceBoxLabel.setText("");
        choiceBox.getItems().add("Apples");
        choiceBox.getItems().add("banana");
        choiceBox.getItems().add("Strawberrys");
        
        //This is for Radio button
        radioButtonLabel.setText("");
        radioToggleGroup = new ToggleGroup();
        this.aRadioButton.setToggleGroup(radioToggleGroup);
        this.bRadioButton.setToggleGroup(radioToggleGroup);
        this.cRadioButton.setToggleGroup(radioToggleGroup);
        
        //This is for the image
        imageView.setImage(new Image("bee.jpg"));
        
        //set up a "clip" to apply a rounded border to the image
        Rectangle clip = new Rectangle(imageView.getFitWidth(), 
                                       imageView.getFitHeight());
        clip.setArcWidth(60);
        clip.setArcHeight(60);
        imageView.setClip(clip);
    }     
}