import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        ArrayList<String> trace = new ArrayList();
		HashMap<String, String> map = new HashMap();
		for (int i = 0; i < record.length; i++) {
			String[] temp = record[i].split(" ");

			if (temp[0].equals("Enter")) {
				trace.add(temp[1] + "님이 들어왔습니다.");
				map.put(temp[1], temp[2]);
			} else if (temp[0].equals("Leave")) {
				trace.add(temp[1] + "님이 나갔습니다.");
			} else {
				map.put(temp[1], temp[2]);
			}
		}
		String[] answer = new String[trace.size()];
		for (int i = 0; i < trace.size(); i++) {
			int idx = trace.get(i).indexOf("님");
			String name = trace.get(i).substring(0, idx);
			String[] temp = trace.get(i).split(" ");
			answer[i] = map.get(name) + "님이 " + temp[1];
		}
        return answer;
    }
}