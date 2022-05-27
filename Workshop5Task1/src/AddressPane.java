import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.FlowPane;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;


 public class AddressPane extends Application{
    protected TextField nameOfText = new TextField();
    protected TextField nameOfStreet = new TextField();
    protected TextField nameOfCity = new TextField();
    protected TextField nameOfProvince = new TextField();
    protected TextField nameOfPostal = new TextField();
    protected Button buttonAdd = new Button("Add");
    protected Button buttonFirst = new Button("First");
    protected Button buttonNext = new Button("Next");
    protected Button buttonPrevious = new Button("Previous");
    protected Button buttonLast = new Button("Last");
    protected Button buttonUpdate = new Button("Update");
    private FlowPane paneForInfo = new FlowPane(5, 5);
    private HBox paneForButtons = new HBox(5);






    public AddressPane() {
        drawAddressBook();
    }

     @Override
     public void start(Stage stage) throws Exception {

     }

     private void drawAddressBook() {

        nameOfText.setPrefColumnCount(23);
        nameOfStreet.setPrefColumnCount(23);
        nameOfCity.setPrefColumnCount(5);
        nameOfProvince.setPrefColumnCount(2);
        nameOfPostal.setPrefColumnCount(4);


        paneForInfo.setPadding(new Insets(13, 13, 5, 13));
        paneForInfo.getChildren().addAll(new Label("First Name"), nameOfText,
                new Label("Last Name"), nameOfStreet, new Label("City   "), nameOfCity,
                new Label("Province"), nameOfProvince, new Label("Postal Code"), nameOfPostal);
paneForInfo.setAlignment(Pos.CENTER);

        paneForButtons.getChildren().addAll(buttonAdd, buttonFirst,
                buttonNext, buttonPrevious, buttonLast, buttonUpdate);
        paneForButtons.setPadding(new Insets(0,0,10,0));
        paneForButtons.setAlignment(Pos.CENTER);


//        setCenter(paneForInfo);
//        setBottom(paneForButtons);
    }
}