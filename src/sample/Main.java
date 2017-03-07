package sample;

import java.awt.*;
import java.io.FileInputStream;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Text alfa = new Text("0");
        alfa.setX(10);
        alfa.setY(20);
        Text red = new Text("0");
        red.setX(10);
        red.setY(40);
        Text green = new Text("0");
        green.setX(10);
        green.setY(60);
        Text blue = new Text("0");
        blue.setX(10);
        blue.setY(80);


        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {

                ImageView imageView = (ImageView) e.getSource();
                int x = (int) e.getSceneX();
                int y = (int) e.getSceneY();

                Color color = new Color(imageView.getImage().getPixelReader().getArgb(x,y)) ;

                alfa.setText(String.valueOf(color.getAlpha()));
                red.setText(String.valueOf(color.getRed()));
                green.setText(String.valueOf(color.getGreen()));
                blue.setText(String.valueOf(color.getBlue()));
            }
        };



        //Creating an image
        Image image = new Image(new FileInputStream("C:\\Users\\mironp\\Desktop\\manuel.jpg"));



        //Setting the image view
        ImageView imageView = new ImageView(image);

        imageView.addEventFilter(MouseEvent.MOUSE_MOVED, eventHandler);

        //Setting the position of the image
        imageView.setX(50);
        imageView.setY(25);

        //setting the fit height and width of the image view
        imageView.setFitHeight(455);
        imageView.setFitWidth(500);

        //Setting the preserve ratio of the image view
        imageView.setPreserveRatio(true);


        Group root = new Group();
        root.getChildren().add(alfa);
        root.getChildren().add(red);
        root.getChildren().add(green);
        root.getChildren().add(blue);
        root.getChildren().add(imageView);


        //Creating a scene object
        Scene scene = new Scene(root, 600, 500);

        //Setting title to the Stage
        stage.setTitle("Loading an image");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
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
