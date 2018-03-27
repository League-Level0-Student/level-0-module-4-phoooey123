int topY = 100;
int bottomY = 700;
int speed = 7;
int ballY = 200;
void setup() {
size(500,800);  
}
void draw() {
 background(#FFBA2E);
 stroke(#000000);
 strokeWeight(10);
 line(100,topY,400,topY); 
 line(100, bottomY,400,bottomY);
 ellipse(250,ballY,30,30);
 ballY = ballY+speed;
 if(ballY > bottomY - 30) {
  speed =- speed;
 }
 if(ballY < topY + 30) {
  speed =- speed; 
 
 }
}