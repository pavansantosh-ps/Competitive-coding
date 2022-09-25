import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws Exception {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("LinkedList before reordering :");
        System.out.print(list.get(0));
        for(int i = 1;i < list.size(); i++){
            System.out.print(" -> " + list.get(i));
        }
        reOrderedList(list);
    }

    private static void reOrderedList(LinkedList<Integer> list) {
        LinkedList<Integer> reOrderList = new LinkedList<>();
        for(int i = 0;i < (list.size() / 2) + 1;i++){
            if(i == list.size() / 2){
                reOrderList.add(list.get(i));
            }else{
                reOrderList.add(list.get(i));
                reOrderList.add(list.get(list.size() - 1 - i));
            }
        }
        System.out.println();
        System.out.println("LinkedList after reordering :");
        System.out.print(reOrderList.get(0));
        for(int i = 1;i < reOrderList.size(); i++){
            System.out.print(" -> " + reOrderList.get(i));
        }
    }
}
