void setup() {
  PImage face = loadImage("face.jpg");
  size(750,522);
  background(face);
}
void draw() {
  
   fill(255,255,255);
  ellipse(395, 270, 80, 68);
  ellipse(233, 275, 80, 68);
  fill(0, 0, 0);
 
   
   if(mouseX < 207) {
    mouseX = 207;
   }
   if(mouseY < 254) {
     mouseY = 254;
   }
   if(mouseX > 256) {
    mouseX = 256; 
   }
   if(mouseY > 299) {
    mouseY = 299; 
   }
    ellipse(mouseX+163, mouseY-2, 10, 10);
  ellipse(mouseX, mouseY, 10, 10);
    
  if(mousePressed) {
    println(mouseX + " " + mouseY);
  }
}