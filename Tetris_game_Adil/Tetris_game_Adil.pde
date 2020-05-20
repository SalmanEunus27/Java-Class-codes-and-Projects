int  y;

int x;

 int blockX [] = { getRandomX(), getRandomX(), getRandomX(), getRandomX(), getRandomX() };


//int r = 5;
//int x1 = 300;
//int y1 = 0;
void setup(){
 size(1000,600);
}
 int getRandomX(){
return int(random(600));
}



 void draw(){
   background(#5743AA);
//fill(#507134);
 //rect(x,y,15,15);
 fill(#A20A3F);
 rect(0,500,1000,110);
 fill(#507134);
 rect(200,480,15,15);
 fill(#507134);
 rect(300,480,15,15);
 fill(#507134);
 rect(300,480,15,15);
 fill(#507134);
 rect(400,480,15,15);
 fill(#507134);
   for(int i = 0;i<5;i++){
  
    
  rect(blockX [i] , y++,30,15);
 fill(#507134);

 //delay(200);
 blockX [i]  = getRandomX();

 //x = x*5;
  
   
 
 if(y<480){
 y = y+2; 
 keyPress();
 }
 if(y==480){
  y=480;
 }
 
 delay(200);
 
 
  
 }
  
 
   

 
 
 }
 
 
 


 
 
 

 
 


 
  
   
  
 
    //rect(x1,y1,50,15);
 //fill(#507134);
 //y1++;
   
  
 
  
  //delay(1000);
  
  
 



 

 void keyPress(){
  if (key == CODED) {
    if (keyCode == RIGHT) {
      x = x+2;
      
}
else
 if(key == CODED){
   if (keyCode == LEFT){
    x= x-2;
   }
  
 }
{
 
}
  }
   
 
 }