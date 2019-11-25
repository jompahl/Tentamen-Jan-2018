package jan2018;

public class Animal {
private String name = null;
public String getName() {
 return name;
}
public void setName(String name) {
 this.name = name;
}
public void answer(String aString) {
 System.out.println(aString);
}
public void talk() {
 this.answer("I can not talk.");
}
public void whatsYourName() {
if (name != null) {
this.answer("My name is "+name);
}else {
this.answer("I have no name.");
}
}
}

