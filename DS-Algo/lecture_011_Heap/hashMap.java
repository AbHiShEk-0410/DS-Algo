import java.util.LinkedList;

public class hashMap{

    private class Node{
        Integer key = null;
        Integer value = null;

        Node(Integer key, Integer value){
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Node>[] Buckets;
    private int bucketLen = 0;
    private int TotalNoOfNodes = 0;

    private void intialize(int size){
        bucketLen = size;
        Buckets = new LinkedList[size];
        for(int i = 0;i < size; i++)
            Buckets[i] = new LinkedList<>();

        TotalNoOfNodes = 0;
    }

    hashMap(){
        intialize(10);
    }

    public int size(){
        return this.bucketLen;
    }

    public boolean isEmpty(){
        return this.size() == 0;
    }
    
    
    public boolean containsKey(Integer key){
        LinkedList<Node> group = getGroup(key);
        int gs = group.size();
        boolean res = true;
        while(gs-- > 0){
            if(group.getFirst().key == key){
                res = true;
                break;
            }

            group.addLast(group.removeFirst());
        }
        return res;
    }

    public Integer get(Integer key){
        LinkedList<Node> group = getGroup(key);
        int gs = group.size();
        while(gs-- > 0){
            if(containsKey(key)){
                 return group.getFirst().value;
            }
        }
        return null;
    }

    public Integer remove(Integer key){
        LinkedList<Node> group = getGroup(key);
        int gs = group.size();
        while(gs-- > 0){
            if(containsKey(key)){
                return group.removeFirst().value;
            }
        }
        return null;
    }

    public  Integer 

    private LinkedList<Node> getGroup(Integer key){
        int hc = getHashCode(key);
        return Buckets[hc];
    }

    private int getHashCode(Integer key){
        return Math.abs(key.hashCode()) % bucketLen;
    }
}