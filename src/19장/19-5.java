import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while(T--> 0){
            Trie trie = new Trie();
            boolean tof = true;
            int n = Integer.parseInt(br.readLine());
            for(int j = 0; j < n; j++) {
                if(!trie.insert(br.readLine())) {
                    tof = false;
                }
            }
            sb.append(tof == true ? "YES\n" : "NO\n");
        }
        System.out.println(sb.toString());
    }
    static class TrieNode {
        Map<Character, TrieNode> childNodes = new HashMap<>();
        boolean isLast;
    }
    static class Trie {
        TrieNode root = new TrieNode();
        boolean insert(String word) {
            TrieNode thisNode = root;
            for(int i = 0; i < word.length(); i++) {
                char n = word.charAt(i);
                if(thisNode.childNodes.get(n) == null) {
                    thisNode.childNodes.put(n, new TrieNode());
                }
                thisNode = thisNode.childNodes.get(n);
                if(thisNode.isLast == true) return false;
            }
            if(thisNode.childNodes.size() != 0) return false;
            thisNode.isLast = true;
            return true;
        }
    }
}