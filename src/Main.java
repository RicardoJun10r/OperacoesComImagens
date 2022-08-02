import javafx.application.Application;
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
    }
}