package hashMapTest;

import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;

public class HashMapTest {

	public static void main(String[] args) {
		
		// ���̵�, ��й�ȣ, �̸�, ����

		HashMap<String, Object> userMap = new HashMap<String, Object>();
		
		JSONObject userJSON = null;
		
		// ���ڿ��� JSON���� ��ȯ�ؼ� �� �� �ִ�.
		String json = null;
		
		userMap.put("id", "ljm");
		userMap.put("password", "1234");
		userMap.put("name", "������");
		userMap.put("age", 26);
		// size = 4 (������ ����)
		
		// value �����÷��� key ���Է�
		System.out.println(userMap.get("id"));
		
		userJSON = new JSONObject(userMap);
		System.out.println(userJSON);
		
		
		// MAP�� ����������, value�� Collection�̶� �������ִ�
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