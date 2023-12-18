import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
    //Import the pictures
    PImage pixel;
    PImage otherpixel;
    PImage spaceship;
    //Location of the ship
    float fltShipX = 450;
    float fltShipY = 450;
    //This checks if the keys pressed are true or false
    boolean upPressed = false;
    boolean downPressed = false;
    boolean leftPressed = false;
    boolean rightPressed = false;
    //Colour of the face
    float fltRGB = 255;
  

  public void settings() {
    size(900, 500);
  }

 
  public void setup() {
    //setting up the images and background
    pixel = loadImage("pixelthing.png");
    otherpixel = loadImage("otherpixel.png");
    spaceship = loadImage("spaceship.png");
    image(otherpixel,0,0);
  }

  public void draw() {
    //This will change the colour of the face
    if (mousePressed){
      fltRGB = 0;
    }

    //This will draw the smiley face if you press 's'
    if(keyPressed){
      if(key == 's'){
        fill(fltRGB);
        ellipse(mouseX, mouseY, 50,50);

        fill(255);
        ellipse(mouseX+10, mouseY-5, 20, 10);
        ellipse(mouseX-10, mouseY-5, 20, 10);

        fill(0);
        ellipse(mouseX+10, mouseY-5, 5, 5);
        ellipse(mouseX-10, mouseY-5, 5, 5);
 
        fill(255, 0, 0);
        arc((float)(mouseX), (float)(mouseY+5),(float)(30), (float)(20), (float)(0), (float)(3.14));

      }
    }
    
    //This is the controls of the ship
    if (upPressed) {
          fltShipY--;
        }
        if (downPressed) {
          fltShipY++;
        }
        if (leftPressed) {
          fltShipX--;
        }
        if (rightPressed) {
          fltShipX++;
        }        
  }  

  //This will draw a ship at the specified location
  public void mouseClicked() {
    image(pixel,0,0);
    spaceship.resize(100, 100);
    image(spaceship, fltShipX,fltShipY);
  }

  //This makes sure that the keys have been pushed down
  public void keyPressed(){
    if (keyCode == UP) {
      upPressed = true;
    }
    else if (keyCode == DOWN) {
      downPressed = true;
    }
    else if (keyCode == LEFT) {
      leftPressed = true;
    }
    else if (keyCode == RIGHT) {
      rightPressed = true;
    }
  }

  //This boolean will see if the keys have been released or not
  public void keyReleased() {
    if (keyCode == UP) {
      upPressed = false;
    }
    else if (keyCode == DOWN) {
      downPressed = false;
    }
    else if (keyCode == LEFT) {
      leftPressed = false;
    }
    else if (keyCode == RIGHT) {
      rightPressed = false;
    }
  }

}
 
