package models;

import views.BaseScreen;
import views.MainScreen;

public class SecondModel extends BaseModel {
    private MainScreen screen;
    public SecondModel(BaseScreen screen) {
        super(screen);
    }

    @Override
    public void changeName(BaseScreen screen) {
        screen.setName("Main Screen");
    }


    @Override
    public void changeButton(String text) {
     screen.Getbutton().setBounds(150,1550,250,80);
    }
}
