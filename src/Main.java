public class Main {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.add(85);
        bst.add(41);
        bst.add(75);
        bst.add(36);
        bst.add(42);
        bst.add(52);
        bst.add(78);

        System.out.println("chưa xóa: ");
        bst.inOrder();

        bst.remove(41);
        System.out.println("\nXóa 41: ");
        bst.inOrder();

        bst.remove(36);
        System.out.println("\nXóa 36: ");
        bst.inOrder();
    }
}
