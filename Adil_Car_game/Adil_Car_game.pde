PImage Background;
int y= 0;
int x = 0;
int  z  = 0;
//int count  = 0;
int getRandomx()
{
return int(random(800)); 
}
PImage Background1;
int  car [] = { getRandomx(), getRandomx()};
int  cary [] = {0,0};
void setup () {
  size(1000,600);
  Background= loadImage ("car.png");
  imageMode(CENTER);
  Background1= loadImage ("car2.png");
  //imageMode(CENTER);
}
void draw(){
  background(0);
  for(int i = 0;i<2;i++){
  image(Background,car[i],y,50,80);
  }
  //background(0);
  image(Background1,x,400,50,80);
 
    
y++;


  
divider();
score();
player();
//if(y>310 && y<360){
 //noLoop();
 //background(0);
 fill(#3743BC);
 //text("You are dead, THE GAME IS OVER",400,300);
 //text("YOUR SCORE IS"+z,400,400);
 getRandomx();
}
//}

void divider(){
  fill(#E5E3E5);
 rect(800,0,1000,600);
fill(#E5E3E5);
 rect(375,0,10,50);
  fill(#E5E3E5);
 rect(375,60,10,50);
 fill(#E5E3E5);
 rect(375,120,10,50);
 fill(#E5E3E5);
 rect(375,180,10,50);
 fill(#E5E3E5);
 rect(375,240,10,50);
 fill(#E5E3E5);
 rect(375,300,10,50);
 fill(#E5E3E5);
 rect(375,360,10,50);
 fill(#E5E3E5);
 rect(375,420,10,50);
 fill(#E5E3E5);
 rect(375,480,10,50);
 fill(#E5E3E5);
 rect(375,550,10,50);
}
void score(){
  fill(#080606);
  text("SCORE = "+z,850,50);
 // count++;
  //if(count==5){
  z+=1;
  //}
//delay(100);
}

void player(){
 if(key==CODED){
  if(keyCode==RIGHT){
   x++;  
  }
   else if(keyCode==LEFT){
     x--;
     
   
  }
 }
}