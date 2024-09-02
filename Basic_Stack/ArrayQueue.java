package interview_prep.Basic_Stack;

class ArrayQueue {
    private int[] arr;
    private int start, end;
    private int currSize,maxSize ;
    public ArrayQueue(int maxSize){
        this.maxSize = maxSize;
        arr = new int[maxSize];
        start =-1;
        end =-1;
        currSize =0;
    }
    public ArrayQueue() {
        this(16);
    }

    public void push(int x) {
       if(currSize == maxSize){
            System.out.println("Queue is full") ;
            System.exit(1);
       }
       if(end == -1){
            start =0;
            end =0;
       }else{
        end = (end+1)%maxSize;
       }
       arr[end] = x;
       currSize++;
    }

    public int pop() {
        if(isEmpty()){
            System.out.println("Queue is Empty");
            System.exit(1);
        }
        int poppedElement = arr[start];
        if(currSize == 1){
            start = -1;
            end =-1;
        }else{
            start = (start+1)%maxSize;
        }
        currSize--;
        return poppedElement;
    }

    public int peek() {
        if(isEmpty()){
            System.out.println("Queue is Empty");
            System.exit(1);
        }
        return arr[start];
    }

    public boolean isEmpty() {
        if(start == -1){
            return true;
        }
        return false;
    }
    public int size(){
        return currSize;
    }
    public static void main(String[] args) {
		ArrayQueue q = new ArrayQueue(6);
		q.push(4);
	}
}
