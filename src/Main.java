import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

    public static void main(String[] args)
    {
        launch(args);
    }

    private static Stage pS;


    public static void setPs(Stage pS)
    {
        Main.pS = pS;
    }

    @Override
    public void start(Stage pS) throws Exception{
        setPs(pS);
        pS.show();
        telaInicio();
    }

    public static void telaInicio() throws IOException
    {
        Parent root = FXMLLoader.load(Main.class.getResource("/view/Inicio.fxml"));
        Scene cena = new Scene(root);
        pS.setTitle("Inicio");
        pS.setScene(cena);
    }
}