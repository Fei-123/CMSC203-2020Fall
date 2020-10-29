package Assignment4;

public class Plot {
	private int x;
	private int y;
	private int width;
	private int depth;
	
	@Override
	public String toString() {
		return "Upper left: (" + this.x +"," + this.y +"); Width: " + this.width + " Depth: " + this.depth;
				}

	public Plot() {
		x=0;
		y=0;
		width =1;
		depth =1;
	}
	
	public Plot(Plot p) {
		x = p.x;
		y = p.y;
		width = p.width;
		depth = p.depth;
	}
	
	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	public boolean overlaps(Plot plot) {
		boolean flag = true;
		/*if(plot.x+plot.width<=x&&plot.y>=y+depth) {
			flag = false;
		}
		else if(plot.x>=x&&plot.x+plot.width <= x+width&&plot.y>y+depth) {
			flag = false;
		}
		else if(plot.x>=x+width&&plot.y>=y+depth) {
			flag = false;
		}
		else if(plot.x>x+width&&plot.y>=y&&plot.y+plot.width <= y+width) {
			flag = false;
		}
		else if(plot.x>=x+width&&plot.y+plot.depth<=y) {
			flag = false;
		}
		else if(plot.y+plot.depth<y&&plot.x>=x&&plot.x+plot.width<=x+width) {
			flag = false;
		}
		else if(plot.x+plot.width<=x&&plot.y+plot.depth <= y) {
			flag = false;
		}
		else if(plot.x+plot.width<x&&y<=plot.y&&plot.y+plot.depth<=y+depth) {
			flag = false;
		}*/
		if(plot.x+plot.width<=x) {
			flag = false;
		}
		else if(plot.y+plot.depth<=y) {
			flag = false;
		}
		else if(plot.x>=x+width) {
			flag = false;
		}
		else if(plot.y>=y+depth) {
			flag = false;
		}
		
		
		return flag;
	}
	
	public boolean encompasses(Plot plot) {
		boolean flag = false;
		if(x <= plot.x  && x + width >=plot.getX() + plot.getWidth() && y <= plot.getY()  
				&& y + depth >= plot.getY() + plot.getDepth()) {
				
				flag = true;}
		
		return flag;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getDepth() {
		return depth;
	}

	
	
}
