int x = 338;
int y = 308;
int acceleration = 5;
PImage catPic;
void setup(){
  size(800,800);
  catPic = loadImage("cat.jpeg");
          catPic.resize(800,800);
     background(catPic);
}
void draw(){
  if (x>width) {
    background(catPic);
    x=338;
    y=308;
    acceleration = 5;
  }


noStroke();
ellipse(x,y,50,50);
ellipse(x+118, y+20, 50, 50);
fill(255,0,0);

}

void keyPressed() {
           x+=2*acceleration;
          y+=2*acceleration;     
}