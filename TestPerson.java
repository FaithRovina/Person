
public class TestPerson {

  public static void main(String[] args){
    
    // Test the constructors and the accessor methods
    Person p1 = new Person();
    Person p2 = new Person("Kofi", 19, "male");
    Person p3 = new Person("Mansah", 4, "female");
    Person p4 = new Person("Bob", 4, "male");
    
    System.out.println("p1 is " + p1.getName() + " who is " +
                       p1.getAge() + " years old.");
    System.out.println("p1's gender is " + p1.getGender());
    String genderString = p1.getGenderAsString();
    System.out.println("p1's gender as a string is " + genderString);

    
    System.out.println("p2 is " + p2.getName() + " who is " +
                       p2.getAge() + " years old.");
    System.out.println("p3 is " + p3.getName() + " who is " +
                       p3.getAge() + " years old.");
    System.out.println("p4 is " + p4.getName() + " who is " +
                       p4.getAge() + " years old.");
    System.out.println();
    
    // Test the set methods
    p1.setName("Mansah");
    p1.setAge(4);
    p2.setPerson("Bob", 34);
    
    // uncomment the following line to test an invalid age
    //p1.setAge(-3);
    
    System.out.println("p1 is now " + p1.getName() + " who is " +
                       p1.getAge() + " years old.");
    System.out.println("p2 is now " + p2.getName() + " who is " +
                       p2.getAge() + " years old.");
    System.out.println();

    // Test the equals() method
    if (p1.equals(p3))
      System.out.println("p1 and p3 are equal.");
    else
      System.out.println("p1 and p3 are not equal.");
    
    if (p2.equals(p4))
      System.out.println("p2 and p4 are equal.");
    else
      System.out.println("p2 and p4 are not equal.");

    System.out.println();

    // Test the hasSameNameAs() method
    if (p1.hasSameNameAs(p4))
      System.out.println("p1 and p4 have the same name.");
    else
      System.out.println("p1 and p4 do not have the same name.");
    
    if (p2.hasSameNameAs(p4))
      System.out.println("p2 and p4 have the same name.");
    else
      System.out.println("p2 and p4 do not have the same name.");

    System.out.println();

    // Test the hasSameAgeAs() method
    if (p1.hasSameAgeAs(p2))
      System.out.println("p1 and p2 have the same age.");
    else
      System.out.println("p1 and p2 do not have the same age.");

    if (p1.hasSameAgeAs(p4))
      System.out.println("p1 and p4 have the same age.");
    else
      System.out.println("p1 and p4 do not have the same age.");
    
    System.out.println();

    // Test the isOlderThan() method
    if (p1.isOlderThan(p2))
      System.out.println("p1 is older than p2.");
    else
      System.out.println("p1 is not older than p2.");

    if (p2.isOlderThan(p1))
      System.out.println("p2 is older than p1.");
    else
      System.out.println("p2 is not older than p1.");
    
    System.out.println();

    // Test the isYoungerThan() method
    if (p1.isYoungerThan(p2))
      System.out.println("p1 is younger than p2.");
    else
      System.out.println("p1 is not younger than p2.");

    if (p2.isYoungerThan(p1))
      System.out.println("p2 is younger than p1.");
    else
      System.out.println("p2 is not younger than p1.");
    
    System.out.println();

    // checking the canvote method and if voting age is set
    Person.setVotingAge(18);
    int ngalaAge = 29;
    boolean ngalaIsaVoter = Person.canVote(ngalaAge);
    System.out.println("Ngala can vote: " + ngalaIsaVoter);
    
    System.out.println("p1 can vote: " + Person.canVote(p1.getAge()));
    System.out.println("p2 can vote: " + Person.canVote(p2.getAge()));
    System.out.println("p3 can vote: " + Person.canVote(p3.getAge()));
    System.out.println("p4 can vote: " + Person.canVote(p4.getAge()));
    // testing with a smaller value :
    Person p5 = new Person("Basheer", 12, "male");
    System.out.println("p5 can vote: " + Person.canVote(p5.getAge()));
    System.out.println();

    //setting driving age
    Person.setDrivingAge(18);

    //testing canDrive
    System.out.println("p1 can drive: " + Person.canDrive(p1.getAge()));
    System.out.println("p2 can drive: " + Person.canDrive(p2.getAge()));
    System.out.println("p3 can drive: " + Person.canDrive(p3.getAge()));
    System.out.println("p4 can drive: " + Person.canDrive(p4.getAge()));
    //
    System.out.println("p5 can drive: " + Person.canDrive(p5.getAge()));
    System.out.println();


    //setting marriage age
    Person.setMarriageAge(20);
    //testing canMarry
    System.out.println("p1 can marry: " + Person.canMarry(p1.getAge()));
    System.out.println("p2 can marry: " + Person.canMarry(p2.getAge()));
    System.out.println("p3 can marry: " + Person.canMarry(p3.getAge()));
    System.out.println("p4 can marry: " + Person.canMarry(p4.getAge()));
    System.out.println();

    // testing if a person is an adult (can drive, can vote and can marry)
    System.out.println("p1 is an adult: " + Person.isAdult(p1.getAge()));
    System.out.println("p2 is an adult: " + Person.isAdult(p2.getAge()));
    System.out.println("p3 is an adult: " + Person.isAdult(p3.getAge()));
    System.out.println("p4 is an adult: " + Person.isAdult(p4.getAge()));
    System.out.println();

    
    //testing the createAdult method
    //Person adult1 = Person.createAdult("Maxine", "female", 18, 21, 19);
    //Person adult2 = Person.createAdult("Wanyonyi", "male", 17, 20, 18);
    //Person adult3 = Person.createAdult("Waithera", "female", 18, 30, 17);

  //System.out.println(adult1.toString());
  // System.out.println(adult2.toString());
   // System.out.println(adult3.toString());
   Person p8 = new Person("Maria", 2, "female");
   Person p9 = new Person("Mary", 5, "female");
   Person p10 = new Person("Moses", 13, "male");
   Person p11= new Person("Quayson", 17, "male");

   //testing is infant
  System.out.println(p1.getName() + "is an infant :" + Person.isInfant(p1.getAge()));
  System.out.println(p2.getName() + "is an infant :" + Person.isInfant(p2.getAge()));
  System.out.println(p3.getName() + "is an infant :" + Person.isInfant(p3.getAge()));
  System.out.println(p4.getName() + "is an infant :" + Person.isInfant(p4.getAge()));

  // testing is toddler
  System.out.println(p1.getName() + "is a toddler :" + Person.isToddler(p1.getAge()));
  System.out.println(p2.getName() + "is a toddler :" + Person.isToddler(p2.getAge()));
  System.out.println(p8.getName() + "is a toddler :" + Person.isToddler(p8.getAge()));
  System.out.println(p9.getName() + "is a toddler :" + Person.isToddler(p9.getAge()));

  //testing child
  System.out.println(p8.getName() + "is a toddler :" + Person.isChild(p8.getAge()));
  System.out.println(p9.getName() + "is a toddler :" + Person.isChild(p9.getAge()));
  System.out.println(p10.getName() + "is a toddler :" + Person.isChild(p10.getAge()));
  System.out.println(p11.getName() + "is a toddler :" + Person.isChild(p11.getAge()));

  // testing teenager
  System.out.println(p8.getName() + "is a toddler :" + Person.isTeenager(p8.getAge()));
  System.out.println(p9.getName() + "is a toddler :" + Person.isTeenager(p9.getAge()));
  System.out.println(p10.getName() + "is a toddler :" + Person.isTeenager(p10.getAge()));
  System.out.println(p11.getName() + "is a toddler :" + Person.isTeenager(p11.getAge()));

  //testing youth
  System.out.println(p8.getName() + "is a toddler :" + Person.isYouth(p8.getAge()));
  System.out.println(p9.getName() + "is a toddler :" + Person.isYouth(p9.getAge()));
  System.out.println(p10.getName() + "is a toddler :" + Person.isYouth(p10.getAge()));
  System.out.println(p11.getName() + "is a toddler :" + Person.isYouth(p11.getAge()));







  }


  
  
  


  
}