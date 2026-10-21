import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JavafxLayouts extends Application {
    private int clickCount;

    @Override
    public void start(Stage stage) {

        Label title = new Label("Amazing Website");
        Button homeButton = new Button("Home");
        Button contactButton = new Button("Contact");
        Button exitButton = new Button("Exit");


        HBox topMenu = new HBox(12, homeButton, contactButton, exitButton);
        topMenu.setPadding(new Insets(20));
        topMenu.setAlignment(Pos.TOP_CENTER);

        HBox titleBox = new HBox(12, title);
        titleBox.setPadding(new Insets(20));
        titleBox.setAlignment(Pos.TOP_LEFT);


//        VBox layout = new VBox(12, countLabel, countButton, countLabel2);
//        layout.setPadding(new Insets(20));

        Scene scene = new Scene(topMenu,600, 300);
        stage.setTitle("JavaFX Layout");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
