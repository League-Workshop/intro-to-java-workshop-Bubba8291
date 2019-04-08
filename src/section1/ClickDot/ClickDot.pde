void setup() {
  size(800, 800);
}

void draw() {
  if(mousePressed) {
  fill(#35D3B5);
  ellipse(400, 400, 400, 400);
  } else {
    fill(#D335B1);
      ellipse(400, 400, 400, 400);
  }
}