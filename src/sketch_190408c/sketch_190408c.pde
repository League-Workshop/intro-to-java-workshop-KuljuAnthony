PImage mustache;
    PImage heodi;
void setup() {
  mustache = loadImage ("lso.png");
  heodi = loadImage("d.jg.jpeg");
  size(800,800);
  heodi.resize(800,800);
  mustache.resize(300,100);
}
void draw() {
  background(heodi);
  if(mousePressed){
    image (mustache, mouseX, mouseY);
  }
  
}