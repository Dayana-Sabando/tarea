package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.util.HashMap;
import java.util.Map;

public class Main extends Application {

    private ListView<String> listView;
    private TextField newInfoTextField;
    private Map<String, String> labelData;

    @Override
    public void start(Stage primaryStage) {
        try {
            BorderPane root = new BorderPane();

            // Crear el AnchorPane para las imágenes y etiquetas
            AnchorPane leftPane = new AnchorPane();

            // Cargar las imágenes
            Image image1 = new Image("file:///C:/Users/User/eclipse-workspace/tarea/media/ejemplo.png");
            Image image2 = new Image("file:///C:/Users/User/eclipse-workspace/tarea/media/prueba.jpg");
            Image image3 = new Image("file:///C:/Users/User/eclipse-workspace/tarea/media/chico.jpg");
            Image image4 = new Image("file:///C:/Users/User/eclipse-workspace/tarea/media/dama.png");
            Image image5 = new Image("file:///C:/Users/User/eclipse-workspace/tarea/media/ejemplo2.jpg");
            
            // Crear ImageViews y ajustar tamaño
            ImageView imageView1 = new ImageView(image1);
            ImageView imageView2 = new ImageView(image2);
            ImageView imageView3 = new ImageView(image3);
            ImageView imageView4 = new ImageView(image4);
            ImageView imageView5 = new ImageView(image5);

            double imageWidth = 80;
            double imageHeight = 80;

            imageView1.setFitWidth(imageWidth);
            imageView1.setFitHeight(imageHeight);
            imageView2.setFitWidth(imageWidth);
            imageView2.setFitHeight(imageHeight);
            imageView3.setFitWidth(imageWidth);
            imageView3.setFitHeight(imageHeight);
            imageView4.setFitWidth(imageWidth);
            imageView4.setFitHeight(imageHeight);
            imageView5.setFitWidth(imageWidth);
            imageView5.setFitHeight(imageHeight); 

            // Crear etiquetas para las imágenes
            Label label1 = new Label("Erick Marcos Rivera Salazar", imageView1);
            Label label2 = new Label("Angie Tamara Mera Estupiñan", imageView2);
            Label label3 = new Label("victor Jacinto Triviño Escudero", imageView3);
            Label label4 = new Label("Rosa Mercedes Almeida  Melgar ", imageView4);
            Label label5 = new Label("Hector Marcelo Maquilon Villacis", imageView5);

            // Datos almacenados para cada etiqueta
            labelData = new HashMap<>();
            labelData.put("Etiqueta 1", " Cédula: 123456784 -- Profesión: Ingeniero civil -- Edad: 34 -- Teléfono: 0934567890 -- Email: marcos21@gmail.com -- Fecha de nacimiento: 29/02/1990 ");
            labelData.put("Etiqueta 2", " Cédula: 187654321 -- Profesión: Abogada -- Edad: 33 -- Teléfono: 0987654321 -- Email: animera@hotmail.com -- Fecha de nacimiento: 08/08/1991 ");
            labelData.put("Etiqueta 3", " Cédula: 112233440 -- Profesión: Maestro parbulario -- Edad: 32 -- Teléfono: 0985233455 -- Email: trivino@gmail.com -- Fecha de nacimiento: 03/03/1992 ");
            labelData.put("Etiqueta 4", " Cédula: 155667782 -- Profesión: Diseñadora de modas -- Edad: 31 -- Teléfono: 0966751199 -- Email: rosita24@gmail.com -- Fecha de nacimiento: 23/11/1993");
            labelData.put("Etiqueta 5", " Cédula: 130938517 -- Profesión: Ingeniero en sistemas  -- Edad: 31 -- Teléfono: 0924378823 -- Email: maquilon@hotmail.com -- Fecha de nacimiento: 16/04/1993 ");

            // Manejo de eventos para clics en las etiquetas
            label1.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> listView.getItems().add(labelData.get("Etiqueta 1")));
            label2.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> listView.getItems().add(labelData.get("Etiqueta 2")));
            label3.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> listView.getItems().add(labelData.get("Etiqueta 3")));
            label4.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> listView.getItems().add(labelData.get("Etiqueta 4")));
            label5.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> listView.getItems().add(labelData.get("Etiqueta 4")));

            // Ubicar elementos en el AnchorPane
            leftPane.getChildren().addAll(label1, label2, label3, label4, label5);

            // Posicionar las etiquetas de forma vertical con espacio entre ellas
            AnchorPane.setTopAnchor(label1, 20.0);
            AnchorPane.setLeftAnchor(label1, 20.0);

            AnchorPane.setTopAnchor(label2, 98.0);
            AnchorPane.setLeftAnchor(label2, 20.0);

            AnchorPane.setTopAnchor(label3, 180.0);
            AnchorPane.setLeftAnchor(label3, 20.0);

            AnchorPane.setTopAnchor(label4, 270.0);
            AnchorPane.setLeftAnchor(label4, 20.0);
            
            AnchorPane.setTopAnchor(label5, 360.0);
            AnchorPane.setLeftAnchor(label5, 20.0);

            // Configuración de la parte derecha del BorderPane
            AnchorPane rightPane = new AnchorPane();

            listView = new ListView<>();
            rightPane.getChildren().add(listView);
            
            AnchorPane.setTopAnchor(listView, 20.0);
            AnchorPane.setLeftAnchor(listView, 20.0);
            AnchorPane.setRightAnchor(listView, 20.0);
            AnchorPane.setBottomAnchor(listView, 80.0);

            //configuración de color del listview y texField
            newInfoTextField = new TextField();
            newInfoTextField.setPromptText("  Ingresa nueva información aquí...");
            newInfoTextField.setStyle("-fx-background-color: blue; -fx-text-fill: white;");
            
            // Para el ListView
            listView.setStyle("-fx-background-color: black; -fx-text-fill: blue;");
            rightPane.getChildren().add(newInfoTextField);

            //Para el tamaño de texField
            AnchorPane.setBottomAnchor(newInfoTextField, 20.0);
            AnchorPane.setLeftAnchor(newInfoTextField, 20.0);
            AnchorPane.setRightAnchor(newInfoTextField, 20.0);


            // Guardar información al presionar Enter
            newInfoTextField.setOnKeyPressed(event -> {
                if (event.getCode() == KeyCode.ENTER) {
                    String newText = newInfoTextField.getText();
                    if (!newText.isEmpty()) {
                        listView.getItems().add(newText);
                        newInfoTextField.clear();
                    }
                }
            });

            root.setLeft(leftPane);
            root.setRight(rightPane);

            // Crear la escena y mostrarla
            Scene scene = new Scene(root, 700, 600);
            
            primaryStage.setTitle("Interface Layout");
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
