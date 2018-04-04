int creeperX = 820;
int creeperY = 130;
void setup() {

 size(960, 538);
 PImage minecraft = loadImage("MinecraftWorld.jpg");
 PImage creeper = loadImage("Creeper.png");
 creeper.resize(10,20);
 background(minecraft);
 image(creeper, creeperX, creeperY);
 
}

void draw() {
if(mousePressed) {
 if(dist(mouseX, mouseY, creeperX+5, creeperY+10) < 20) {
   fill(#FF0000);
   textSize(200);
   text("You Win!", 100,250);
 }
}
}