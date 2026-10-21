//import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;
//
//public class JavaFxCounterDemo extends Application {
//    private int clickCount;
//
//    @Override
//    public void start(Stage stage) {
//
//        Label countLabel = new Label("Clicks: 0");
//        Label countLabel2 = new Label("Clicks (2x): 0");
//        Button countButton = new Button("Click me");
//        countButton.setOnAction(event -> {
//            clickCount++;
//            countLabel.setText("Clicks: " + clickCount);
//            countLabel2.setText("Clicks (2x): " + (clickCount * 2));
//        });
//
//        VBox layout = new VBox(12, countLabel, countButton, countLabel2);
//        layout.setPadding(new Insets(20));
//
//        Scene scene = new Scene(layout, 240, 120);
//        stage.setTitle("JavaFX counter");
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
