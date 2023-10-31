//Name:       Calvin Ip
//Date:       Nov 26, 2019
//Version:    1.0
//Description: 

//Variables
float sF;
float xLoc;
float yLoc;
float colourRandom;

float x, y;

color mountain1, mountain2, mountain3;

int step = 50;

float birdLoc = 0;

//Setup
void setup(){
  frameRate(30);
  size(500, 500);
  println("Width: " + width + " Height: " + height );
  sF = width / 10;
  
  mountain1 = colourRandomizer();
  mountain2 = colourRandomizer();
  mountain3 = colourRandomizer();
  
  drawBackground();
  drawSun();
  drawMountain1();
  drawMountain2();
  drawMountain3();
  drawGrass();
  drawTree();
  drawBirds();
  
}

void draw(){
  drawBackground();
  drawSun();
  drawMountain1();
  drawMountain2();
  drawMountain3();
  drawGrass();
  drawTree();
  drawBirds();
  
  System.out.println("X " + mouseX + " Y " + mouseY);
  
  //Grid (For Drawing)
 //  for(int i = 0; i < width/step; i++ ) {
 //  line(i*step, 0, i*step, height);
 //  line(0, i*step, width, i*step);
 //} 

 x = mouseX;
 y = mouseY;
 
}

color colourRandomizer(){
  return color( (int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
}

void drawBackground(){
  background( 135, 206, 255);
}

void drawSun(){
  float offsetX = 7*sF - mouseX;
  float offsetY = 7*sF - mouseY;
  stroke(1);
  fill(#F9D71C);
  circle( 7*sF - offsetX*0.01 , 2*sF - offsetY*0.01, 1.5*sF);
}

//Far Mountatin
void drawMountain1(){
  float offsetX = 5*sF - mouseX;
  float offsetY = 3.5*sF - mouseY;
  fill( mountain1 );
  triangle(5*sF - offsetX*0.03, 3.5*sF - offsetY*0.03, 2.75*sF - offsetX*0.03, 8*sF - offsetY*0.03, 7.25*sF - offsetX*0.03, 8*sF - offsetY*0.03);
}

void drawMountain2(){
  float offsetX = 2.5*sF - mouseX;
  float offsetY = 4.25*sF - mouseY;
  fill(mountain2);
  triangle(2.5*sF - offsetX*0.05, 4.25*sF - offsetY*0.05, -3*sF - offsetX*0.05, 10*sF - offsetY*0.05, 8*sF - offsetX*0.05, 10*sF - offsetY*0.05 );
}

void drawMountain3(){
  float offsetX = 7.5*sF - mouseX;
  float offsetY = 4.25*sF - mouseY;
  fill(mountain3);
  triangle(7.5*sF - offsetX*0.05, 4.25*sF - offsetY*0.05, 2*sF - offsetX*0.05, 10*sF - offsetY*0.05, 12.5*sF - offsetX*0.05, 10*sF - offsetY*0.05);
}

void drawGrass(){
  float offsetX = 0*sF - mouseX;
  float offsetY = 8*sF - mouseY;
  
  //Grass
  stroke(1);
  rectMode( CORNER );
  fill(#7ADE6B);
  rect(0 - 2*sF - offsetX*0.15, 8*sF - offsetY*0.15, width + sF*2, 4*sF  );
  
  //Grass Blades
  for( float i = 0; i < width + 2*sF; i = i + 0.125*sF ) {       
    fill(#7ADE6B);
    rect(i - 2*sF - offsetX*0.15, 8*sF - 0.5*sF - offsetY*0.15, width/160, 0.5*sF  );    
  }
  
}

void drawTree(){
  float offsetX = 0*sF - mouseX;
  float offsetY = 8*sF - mouseY;
  //Trunk
  fill(#D87837);
  rectMode(CENTER);
  rect(6.5*sF - offsetX*0.15, 8*sF - offsetY*0.15, 0.5*sF, 2*sF);
  
  //Leaves
  fill(#2E7018);
  ellipseMode(CENTER);
  ellipse(6.5*sF - offsetX*0.15, 7*sF - offsetY*0.15, 1.5*sF, 2*sF);
}

void drawBirds(){
  fill(#000000);
  strokeWeight(0.10 * sF);
  
  for( float bird = 0; bird < 5; bird++ ) {
    line(birdLoc + (-bird*3/4*sF), 4.5*sF + (-bird*3/4*sF), birdLoc - (0.75*sF) + (-bird*3/4*sF), 4.25*sF + (-bird*3/4*sF));  
    line(birdLoc + (-bird*3/4*sF), 4.5*sF + (-bird*3/4*sF), birdLoc + (0.75*sF) + (-bird*3/4*sF), 4.25*sF + (-bird*3/4*sF));
  }
  strokeWeight(1);
  
  //Bird Movement
    if(birdLoc < width + 4*sF){
      birdLoc = birdLoc + 0.10 * sF;
    } else {
      birdLoc = 0 - 1*sF;
    }
    
}
