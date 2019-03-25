package exam;

public class Rectangle extends shape{

	private int iWidth;
	private int iLength;
	
	public Rectangle(int w, int l) {
		super();
		iWidth = w;
		iLength = l;
	}
	

	public int getWidth() {
		return iWidth;
	}

	public void setWidth(int w) {
		iWidth = w;
	}

	public int getLength() {
		return iLength;
	}

	public void setLength(int l) {
		iLength = l;
	}

	
	

	@Override
	public double area() {
		return iWidth * iLength;
	}

	@Override
	public double perimeter() {
		return iWidth + iWidth + iLength + iLength;
	}

	
	public int compareTo(Object r) {
		if(((Rectangle)r).area() < this.area()) {
			return 1;
		}
		else if(((Rectangle) r).area() > this.area()) {
			return -1;
		}
		else
			return 0;
		}
		
}


	

