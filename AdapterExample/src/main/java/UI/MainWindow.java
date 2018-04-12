package UI;


public class MainWindow {

    public void PopulateScene(IAddToScene scene){
        //add rectangle
        Rectangle rectObj = new Rectangle(10, 10, 100, 300);
        scene.Add(rectObj);

        //add square
        Square squareObj = new Square(310, 10, 150);
        scene.Add(squareObj);

        //add circle
        scene.Add(new Circle(200, 100, 20));

        //add line



    }

}
