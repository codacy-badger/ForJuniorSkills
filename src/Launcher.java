import controller.LoginController;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import util.HibernateUtil;

public class Launcher extends Application {
    public static void main(String[] args){
        try{
            if(HibernateUtil.getSession().isOpen()) {
                launch();
            }
        } catch (Exception e){
            new Alert(Alert.AlertType.ERROR, "Server is dead!").showAndWait();
        }
        HibernateUtil.shutdown();
    }

    @Override
    public void start(Stage primaryStage){
        LoginController.show();
    }
}