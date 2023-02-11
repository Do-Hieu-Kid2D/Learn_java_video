package bai10_xulychuot;

public class xulychuot_module {
	private	int x,y,count;
	private String vi_tri;
	
	public xulychuot_module() {
		//super();
		this.x = 0;
		this.y = 0;
		this.count = 0;
		this.vi_tri = "No!";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getVi_tri() {
		return vi_tri;
	}

	public void setVi_tri(String vi_tri) {
		this.vi_tri = vi_tri;
	}
	
	public void anclick() {
		this.count++;
	}
	
	public void divao() {
		this.setVi_tri("Yes!");
	}
	public void dira(){
		this.setVi_tri("No!");
	}
	public void cap_nhat_vi_tri(int x , int y) {
		this.setX(x);
		this.setY(y);
	}
	
	
}	
