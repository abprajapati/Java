
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


    public class rankingDisplay extends Application {
        private final TextField tfYear = new TextField();
        private final TextField tfGender = new TextField();
        private final TextField tfName = new TextField();
        private final TextField tfInfo = new TextField();
        private final TextField tfAsk = new TextField();
        private final Button btSubQuery = new Button("Submit Query");
        private final Button btExit = new Button("Exit");
        private final Button btYes = new Button("Yes");
        private final Button btNo = new Button("No");
        private String year;
        private String gender;
        private String name;
        private String rank;

        @Override
        public void start(Stage primaryStage) {
            GridPane gridPane = new GridPane();
            gridPane.setHgap(5);
            gridPane.setVgap(5);
            gridPane.add(new Label("Enter the year:"), 0, 0);
            gridPane.add(tfYear, 1, 0);
            gridPane.add(new Label("Enter the gender:"), 0, 1);
            gridPane.add(tfGender, 1, 1);
            gridPane.add(new Label("Enter the name:"), 0, 2);
            gridPane.add(tfName, 1, 2);
            gridPane.add(btSubQuery, 1, 6);
            gridPane.add(btExit, 1, 6);


            gridPane.setAlignment(Pos.CENTER);
            tfYear.setAlignment(Pos.BOTTOM_RIGHT);
            tfGender.setAlignment(Pos.BOTTOM_RIGHT);
            tfName.setAlignment(Pos.BOTTOM_RIGHT);
            GridPane.setHalignment(btSubQuery, HPos.LEFT);
            GridPane.setHalignment(btExit, HPos.RIGHT);

            Scene scene = new Scene(gridPane, 500, 350);
            primaryStage.setTitle("Search Name Ranking Application");
            primaryStage.setScene(scene);
            primaryStage.show();

            btSubQuery.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    addQuery();
                }
            });

            btYes.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    Stage sta = new Stage();
                    sta.setScene(scene);
                    sta.show();
                }
            });
          addQuery();
            btExit.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent event) {
                     loadInfo();
                }
            });
        }

        public void addQuery() {
            btSubQuery.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                       loadData();
                    tfYear.setText("");
                    tfGender.setText("");
                    tfName.setText("");
                }
            });
        }

        public void loadData() {
            popularityRanking pr = null;
            System.out.print("Enter the year: ");
            year = tfYear.getText();
            System.out.print("Enter the gender: ");
            gender = tfGender.getText();
            System.out.print("Enter the name: ");
            name = tfName.getText();
            rank = pr.ranked(year, name, gender);
        }

        public void loadInfo() {
        Stage st = new Stage();
        GridPane gPane = new GridPane();
            gPane.setHgap(5);
            gPane.setVgap(5);
            gPane.add(tfAsk, 1, 3);
            gPane.add(tfInfo, 1, 2);
            gPane.add(btYes, 1, 4);
            gPane.add(btNo, 1, 4);

            tfAsk.setPrefColumnCount(25);
            tfInfo.setPrefColumnCount(25);

            tfInfo.setAlignment(Pos.BOTTOM_RIGHT);
            tfAsk.setAlignment(Pos.BOTTOM_RIGHT);
            gPane.setHalignment(btYes, HPos.LEFT);
            gPane.setHalignment(btNo, HPos.RIGHT);

            tfInfo.setText("Boy named "+ name +" is ranked #" + rank + " in " + year + " year");
            tfAsk.setText("Do you want to Search for another Name:");
            Scene sc = new Scene(gPane, 350, 200);
            st.setTitle("Search Name Ranking Application");
            st.setScene(sc);
            st.show();
            btNo.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    st.close();
                }
            });
        }
        public static void main(String[] args) {
            launch(args);8
        }
    }

