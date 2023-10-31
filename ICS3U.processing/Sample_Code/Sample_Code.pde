// CONSTANTS
final int SOMETHING = 1;

// VARIABLES
int xLoc, yLoc;

// SETUP; run once
void setup() {
    size( 600, 400 );
    frameRate( 1 );
    println("Width: " + width + " Height: " + height);
}

// DRAW; called at the given frame rate
void draw() {
    rect( 0, 0, 100, 100 );
}
