package exam;

import java.util.Comparator;

public class Cuboid extends Rectangle {

	private int iDepth;
	
	public Cuboid(int w, int l, int d) {
		super(w, l);
		iDepth = d;
	}
	
	public int getDepth() {
		return iDepth;
	}

	public void setDepth(int d) {
		iDepth = d;
	}
	
	public double volume() {
		return super.getWidth() * super.getLength() * iDepth;
	}
	
	

	
	@Override
	public double area() {
		return 2 * ((super.getLength()*super.getWidth())
				+ (super.getWidth()* iDepth) + (super.getLength()* iDepth));
	}

	@Override
	public double perimeter() {
		throw new UnsupportedOperationException();
	}


	

	public class SortByArea implements Comparator<Cuboid>{
		public int compare(Cuboid x, Cuboid y) {
			return (int) x.area()- (int)y.area();
		}
	}
	
	public class SortByVolume implements Comparator<Cuboid>{
		public int compare(Cuboid x, Cuboid y) {
			return (int)x.volume() - (int)y.volume();
			
		}
	}


}




