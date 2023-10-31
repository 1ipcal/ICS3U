//Name:       Calvin Ip
//Date:       Nov 26, 2019
//Version:    1.0
//Description: 

//Variables
float xLocSun = 100;
float yLocSun = 100;

float xLocMoon = 400;
float ylocMoon = 700;

float x = 0;
float y = 0;

float sF = 100;

//Sky
int red = 57;
int green = 177;
int blue = 255;

//Land
int red2 = 112;
int green2 = 214;
int blue2 = 69;

//Setup
void setup(){
  frameRate(30);
  size(500, 500);
  println("Width: " + width + " Height: " + height );
  
  drawBackground();
  drawSun();
  drawPlanet();
  drawCharacter();
  
}

void draw(){
 
  //sky
  red = red - 2;
  green = green -2;
  blue = blue - 2;
  
  //land
  if(blue2 > 50){
    red2 = red2 - 1;
    green2 = green2 - 5;
    blue2 = blue2 - 1;
  }
  
  drawBackground();
  drawSun();
  drawMoon();
  drawPlanet();
  drawCharacter();
  
  System.out.println(x + "" + y);
}

void drawBackground() {
  background( red, green, blue);
}

void drawSun(){
  fill(#FFC115);
  yLocSun = yLocSun + 3;
  circle(xLocSun, yLocSun, sF * 1); 
}

void drawMoon(){
  fill(#D6D4CF);
  if(ylocMoon > 100){
    ylocMoon = ylocMoon - 3;
  }
  circle(xLocMoon, ylocMoon, sF*1);
  circle(xLocMoon + sF/5 , ylocMoon + sF/5 , sF*0.25);
}

void drawPlanet() {
  stroke(1);
  fill(red2, green2, blue2);
  ellipse(width/2, height, 1000, 250);
}

void drawCharacter(){
  fill(#4049E3);
  ellipse(width/2 + x, height/1.5 + y, 100, 100);
}

void keyPressed() {
  switch( keyCode ) {
    case UP:
      y = y - 5; 
      break;
    case DOWN:
      y = y + 5; 
      break;
    case LEFT:
      x = x - 5;
      break;
    case RIGHT:
      x = x + 5;

  }
  
}
