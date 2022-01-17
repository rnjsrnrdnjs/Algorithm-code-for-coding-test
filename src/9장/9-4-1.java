import java.util.*;
import java.io.*;

public class Main {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
        void insert(int n) {
            if (n < this.data) {
                if (this.left == null)
                    this.left = new Node(n);
                else this.left.insert(n);
            } else {
                if (this.right == null)
                    this.right = new Node(n);
                else this.right.insert(n);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Node tree = new Node(Integer.parseInt(br.readLine()));
        String input;
        while (true) {
            input = br.readLine();
            if (input == null || input.equals(""))
                break;
				tree.insert(Integer.parseInt(input));
        }
        postOrder(tree);
    }

    static void postOrder(Node tree) {
        if (tree == null)return;
        postOrder(tree.left);
        postOrder(tree.right);
        System.out.println(tree.data);
    }
}