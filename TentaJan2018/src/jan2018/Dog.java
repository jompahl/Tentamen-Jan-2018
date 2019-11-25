package jan2018;

public class Dog extends Animal {
private boolean barksAlot = false;
private boolean canTalk = false;
public boolean getBarksAlot() {
 return barksAlot;
}
public void setBarksAlot(boolean barksAlot) {
 this.barksAlot = barksAlot;
}
public void bark() {
if (!barksAlot) {
this.answer("Woof");
}else {
this.answer("Wow Wow Wow Wow");
}
}
public void beNoisy() {
canTalk = true;
this.setBarksAlot(true);
this.answer("I bark a lot");
}
public void beQuiet() {
canTalk = true;
this.setBarksAlot(false);
this.answer("I won't bark much");
}

public void talk() {
 if
(canTalk) {
 this.bark();

} else
{
super.talk();

}
}
}
