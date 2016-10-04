import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Uus extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
           VBox kastid = new VBox();
           Scene scene = new Scene(kastid, 100, 100);
           primaryStage.setScene(scene);

           Label silt = new Label();
           TextField kirjuta = new TextField();

           kirjuta.setOnAction(event -> {
               String k = kirjuta.getText();
               System.out.println(k);
               silt.setText(k);

               kastid.getChildren().addAll(silt, kirjuta);
               primaryStage.show();
           });
    }
}

