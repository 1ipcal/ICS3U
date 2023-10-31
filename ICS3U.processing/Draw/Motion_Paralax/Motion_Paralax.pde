//Name:       Calvin Ip
//Date:       Nov 26, 2019
//Version:    1.0
//Description: 

//Variables
float sF = 100;
float xLoc = width/2;
float yLoc = height/2;

//Sun
float xLocSun = 350, yLocSun = 100;

//Setup
void setup(){
  frameRate(1);
  size(500, 500);
  println("Width: " + width + " Height: " + height );
  
  drawBackground();
  drawSun();
  drawMountain1();
  
}

void draw(){
  drawBackground();
  drawSun();
  drawMountain1();
  
  System.out.println("X " + mouseX + " Y " + mouseY);
  System.out.println(height);
  System.out.println(height/2);
  System.out.println(yLoc);
}

void drawBackground(){
  background( 135, 206, 255);
}

void drawSun(){
  fill(#F9D71C);
  circle(xLoc + sF*3, yLoc - sF*1.5 , sF*0.75);
}

void drawMountain1(){
  //Far Mountatin
  fill((int)(Math.random()*255) + 0, (int)(Math.random()*255) + 0, (int) (Math.random()*255) + 0);
  triangle(250, 200, 150, 425, 350, 425 );
}
