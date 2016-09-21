package calculateArea;

public abstract class Shape {
	
	private String fillcolor;
	private String linecolor;
	
	public Shape(){
		
	}
	
	public Shape(String fillcolor, String linecolor){
		this.fillcolor=fillcolor;
		this.linecolor=linecolor;
	}
	public String getFillcolor() {
		return fillcolor;
	}

	public String getLinecolor() {
		return linecolor;
	}

	public void setFillcolor(String fillcolor) {
		this.fillcolor = fillcolor;
	}

	public void setLinecolor(String linecolor) {
		this.linecolor = linecolor;
	}

	public abstract void draw()	;
	public abstract double calculateArea();

}
