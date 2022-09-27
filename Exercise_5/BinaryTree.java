public class BinaryTree {

    public static void main(String[] args) {

        // Create root node A
        Node Ceo = new Node("Alex");
        // Create node B
        Node Coo = new Node("Ronn");
        // Create node C
        Node VicePresident = new Node("Neil");
        // Create node D
        Node Manager = new Node("Mycko");
        // Create node E
        Node Supervisor = new Node("Jamil");
        // Create node F
        Node Employee1 = new Node("Abdul");
        // Create node G
        Node Employee2 = new Node("Marvin");

        // Set left and right child of root node A
        Ceo.left = Coo;
        Ceo.right = VicePresident;

        // Set left and right child of node B
        Coo.left = Manager;
        Coo.right = Supervisor;

        // Set left and right child of node C
        VicePresident.left = Employee1;
        VicePresident.right = Employee2;
        
        
        System.out.print("\nPre order Traversal: ");
        traversePreOrder(Ceo);

        System.out.print("\nIn order Traversal: ");
        traverseInOrder(Ceo);

        System.out.print("\nPost order Traversal: ");
        traversePostOrder(Ceo);
    }

        
         static void traversePreOrder(Node node) {
            if (node != null) {
                System.out.print(" " + node.data);
                traversePreOrder(node.left);
                traversePreOrder(node.right);
            }
        
    }
     
    static void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
            
        }
    }

    static void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
}
