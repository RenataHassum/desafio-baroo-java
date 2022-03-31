package bill;

public class Bar {

	public char gender;
	public int beer;
	public int softDrink;
	public int barbecue;
	public double statusCover;

	public double feeding() {
		return (beer * 5.00) + (softDrink * 3.00) + (barbecue * 7.00);
	}

	public double cover() {
		if (feeding() > 30.00) {
			return statusCover = 0.00;
		} else {
			return statusCover = 4.00;
		}
	}

	public double ticket() {
		if (gender == 'F') {
			return 8.00;
		} else {
			return 10.00;
		}
	}

	public double total() {
		return feeding() + cover() + ticket();

	}

}
