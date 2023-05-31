package copy;

public class CopyTest {
   public static void main(String[] args) {
      Address address = new Address("강남구", "서울시", "대한민국");
      User original = new User("John", "John", address);
      User shallowCopy = new User(original.getFirstName(), original.getLastName(), original.getAddress());
      User deepCopy = new User(original);
      
//      shallowCopy.getAddress().setStreet("도봉구");
      deepCopy.getAddress().setStreet("도봉구");
      
      System.out.println(original.getAddress().getStreet());
      
   }
}