public class Person {
  private String name;
  private int personID;
  //If a person registers, then their personID automatically becomes their userID
  private static int numOfPeople = 0;
  //may be useful to track the traffic on the site.

  public Person() {
    name = "";
    personID = ++numOfPeople;
  }
  public Person(String n) {
    personID = ++numOfPeople;
    name = n;
  }
  public void setName(String n) {
    name = n;
  }
  public void setId(int i) {
    personID = i;
  }
  public String getName() {
    return name;
  }
  public int getId() {
    return personID;
  }
  public boolean equals(Person p) {
    if (this.name.equals(p.getName()) && this.personID == p.getId()) 
      return true;
      //ideally we would not need to compare the names of the objects since every person object will have their
      // own id number. 
    else
      return false;
  }
  public String toString() {
    return name + " [" + personID + "]";
  }
}
