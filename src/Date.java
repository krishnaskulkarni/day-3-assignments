
class Date{
	private int d, m, y;
	
	public Date(int d, int m, int y){
		this.d=d;
		this.m=m;
		this.y=y;
	}
	public String toString(){	
		String myString= String.format("%d/%d/%d",d,m,y);
		return myString;
	}
	public boolean isSmaller(Date d){
		boolean result=false;
		if(this.y < d.y)
		{
			result = true;	
		}
		else if(this.y > d.y)
			{
				result=false;		
			}
			else if(this.y==d.y)
				{
				if(this.m < d.m)
				{
					result=true;
				}
				else if(this.m > d.m)
				{
					result=false;
				}
				else if(this.m==d.m)
				{
					if(this.d < d.d)
					{
						result = true;
					}
					else 
					{
						result = false;
					}							
				}
			}
		return result;
	}
	public int[] diff(Date d){
		int array[] = new int[3];
		
		array[0] = this.d-d.d;
		array[1] = this.m-d.m;
		array[2] = this.y-d.y;
		return array;
	}
	
}