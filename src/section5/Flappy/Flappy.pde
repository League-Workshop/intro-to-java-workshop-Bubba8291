int ybird = 300;
int birdYVelocity = 30;
int gravity = 1;
int pipeX = 10;
int upperPipeHeight = (int) random(100, 600);
int pipeGap = (int) random(50, 85);
int lowerY = 20 + upperPipeHeight + pipeGap;

void setup() {
  size(400, 600);
}

void draw() {
 background(#1BBAF2);
 fill(#F2DD1B);
 stroke(#F2DD1B);
 ellipse(200, ybird, 20, 17); 
 
 if(mousePressed) {
   ybird = ybird - 18;
 }
 
 ybird = ybird + 6;
 
 fill(#3EF21B);
 rect(pipeX, 0, 20, upperPipeHeight);
 
 fill(#3EF21B);
 rect(pipeX, -600, 20, lowerY);
}