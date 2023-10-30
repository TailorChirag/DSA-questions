package TreeDataStructure;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
    Node root;

    BinaryTree(){
        Scanner sc = new Scanner(System.in);
        root = createTree(sc);
    }
    Node createTree(Scanner sc){
        int data = sc.nextInt();
        // Base Case
        if(data==-1){
            return null;
        }
        //Recursive code
        Node n = new Node(data);
        n.left = createTree(sc);
        n.right = createTree(sc);
        return n;
    }
    void preOrderPrint(Node root){
        //base Case
        if(root == null)
            return;

        System.out.println(root.data);
        preOrderPrint(root.left);
        preOrderPrint(root.right);
    }
    void inOrderPrint(Node root){
        //base Case
        if(root == null)
            return;

        preOrderPrint(root.left);
        System.out.println(root.data);
        preOrderPrint(root.right);
    }
    void postOrderPrint(Node root){
        //base Case
        if(root == null)
            return;

        preOrderPrint(root.left);
        preOrderPrint(root.right);
        System.out.println(root.data);
    }
    void levelOrderPrint(Node root){
        Queue<Node> q = new LinkedList<>();
        q.offer(root); // add

        while(!q.isEmpty()){
            Node n = q.poll();
            System.out.println(n.data);
            if(n.left!=null){
                q.offer(n.left);
            }
            if(n.right != null){
                q.add(n.right);
            }
        }
        return;

    }
    void printTreeStructure() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                Node node = queue.poll();
                System.out.print(node.data + " ");

                if (node.left != null)
                    queue.add(node.left);

                if (node.right != null)
                    queue.add(node.right);
            }

            System.out.println();
        }
    }
}
