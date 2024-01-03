package models;

import views.BaseScreen;

public abstract class BaseModel implements JButtonChanger{
    private BaseScreen screen;
     public BaseModel(BaseScreen screen) {
         this.screen = screen;
     }
    public  abstract void changeName(BaseScreen screen) ;


   // public abstract void changeButton(BaseScreen screen);
}
