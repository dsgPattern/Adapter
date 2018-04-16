package UI;

import graphic.utils.FourSideShape;
import graphic.utils.Point;

public class MainWindow {

    public void PopulateScene(IAddToScene scene){
        //add rectangle
        Rectangle rectObj = new Rectangle(10, 10, 100, 300);
        scene.Add(rectObj);

        //add square
        Square squareObj = new Square(310, 10, 150);
        scene.Add(squareObj);

        //add circle
        scene.Add(new Circle(250, 100, 20));

        //add 4 side shape(FourSideShape)
        FourSideShape shape =new FourSideShape(
                new Point(10d,10d), //uperLeft
                new Point(10d,200d),//lowerLeft
                new Point(200d,200d),//lowerRight
                new Point(200d,10d));//upperRight))


        scene.Add(new FourShapeAdapter(shape));


    }

}
