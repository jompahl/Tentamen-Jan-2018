package jan2018;

public class Parrot extends Animal {
private String vocabulary = null
;
public String getVocabulary() {
 return vocabulary
;
}
public void setVocabulary(String vocabulary) {
 this
.vocabulary = vocabulary
;
}
public void learn(String aString) {
 this
.vocabulary = aString
;
 talk(); }
public void talk() {
 if
(vocabulary != null) {
 this.answer(this.getVocabulary());

} else
{
 super.talk();

}
}
}

