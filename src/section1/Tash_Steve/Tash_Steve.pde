PImage mustache;
PImage friend;

void setup() {
friend = loadImage("friend.jpeg");

size(800, 600);

friend.resize(width,height);
mustache = loadImage("mustache png.png");
mustache.resize(500, 300);
}

void draw() {
  background(friend);
  if(mousePressed) { 
  image(mustache, mouseX - 250, mouseY - 140);
  }
  if (mouseButton == RIGHT){
    
                }
}