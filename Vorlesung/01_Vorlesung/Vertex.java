
public class Vertex {
	private int x;
	private int y;

	public Vertex(int x, int y) {
		this.x = x + 2;
		this.y = y;
		
	}
	
	public Vertex(int y) {
		//anstatt noch mal this.y = y zu schreiben, kann man auch den anderen Konstruktor aufrufen
//		this.y = y;
//		this.x = 2;
		this(0, y);
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
