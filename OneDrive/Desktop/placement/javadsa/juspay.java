//lock and unlock

public class juspay{
    static class Node{
        int data;
        List<Node> children;
        boolean islock;
        boolean islockable;
        Node parent;
    
    Node(int val){
        this.data = val;
        this.children = new ArrayList<>();
        this.islocked = false;
        this.islockable = true;

    }
    Node(int val,parent){
        this.data = val;
        this.children = new ArrayList<>();
        this.islocked = false;
        this.islockable = true;
        this.parent = parent;
        
    }
}
boolean islocked(Node root){
    return root.islocked;
}
boolean isAnyParentLocked(Node root){
if(root==null) return false;
return root.islock || isAnyParentLocked(root.parent);
}
void lock(Node root){
    if(!root.islockable){
        return; 
     } //islockable - do we have locking capability
        if(islock(root)){ // if ancestor nodes locked - return
            return;
        }
        //lock the current node.
        //inform all the parent nodes about the current node locked
        if(isAnyParentLocked(root.parent))
        return;
        root.islock = true;
        Node temp = root;
        while(temp!=null){
            temp.islockable = false;
            temp = temp.parent;
        }
    }
    void unlock(Node root){
        //is root already not locked== return;





        //inform all the parents abount unlock;
    }
    
}
