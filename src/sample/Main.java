package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Biometria");
//        primaryStage.setScene(new Scene(root, 600, 500));
//        primaryStage.setResizable(true);
//        primaryStage.show();
        //creating a Group object

        Text text = new Text("Czolo poza kontrolo");
        text.setFont(new Font(45));
        text.setUnderline(true);
        text.setX(50);
        text.setY(50);




        Group group = new Group();

        ObservableList list = group.getChildren();

        Path path = new Path();

        //Moving to the starting point
        MoveTo moveTo = new MoveTo(108, 71);

        //Creating 1st line
        LineTo line1 = new LineTo(321, 161);

        //Creating 2nd line
        LineTo line2 = new LineTo(126,232);

        //Creating 3rd line
        LineTo line3 = new LineTo(232,52);

        //Creating 4th line
        LineTo line4 = new LineTo(269, 250);

        //Creating 4th line
        LineTo line5 = new LineTo(108, 71);

        //Adding all the elements to the path
        path.getElements().add(moveTo);
        path.getElements().addAll(line1, line2, line3, line4, line5);

        list.add(text);
        list.add(path);
        //Creating a Scene by passing the group object, height and width
        Scene scene = new Scene(group ,600, 300);

        //setting color to the scene
        scene.setFill(Color.WHITE);

        //Setting the title to Stage.
        primaryStage.setTitle("Sample Application");

        //Adding the scene to Stage
        primaryStage.setScene(scene);

        //Displaying the contents of the stage
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }

    /*Przygotuj program do przetwarzania plików graficznych (w wybranym języku programowania).
    Przez kolejne zajęcia będziesz rozbudowywał ten program, aby dodać do niego kolejne opcje - pamiętaj o tym przy projektowaniu.
    Program powinien mieć graficzny interfejs użytkownika i oferować następujące funkcjonalności:
        Wczytaj i wyświetl wskazany przez użytkownika plik graficzny.
        Wyświetl obraz w powiększeniu (np. x8).
        Odczytaj wartość RGB wybranego piksela (np. wskazanego myszką).
        Zmień wartość wskazanego piksela (np. po kliknięciu).
        Zapisz plik wynikowy pod wskazaną nazwą.*/

    public static void main(String[] args) {

        launch(args);

    }
}
