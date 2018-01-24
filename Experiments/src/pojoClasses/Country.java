package pojoClasses;

public class Country {

	String name;
	long population;
	String capitalName;



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}
	
	public String getCapitalName() {
		return capitalName;
	}

	public void setCapitalName(String capitalName) {
		this.capitalName = capitalName;
	}
	
	@Override
    public boolean equals(Object obj) {
		Boolean value = null;
        if (this == obj){
        	value = true;
         
        }
        if (obj == null){
        	value = false;
         
        }
        if (getClass() != obj.getClass())
        	value = false;
        
        
        Country other = (Country) obj;
        if (name == null) {
            if (other.name != null)
            	value = false;
        } else if (name.equals(other.name))
        	value = true;
        
        return value;
    }
}
