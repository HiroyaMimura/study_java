package study;

public class Hero {
	String hero;

	public String name;
	
	public boolean equals(Object o) {
		if(o == this) return true;
		if(o == null) return false;
		if(!(o instanceof Hero)) return false;
		Hero r = (Hero)o;
		if(!this.hero.trim().equals(r.hero.trim())) {
			return false;
		}
		return true;
	}
}
