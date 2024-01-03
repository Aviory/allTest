package models;

import views.BaseScreen;
import views.MainScreen;

import javax.swing.*;
import java.util.Locale;

public class MainModel extends BaseModel{
    private MainScreen mainScreen;
    private JButton button;

    public MainModel(BaseScreen screen) {
        super(screen);
    }

    //public void changeName() {
     //   System.out.println("Hello");
    //}


    public void changeName(BaseScreen screen) {
        screen.setName("MainScreen");

    }



    @Override
    public void changeButton(String text) {
       mainScreen.Getbutton().setText(text);
    }
}
