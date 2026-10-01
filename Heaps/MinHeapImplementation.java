package Heaps;
class Heap{
    private int[] arr;
    private int idx =1;
    Heap(int capacity){
        arr = new int[capacity+1];
    }

    int peek(){
        if(size() == 0){
            System.out.println("Heap is Empty");
            return -1;
        }
        return arr[1];
    }

    int size(){
       return idx-1;
    }

    void add(int ele){
         if(idx == arr.length){
             System.out.println("Heap is Full");
             return;
         }
         arr[idx++] = ele;

         // rearrangement
         int child =idx-1;
         while(child !=1){
            int parent = child/2;
            // child value < parent value
            if(arr[child] < arr[parent]){
               // swap child with parent  and child become parent
                int temp = arr[parent];
                arr[parent] = arr[child];
                arr[child] = temp;
                child = parent;
            }
            // child value >  parent
            else break;
        }
    }

    int remove(){
        if(size() == 0){
            System.out.println("Heap is Empty");
            return -1;
        }
        int min = arr[1];
        arr[1] = arr[idx-1];
        idx--;
        //rearrangement
        int root =1;
        while(root <=size()){
            int left = 2*root, right = 2*root+1;
            // check left child or write child is existed or not
            int leftValue = (left <= size()) ? arr[left] : Integer.MAX_VALUE;
            int rightValue = (right <= size()) ? arr[left] : Integer.MAX_VALUE;
            if(arr[root] < leftValue && arr[root] < rightValue) break;

            else{
               if(leftValue < arr[root]){
                   int temp = arr[root];
                   arr[root] = arr[left];
                   arr[left] = temp;
                   root = left;
               }
               else{
                   int temp = arr[root];
                   arr[root] = arr[right];
                   arr[right] = temp;
                   root = right;
               }
            }
        }
        return min;
    }

    void display(){
        for(int i=1;i<idx;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}

public class MinHeapImplementation {
    public static void main(String[] arg){
        Heap h = new Heap(10);
        h.add(10); h.add(15); h.add(8); h.add(9); h.add(4);
        h.display();
        System.out.println(h.remove());
        h.display();
        h.add(2);
        h.display();
        System.out.println(h.remove());
        h.display();
    }
}