package hashSetTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
   public static void main(String[] args) {
	   // 코테 중 중복없애기할때, 반복문 여러번 쓰면 안된다.
//      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 30, 30, 30, 20, 10, 90));
//      HashSet<Integer> dataSet = new HashSet<Integer>(datas);
//      datas = new ArrayList<Integer>(dataSet);
//      System.out.println(datas);
      
      
      HashSet<String> bloodTypeSet = new HashSet<String>();
      bloodTypeSet.add("A");
      bloodTypeSet.add("B");
      bloodTypeSet.add("O");
      bloodTypeSet.add("AB");
      bloodTypeSet.add("AB");
      bloodTypeSet.add("AB");
      bloodTypeSet.add("AB");
      bloodTypeSet.add("AB");
      bloodTypeSet.add("AB");
      bloodTypeSet.add("AB");
      bloodTypeSet.add("AB");
      
      if(bloodTypeSet.contains("A")) {
         System.out.println("있음");
      }
      
//      System.out.println(bloodTypeSet.toString());
//      Iterator<String> iter = bloodTypeSet.iterator();
//      
//      while(iter.hasNext()) {
//         System.out.println(iter.next());
//      }
   }
}





