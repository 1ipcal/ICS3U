boolean open = true;
int x = -80;
void setup(){
  
  frameRate(1.5);
  
  size( 400, 400 );
  
  println( "Width: " + width + "Height: " + height);
  
  //         R G B
  background(#FF0F0F);
  
  rectMode(CENTER);
  strokeWeight(4);
  noStroke();
  rect(100,100,50,50, 10);
  
  stroke (1);
  fill(200, 200, 200);
  triangle( width/2, 0, 0, height, width, height);
  
  point(width/2, height/2);
  
  line(0, 0, width, height);
  
  quad(0, 0, 100, 0, 100, height, 0, height);
  
  fill(0, 255, 255);
  ellipse(width/2, height/2, 20, 40 );
  
  fill(#FFF80F);
  arc( width/2, height/2, 40, 40, radians(30), radians(90));
}

void draw(){

  fill(#FFF80F);
  if(open){
    arc( width/2, height/2, 40, 40, radians(30), radians(90));
  }
  else{
    ellipse(width/2, height/2, 20, 40 );
  }
  
}
