package App.Helpers;

import javafx.scene.Node;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Bismarck Franco
 */
public class FunctionsGenerals {
    
    //SINGLETON
    public static FunctionsGenerals Instance;
    public static FunctionsGenerals GetInstance(){
        FunctionsGenerals x;
        return x = Instance == null ? new FunctionsGenerals() : Instance;
    }
    
    private double initialX;
    private double initialY;
    
    public void addDraggableNode(final Node node) {
        node.setOnMousePressed((MouseEvent me) -> {
            if (me.getButton() != MouseButton.MIDDLE) {
                initialX = me.getSceneX();
                initialY = me.getSceneY();
            }
        });

        node.setOnMouseDragged((MouseEvent me) -> {
            if (me.getButton() != MouseButton.MIDDLE) {
                node.getScene().getWindow().setX(me.getScreenX() - initialX);
                node.getScene().getWindow().setY(me.getScreenY() - initialY);
            }
        });
    }
    
}
