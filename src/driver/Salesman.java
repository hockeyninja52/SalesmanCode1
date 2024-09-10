package driver;

public class Salesman {
	//properties (variables)
	public String Name;
	public int Revenue;
	
	//constructor
	public Salesman(String Name, int Revenue) {
		this.Name= Name;
		this.Revenue= Revenue;
	}
	public String getName() {
		return this. Name;
	}
	public void setName(String Name) {
		this.Name= Name;
	}
	
	public String display() {
		return this.Name + " " + this.Revenue;
	}
	
	public static Salesman[] topFive(Salesman[] sales) {
		int measure = 0; //maximum amount of comparison will be n * n
		//make a temporary array for the results
		Salesman[] fiveGuys = new Salesman[5]; //fiveGuys[0] = null
		//10, 8, 6, 4, 2
		//if 5 comes in
		// 10, 8, 6, 5, 4
		//null, null, null, null, null
		
		for(int i = 0; i < sales.length; i++) {//scan through all salesmen
			Salesman current = sales[i];
			for(int j = 0; j < 5; j++) {
				Salesman temp = fiveGuys[j];
				if(temp == null) {
					fiveGuys[j] = current;
					break;
				} else {
					if(current.Revenue > temp.Revenue) {
						fiveGuys[j] = current;
						current = temp;
					} 
				}
				measure++;
			}
		}
		System.out.println("This algorithm takes " + measure + " times of comparison.");
		return fiveGuys;
	}
}
