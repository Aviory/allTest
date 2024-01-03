package views;

import listeners.ExitListener;
import models.JButtonChanger;

import javax.swing.*;

public abstract class BaseScreen extends JFrame {
    String Title;
    private JButtonChanger toDo;
    protected abstract void initComponents();
    public BaseScreen() {
        setTitle("Main Screen");
        setSize(600, 400);
        setLocationRelativeTo(null);
        addWindowListener(new ExitListener());
        initComponents();
        setVisible(true);
    }
    public void setTitle(String Title){
      this.Title=Title;
    }
}
