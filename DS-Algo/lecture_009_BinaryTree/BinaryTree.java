import java.util.ArrayList;

public class BinaryTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        Node(int data) {
            this(data, null, null);
        }
    }

    public static void preOrder(Node root, ArrayList<Integer> ans) {
        if (root == null)
            return;

        ans.add(root.data);
        preOrder(root.left, ans);
        preOrder(root.right, ans);
    }

    public static void inOrder(Node root, ArrayList<Integer> ans) {
        if (root == null)
            return;

        inOrder(root.left, ans);
        ans.add(root.data);
        inOrder(root.right, ans);
    }

    public static void postOrder(Node root, ArrayList<Integer> ans) {
        if (root == null)
            return;

        postOrder(root.left, ans);
        postOrder(root.right, ans);
        ans.add(root.data);
    }

    public static int size(Node node) {
        return node == null ? 0 : size(node.left) + 1 + size(node.right);
    }

    public static int sum(Node node) {
        return node == null ? 0 : sum(node.left) + node.data + sum(node.right);
    }

    public static int max(Node node) {
        return node == null ? -(int) 1e9 : Math.max(node.data, Math.max(max(node.left), max(node.right)));
    }

    public static int height(Node node) {
        return node == null ? -1 : Math.max(height(node.left), height(node.right)) + 1;
    }

    public static int countLeaves(Node node) {
        if (node == null)
            return 0;

        if (node.left == null && node.right == null)
            return 1;

        return countLeaves(node.left) + countLeaves(node.right);

    }
    public static void exactlyOneChild(Node node,ArrayList<Integer> ans){
        if(node == null || (node.left == null && node.right == null))
            return;
        
        if(node.left == null || node.right == null)
            ans.add(node.data);

        exactlyOneChild(node.left, ans);
        exactlyOneChild(node.right, ans);
    }

    public static int countExactlyOneChild(Node node){
        if(node == null || (node.left == null && node.right == null))
            return 0;

    }

    // public static int countExactlyOneChild(Node node) {
    //     if (node == null || (node.left == null && node.right == null))
    //         return 0;

    //     int left = countExactlyOneChild(node.left);
    //     int right = countExactlyOneChild(node.right);
    //     int sum = left + right;
    //     if (node.left == null || node.right == null)
    //         sum += 1;
    //     return sum;
    // }

    public static boolean findData(Node node, int data) {
        if (node == null)
            return false;

        if (node.data == data)
            return true;

        return findData(node.left, data) || findData(node.right, data);
    }

    public static boolean nodeToRootPath(Node node, int data, ArrayList<Node> ans) {
        if (node == null)
            return false;

        if (node.data == data) {
            ans.add(node);
            return true;
        }

        boolean res = nodeToRootPath(node.left, data, ans) || nodeToRootPath(node.left, data, ans);
        if (res)
            ans.add(node);

        return res;
    }

    public static ArrayList<Node> nodeToRootPath02_(Node node, int data) {
        if (node == null)
            return null;

        if (node.data == data) {
            ArrayList<Node> list = new ArrayList<>();
            list.add(node);
            return list;
        }

        ArrayList<Node> left = nodeToRootPath02_(node.left, data);
        if (left != null) {
            left.add(node);
            return left;
        }

        ArrayList<Node> right = nodeToRootPath02_(node.right, data);
        if (right != null) {
            right.add(node);
            return right;
        }

        return null;
    }

    public static ArrayList<Node> nodeToRootPath02(Node node, int data) {
        ArrayList<Node> ans = nodeToRootPath02_(node, data);
        return ans != null ? ans : new ArrayList<>();
    }

    public static void KLevelsDown(Node node, int k, Node block, ArrayList<Integer> ans) {
        if (node == null || k < 0 || node == block)
            return;

        if (k == 0) {
            ans.add(node.data);
            return;
        }

        KLevelsDown(node.left, k - 1, block, ans);
        KLevelsDown(node.right, k - 1, block, ans);
    }

    public static ArrayList<Integer> kaway(Node node, int data, int k) {
        ArrayList<Node> list = new ArrayList<>();
        nodeToRootPath(node, data, list);

        ArrayList<Integer> ans = new ArrayList<>();
        Node block = null;
        for (int i = 0; i < list.size(); i++) {
            KLevelsDown(list.get(i), k - i, block, ans);
            block = list.get(i);
        }

        return ans;
    }

    public static int kaway2(Node node, int data, int k, ArrayList<Integer> ans) {
        if (node == null)
            return -1;

        if (node.data == data) {
            KLevelsDown(node, k, null, ans);
            return 1;
        }

        int ld = kaway2(node.left, data, k, ans);
        if (ld != -1) {
            KLevelsDown(node, k - ld, node.left, ans);
            return ld + 1;
        }

        int rd = kaway2(node.right, data, k, ans);
        if (rd != -1) {
            KLevelsDown(node, k - rd, node.right, ans);
            return rd + 1;
        }

        return -1;
    }

    static boolean bal = true;

    public static int isBalanced(Node node) {
        if (node == null)
            return 0;

        int left = isBalanced(node.left);
        int right = isBalanced(node.right);

        if ((left - right) > 1 || (left - right) < -1) {
            bal = false;
        }
        return Math.max(left, right) + 1;
    }

    public int height_(Node node) {
        if (node == null)
            return -1;
        int lh = height_(node.left);
        int rh = height_(node.right);
        int th = Math.max(lh, rh);
        return th + 1;
    }


    public boolean isBal(Node node) {
        if (node == null)
            return true;

        if (!isBal(node.left))
            return false;

        if (!isBal(node.right))
            return false;

        int lh = height(node.left);
        int rh = height(node.right);

        int diff = Math.abs(lh - rh);

        if (diff > 1)
            return false;

        return true;
    }

    public static balPair {
        int height;
        boolean isBal2;
    }

    public boolean isBal2(Node node) {
        balPair left = isBal2(node.left);
        balPair right = isBal2(node.right);

    }

    public int isBal3(Node node) {
        if (node == null)
            return -1;

        int left = isBal3(node.left);
        if (left == -1)
            return left;

        int right = isBal3(node.right);
        if (right == -2)
            return right;

        if (Math.abs(left - right) > 1) {
            return -2;
        }
        return Math.max(left, right) + 1;
    }


    public static class tiltPair{
        int tiltSF = 0;
        int sum = 0;
    }
    
    public tiltPair findTilt(Node root){
    if(root == null)
        return new tiltPair();

    tiltPair left = findTilt(root.left);
    tiltPair right = findTilt(root.right);

    tiltPair myAns = new tiltPair();

    myAns.tiltSF = left.tiltSF + right.tiltSF + Math.abs(left.sum - right.sum);
    myAns.sum = left.sum + right.sum + root.data;

    return myAns;
    }

    // public int[] findTilt2(Node root){
    //     if(root == null)
    //         return new int[2];

    //     int[] left = findTilt2(root.left);
    //     int[] right = findTilt2(root.right);

    //     int[] myAns = new int[2];
    //     myAns[0] = left[0] + 
    // }

    public static int diameter(Node node){
        
    }
}