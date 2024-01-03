package views;

import controllers.MainController;
import models.JButtonChanger;

import javax.swing.*;
import java.awt.event.ActionListener;

public class MainScreen extends BaseScreen {
    private JButtonChanger JbuttonChanger;
    private MainController mainController;
    private ActionListener actionListener;
    private JButton button;

    public MainScreen(ActionListener actionListener) {
        this.actionListener = actionListener;
    }
    @Override
    protected void initComponents() {
        setLayout(null);
        JButton button = new JButton("Start");
        button.setBounds(100, 100, 200, 50);
        button.addActionListener(actionListener);
        add(button);
    }
public  JButton Getbutton(){
        return button;
}
public void changeButtomLabel(ActionListener actionListener){
    mainController.changeButton(null);
}

}
