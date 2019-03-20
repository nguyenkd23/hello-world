import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FinalProject extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("GUI Front End");

        //GridPane with 10px padding around edge
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        Text lengthChoiceLabel = new Text("The lengths you can choose from are: Inches, Feet, Miles, Centimeters, Meters, Kilometers");
        GridPane.setConstraints(lengthChoiceLabel, 0, 0, 2, 1);
        
        //LengthSelection 1 Label 
        Label length1Label = new Label("Enter the length you'd like to convert:");
        GridPane.setConstraints(length1Label, 0, 1);

        //LengthSelection 1 Input
        TextField length1Input = new TextField();
        length1Input.setPromptText("Length Here");
        GridPane.setConstraints(length1Input, 2, 1);

        //LengthValue 1 Label
        Label lengthValueLabel = new Label("Enter how much you'd like to convert:");
        GridPane.setConstraints(lengthValueLabel, 0, 2);

        //LengthValue 1 Input
        TextField lengthValueInput = new TextField();
        lengthValueInput.setPromptText("How Much Here");
        GridPane.setConstraints(lengthValueInput, 2, 2);

        //LengthSelection 2 Label
        Label length2Label = new Label("Enter what you'd like to convert to:");
        GridPane.setConstraints(length2Label, 0, 3);

        //LengthSelection 2 Input
        TextField length2Input = new TextField();
        length2Input.setPromptText("Length Here");
        GridPane.setConstraints(length2Input, 2, 3);
        
        //Conversion Button
        Button conversionButton = new Button("Convert");
        GridPane.setConstraints(conversionButton, 3, 3);
        
        //Conversion Output
        //TextField conOutput = new TextField();
        //conOutput.setPromptText("Display Conversion Here");
        //GridPane.setConstraints(conOutput, 2, 4);
        
        
        Text conOutput = new Text("Display Conversion Here");
        GridPane.setConstraints(conOutput, 2, 4);
        
        
        //Add everything to grid
        grid.getChildren().addAll(lengthChoiceLabel, length1Label, length1Input, lengthValueLabel, lengthValueInput, length2Label, length2Input, conversionButton, conOutput);

        Scene scene = new Scene(grid, 580, 200);
        window.setScene(scene);
        window.show();
    }


}


