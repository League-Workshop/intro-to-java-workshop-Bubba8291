PImage catPic;
int x = 276;
int y = 236;
int acceleration = 5;

void setup() {
  size(800, 800);
  catPic = loadImage("cat.jpg");  
  catPic.resize(width, height);
  background(catPic);
}

void draw() {
if(mousePressed){
  println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
}
 
  noStroke();
  fill(#F51919, #1BF519, #1976F5);
  ellipse(x, y, 60, 50);
  ellipse(x+180, y, 60, 50);
 
 if(keyPressed){
   y+=2*acceleration;
   x+=2*acceleration;
 }
 
  if(x > width) {
    background(catPic);
    x = 276;
    y = 236;
    acceleration = 5;
  }
  
}

void keyPressed() {

x++;
y++;

}