public class Pharmacy<T>{
	private Medicine<T>head;
	private Medicine<T>tail;
	public Pharmacy() {
		this.head = null;
	}
	public Medicine<T> getHead(){
		return head;
	}
    public Medicine<T> getTail(){
		return tail;
	}

	public void setTail(Medicine<T>newNode) {
		this.tail = newNode;
	}
    public void setHead(Medicine<T>newNode) {
		this.head = newNode;
	}
	public boolean isEmpty() {
		if(getHead() == null) {
			return true;
		}
		return false;
	}
	public void addMedicine(Medicine<T>newNode) {
		if(isEmpty()) {
            setHead(newNode);
            setTail(newNode);
		}
		else {
            
		
		newNode.setNext(getHead());
        setHead(newNode);
			
		}
	}
	public void deleteMedicineByNameAndId (String name ,String id  ) {
        Medicine<T> curr=getHead();
        Medicine<T> prev=null;
        if (getHead() ==null){
            System.out.println(" no medicine in the storage ");
        }

        else if( getHead()==getTail()){
            setHead(null);
            setTail(null);
        }
        
        else if (getHead() !=null && ((getHead().getName()==name &&getHead().getID()==id))){
            setHead(getHead().getNext());
        }

        else {
            
                while(curr !=null && !(curr.getName().equals(name) && curr.getID().equals(id)) ){
                    prev=curr;
                    curr=curr.getNext();
                }
                if(curr!=null){
                 prev.setNext(curr.getNext());
                 if (curr == tail) tail = prev;
                }

            }
        }
   


    
    
    public void searchForMedicineUsingGivenID(String id){
        Medicine<T> curr =getHead();
        boolean flag=true;
        if(isEmpty())System.out.println(" no medicine in the storage");

        else if (!isEmpty()){
            while (curr!=null){
                if(curr.getID().equals(id)){
                    System.out.println("[ID: "+curr.getID()+" Name: "+curr.getName()+" Company: "+curr.getCompany()+" Price: "+curr.getPrice()+"]");
                    flag=false;
                }
                curr=curr.getNext();
            }
            if (flag)System.out.println("incorrect ID");
        
        }
        

    }
    public void updateMedicineUsingTheID (String id, String name ,String company ,float price){
        Medicine<T>curr=getHead();
        boolean flag=true;
        while(curr!=null){
            if(curr.getID().equals(id)){
                curr.setCompany(company);
                curr.setName(name);
                curr.setPrice(price);
                flag=false;
            }
            curr=curr.getNext();
        }
        if (flag)System.out.println("incorrect ID");
    }
    void sortList() {
        Medicine<T> current = head;
        while (current != null) {
            Medicine<T> index = current.getNext();
            while (index != null) {
                if (current.getID().compareTo(index.getID()) > 0) {
                    String id = current.getID();
                    String name = current.getName();
                    String company = current.getCompany();
                    float price = current.getPrice();

                    current.setID(index.getID());
                    current.setName(index.getName()); 
                    
                current.setCompany(index.getCompany());
                current.setPrice(index.getPrice());

                index.setID(id);
                index.setName(name); 
                index.setCompany(company);
                index.setPrice(price); 
                }
                index = index.getNext();
            }
            current = current.getNext();
        }
    }

	public void printAllMedicines() {
		if(!isEmpty()) {
		Medicine<T>curr = getHead();
		while(curr != null) {
            System.out.println("[ID: "+curr.getID()+" Name: "+curr.getName()+" Company: "+curr.getCompany()+" Price: "+curr.getPrice()+"]");
            curr = curr.getNext();
		}
		}else {
			System.out.println("The storage is  Empty");
		}
	}
}