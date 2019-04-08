PImage bucket;

void setup() {
  size(600, 800);
  background(#22E0F0);
  bucket = loadImage("bucket.png");
  bucket.resize(25,60);
  image(bucket, mouseX, 740);
}

void start() {
  float r = random(10, 590);
  ellipse(25, 25, r, 10);
  
}

void draw() {
  bucket.get
}