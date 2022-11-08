import java.util.ArrayList;

public class POJO {

}

class Datum{
    public int id;
    public String email;
    public String first_name;
    public String last_name;
    public String avatar;
    
	public int getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public String getFirst_name() {
		return first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public String getAvatar() {
		return avatar;
	}
	
}

class Root{
	public int page;
    public int per_page;
    public int total;
    public int total_pages;
    public ArrayList<Datum> data;
    public Support support;
    
    public int getPage() {
		return page;
	}
	public int getPer_page() {
		return per_page;
	}
	public int getTotal() {
		return total;
	}
	public int getTotal_pages() {
		return total_pages;
	}
	public ArrayList<Datum> getData() {
		return data;
	}
	public Support getSupport() {
		return support;
	}
}

class Support{
	public String url;
    public String text;
    
    public String getUrl() {
		return url;
	}
	public String getText() {
		return text;
	}
}