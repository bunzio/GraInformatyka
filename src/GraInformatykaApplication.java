import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by Bunzio on 15.04.2018
 * Contact: bunzeladam@gmail.com
 */
public class GraInformatykaApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Gra na Infie");
        FXMLLoader fxmlLoader = new FXMLLoader(GraInformatykaApplication.class.getClassLoader().getResource("gui/gui" +
                ".fxml"));
        Parent layout = fxmlLoader.load();

        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
