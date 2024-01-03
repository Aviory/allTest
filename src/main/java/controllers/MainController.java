package controllers;

import models.BaseModel;
import models.JButtonChanger;
import models.MainModel;
import views.BaseScreen;
import views.MainScreen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController implements ActionListener, JButtonChanger {
    private BaseScreen screen;
    private BaseModel baseModel;
     private JButton Jbutton;
    public MainController(BaseModel baseModel,BaseScreen screen) {
     this.baseModel= baseModel;
       this.screen=screen;
    }

    public void createView() {
        screen = new MainScreen(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            baseModel.changeName(screen);
            changeButton("Hello!");
        }

    @Override
    public void changeButton(String newLabel) {
        baseModel.changeButton(newLabel);
    }
}

