package builder;


public enum Type {
	
	DRAGON("Dragon"), DEMON("Demon"), HUMAN("Human");
	
	private String type;
	
	Type(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return type;
	}
	
}
