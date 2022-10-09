import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;

import java.io.IOException;

public class Hero {

    private int x;
    private int y;
    private Screen screen;
    private Position position;

    public Hero(int i, int i1) {
        this.position = new Position(i,i1);
    }

    public int getX(){return x;}

    public void setX(int x){this.x=x;}

    public int getY(){return y;}

    public void setY(){this.y =y;}

    public void setPosition(Position position){
        this.position = position;
    }

    public Position getPosition(){
        return position;
    }


    public Position moveUp(){
        return new Position(getPosition().getX(), getPosition().getY()-1);
    }
    public Position moveDown(){
        return new Position(getPosition().getX(), getPosition().getY()+1);
    }
    public Position moveLeft(){return new Position(getPosition().getX()-1, getPosition().getY());}
    public Position moveRight(){
        return new Position(getPosition().getX()+1, getPosition().getY());
    }

    public void draw(TextGraphics graphics) {
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFF33"));
        graphics.enableModifiers(SGR.BOLD);
        graphics.putString(new TerminalPosition(position.getX(), position.getY()), "X");
    }

}
