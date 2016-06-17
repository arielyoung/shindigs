public class User extends Person {
  
  private int userType; 
  //permissions i.e. customer vs manager vs employee
  //0 - customer | 1 - employee | 2 - manager
  private ArrayList <Address> addresses;
  //for those with multiple addresses
  private ArrayList <CreditCard> ccards;
  //and those with multiple payment options. 
  private String email;
  private String password;

  public Person() {
    super();
    userType = 0;
    email = "";
    password = "";
    addresses = new <> ArrayList();
    ccards = new <> ArrayList();
    }
  public Person(String n, String e, String p, Address a, CreditCard c) {

  }


}
