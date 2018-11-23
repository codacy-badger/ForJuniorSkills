package view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Menu {

    public Menu(){
        Stage stage = new Stage();
        stage.setTitle("Main menu");

        FlowPane pane=new FlowPane();
        stage.setScene(new Scene(pane, 200, 200));

        Button buttonAll=new Button("Показать всех участников");
        buttonAll.setOnAction(e->new ShowAll());
        Button buttonAdd=new Button("Добавить нового участника");
        buttonAdd.setOnAction(e->new Registration());

        pane.getChildren()
                .addAll(buttonAll, buttonAdd);

        stage.show();
    }
}