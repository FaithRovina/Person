
/**
 * A class to model a person, who has a name and an age.
 **/
public class Person {
  private String name;
  private int age;
  private String gender;

  private static final int INFANT = 2;
  private static final int TODDLER_MIN = 1;
  private static final int TDDDLER_MAX = 3;
  private static final int TEENAGER_MIN = 13;
  private static final int TEENAGER_MAX = 19;
  private static final int CHILD = 15;
  private static final int YOUTH_MIN = 15;
  private static final int YOUTH_MAX = 24;


  

  public static int votingAge;
  public static int drivingAge;
  public static int marriageAge;


  // default constructor
  public Person() {
    this("No name yet", 0, "female");
    //setPerson("No name yet", 0);
  }

  // constructor that takes a name and an age
  public Person(String n, int a, String g) {
    setPerson(n, a);
    gender = g;
  }

  // accessor method for name
  public String getName() {
    return name;
  }

  // accessor method for age
  public int getAge() {
    return age;
  }

  public String getGender() {
    return gender;
  }

  public String getGenderAsString() {
    return this.gender;
  }

  // mutator method for name
  public void setName(String n) {
    name = n;
  }

  // mutator method for age
  public void setAge(int a) {
    if (a < 0) {
      System.out.println("Age cannot be negative.");
      System.exit(0);
    } else
      age = a;
  }

  // method to set both the name and the age
  public void setPerson(String n, int a) {
    setName(n);
    setAge(a);
  }

  // tests whether this person is equal to another
  public boolean equals(Person otherP) {
    return (name.equals(otherP.name) && age == otherP.age);
  }

  // tests whether this person has the same name as another
  public boolean hasSameNameAs(Person otherP) {
    return name.equals(otherP.name);
  }

  // tests whether this person has the same age as another
  public boolean hasSameAgeAs(Person otherP) {
    return age == otherP.age;
  }

  // tests whether this person is older than another
  public boolean isOlderThan(Person otherP) {
    return age > otherP.age;
  }

  // tests whether this person is younger than another
  public boolean isYoungerThan(Person otherP) {
    return age < otherP.age;
  }

  //accessor method for voting age
  public static int getVotingAge(){
    return votingAge;
  }

  // mutator method for voting age
  public static void setVotingAge(int age){
    votingAge = age;
  }
  public static boolean canVote(int age){
    if (age >= votingAge){
      return true;
    }
    else{
      return false;
    }
  }

  // accessor method for drivingAge
  public static int getDrivingAge(){
    return drivingAge;
  }
  //set drivingAge
  public static void setDrivingAge(int age){
     drivingAge = age;
  }

  // to verify if a person can drive
  public static boolean canDrive(int age){
    return (age >= drivingAge);
  }

  //accessor method for marriageAge
  public static int getMarriageAge(){
    return marriageAge;
  }

  //mutator method for marriageAge
  public static void setMarriageAge(int age){
    marriageAge = age;
  }

  //verifying if a person is viable for marriage
  public static boolean canMarry(int age){
    if (age >= marriageAge){
      return true;
    }
    else{
      return false;
    }

  }

  // checks if a person can drive,vote or marry returns true if one satisfies all, false otherwise
  public static boolean isAdult(int age){
    boolean canvote = Person.canVote(age);
    boolean candrive = Person.canDrive(age);
    boolean canmarry = Person.canMarry(age);

    if (canvote && candrive && canmarry){
      return true;
    }   

    return false;

  }

  //checks the maximum value based on the driving, voting and marriage age then return a new person with the maximum as the adult age
  public static Person createAdult(String name, String gender, int votingAge, int marriageAge, int drivingAge){
    int adultAge = Math.max(drivingAge, Math.max(marriageAge, votingAge));
    return new Person(name, adultAge, gender);
  }

  //checking if one is an infant 
  public static boolean isInfant(int age){
    return age< INFANT;
  }

  //checking is one is a toddler
  public static boolean isToddler(int age){
    return age >= TODDLER_MIN && age <= TDDDLER_MAX;
  }

  //checking if one is a child 
  public static boolean isChild(int age){
    return age < CHILD;
  }

  //checking if one is a teenager
  public static boolean isTeenager(int age){
    return age >= TEENAGER_MIN && age <= TEENAGER_MAX;
  }

  // checking if one is a youth
  public static boolean isYouth(int age){
    return age >= YOUTH_MIN && age <= YOUTH_MAX;
  }

  //creating a toString method that returns a string equivalent of the class
  //public String toString(){
    //return "Name: " + name + "gender: " + "adultage: " + adultAge ;
  //} 



}
