package Shell;

import UI.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application implements IAddToScene {
    private Scene _mainScene;
    private Group _root;
    private MainWindow _mainWindow;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        _root = new Group();
        _mainScene = new Scene(_root,600, 300);
        primaryStage.setScene(_mainScene);
        primaryStage.show();

        _mainWindow = new MainWindow();
        RepopulateScene();

        primaryStage.widthProperty().addListener((obs, oldVal, newVal) -> {
            RepopulateScene();
        });
        primaryStage.heightProperty().addListener((obs, oldVal, newVal) -> {
            RepopulateScene();
        });
    }

    public void Add(IShapeWithValidation control) {
        if(control.FitsBoundaries(_mainScene.getWidth(), _mainScene.getHeight())) {
            _root.getChildren().add(control.GetObject());
        }
    }

    private void RepopulateScene(){
        _root.getChildren().clear();
        _mainWindow.PopulateScene(this);

    }

}
