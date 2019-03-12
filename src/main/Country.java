package main;

public class Country{
	private String countryName;
	private long population;
	private long area;

	public Country(){ 
	
	}
	public Country(String name,long population,long area){
		countryName = name;
		this.population = population;
		this.area = area; 
	
	}
	
	public void setCountryName(String countryName){
		this.countryName=countryName;
	}

	public String getCountryName(){
		return countryName;
	} 

	public void setPopulation(long population){
		this.population=population;
	}
	
	public long getPopulation(){
		return population;
	} 

	public void setArea(long area){
		this.area=area;
	}
	
	public long getArea(){
		return area;
	} 



	public Country largestArea(Country arr[]){
		long max=arr[0].area;
		int index=0; 
		for(int i = 1; i < arr.length; i++)
        		{
       			    if(max < arr[i].area)
      			    {
                			max = arr[i].area;
					index = i;
           		    }
			}
			return arr[index] ; 
		}
	
	public Country largestPopulation(Country arr[]){
		long max=arr[0].population;
		int index=0; 
		for(int i = 1; i < arr.length; i++)
        		{
       			    if(max < arr[i].population)
      			    {
                			max = arr[i].population;
					index = i;
           		    }
			}
			return arr[index] ;
		}

	public Country largestPopulationDensity(Country arr[]){
		int index=0;
		double populationDensityMax = arr[0].population/arr[0].area;
		for(int i = 1; i < arr.length; i++)
        		{
				double populationDensity = arr[i].population/arr[i].area;
       			    if(populationDensityMax < populationDensity)
      			    {
                			populationDensityMax = populationDensity;
					index = i;
           		    }
			}
		return arr[index];
	}

}