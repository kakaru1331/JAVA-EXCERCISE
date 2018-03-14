
public class Color {
	public String name;
	
	public Color(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Color) {
			Color color = (Color) obj;
			if (name.equals(color.name))
				return true;
		}
		
		return false;
		}
	
}
