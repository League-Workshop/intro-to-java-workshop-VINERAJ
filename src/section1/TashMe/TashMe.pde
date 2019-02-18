PImage mustache; 
PImage friend;
void setup(){friend=loadImage("Tashface.jpeg");
size(800,600);
friend.resize(width,height);
mustache=loadImage("tache.png");}
void draw(){background(friend);
image(mustache,400,300);}