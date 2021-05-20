package sample;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

  private final int START_WIDTH  = 960;
  private final int START_HEIGHT = 540;

  private StackPane root;

  @Override
  public void init () throws Exception {
    System.out.println("Initializing application...");
    var javaVersion = System.getProperty("java.version");
    var javafxVersion = System.getProperty("javafx.version");
  }

  @Override
  public void start (Stage stage) throws Exception {
    Button btn = new Button();
    btn.setText("Say 'Hello World'");
    root = new StackPane();
    root.getChildren().add(btn);
    stage.setTitle("Track Commander");
    stage.setScene(new Scene(root, START_WIDTH, START_HEIGHT));
    stage.show();
  }

  public static void main (String[] args) {
    App.launch(args);
  }
}
