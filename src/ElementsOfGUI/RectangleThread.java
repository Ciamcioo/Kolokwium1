package ElementsOfGUI;

public class RectangleThread extends Thread {
 double startX, startY, endX, endY;
 DrawPanel panel;
    public RectangleThread(double d, double e, double f, double g, DrawPanel panel) {
        this.startX = d;
        this.startY = e;
        this.endX = f;
        this.endY = g;        
        this.panel = panel;
    }

    public void run() {
       while (true) {
       } 
    }

    public boolean checkIfInRange(int x, int y) {
        if (startX <= x && x <= endX && startY <= y && endY >= y)
            return true;
        else
            return false;
    }
}

