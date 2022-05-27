import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.*;

public class addressFx extends Application {
    protected AddressPane pane = new AddressPane();


    @Override
    public void start(Stage primaryStage) {

        Scene addressBook = new Scene(pane, 430, 160);
        primaryStage.setTitle("Address Book");
        primaryStage.setScene(addressBook);
        primaryStage.show();
    }
}