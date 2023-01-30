public class Medicine<T>{
    private String ID;
    private String name;
    private String company;
    private float price;
	private Medicine<T>next;
	private Medicine<T>prev;
	public Medicine(String iD, String name, String company, float f) {
        ID = iD;
        this.name = name;
        this.company = company;
        this.price = f;
    }
    public void setPrev(Medicine<T> prev) {
        this.prev = prev;
    }
    public Medicine<T> getPrev() {
        return prev;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Medicine<T> getNext() {
        return next;
    }

    public void setNext(Medicine<T> next) {
        this.next = next;
    }
    
	
}