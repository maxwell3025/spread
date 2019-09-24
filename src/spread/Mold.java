package spread;

public class Mold extends Object{
int x;
int y;

	public Mold(int l, int m) {
		x=l;
		y=m;
	}
	public void tick(){
		if(Math.random()<0.25){
			Mold m = new Mold(x+(int)Math.round(Math.random()*3-1),y+(int)Math.round(Math.random()*3-1));
		}
	}
	public int factorial(int f){
		if(f==1){
			return 1;
		}
		else{
		return f*factorial(f-1);
		}
		
	}

}
