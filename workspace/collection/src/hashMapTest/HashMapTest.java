package hashMapTest;

import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;

public class HashMapTest {

	public static void main(String[] args) {
		
		// 아이디, 비밀번호, 이름, 나이

		HashMap<String, Object> userMap = new HashMap<String, Object>();
		
		JSONObject userJSON = null;
		
		// 문자열도 JSON으로 변환해서 할 수 있다.
		String json = null;
		
		userMap.put("id", "ljm");
		userMap.put("password", "1234");
		userMap.put("name", "이종문");
		userMap.put("age", 26);
		// size = 4 (쌍으로 구분)
		
		// value 가져올려고 key 값입력
		System.out.println(userMap.get("id"));
		
		userJSON = new JSONObject(userMap);
		System.out.println(userJSON);
		
		
		// MAP은 순서가없다, value는 Collection이라 순서가있다
		try {
			userJSON.put("gender", "none");
			System.out.println(userJSON);
			
			json = userJSON.toString();
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(userJSON.get("id"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		try {
			userJSON = new JSONObject(json);
			System.out.println(userJSON.get("id"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
	}

}
