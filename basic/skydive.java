class skydive{
  public static void main(String[] args){
    int age = 21;
    if (age <= 60 && age >=18 ){
      System.out.println("You can skydive.");
    }
    
    else if (age < 18 && age > 0){
      System.out.println("Sorry, you are not old enough to skydive.");
    }

  }
}