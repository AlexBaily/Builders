package builder;



public class Boss {

	private final String name;
	private final String size;
	private final int hp;
	private final Type type;
	
	private Boss(Builder builder) {
		this.name = builder.name;
		this.size = builder.size;
		this.hp = builder.hp;
		this.type = builder.type;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSize() {
		return this.size;
	}
	
	public int getHP() {
		return this.hp;
	}
	
	public Type getType() {
		return this.type;
	}
	
	@Override
	public String toString() {
		return this.name + " is a " + this.type;
	}
	
	public static class Builder {
		
		private final String name;
		private String size;
		private int hp;
		private Type type;
		
		public Builder(String name) {
			this.name = name;
		}
		
		public Builder atSize(String size) {
			this.size = size;
			return this;
		}
		
		public Builder withHp(int hp) {
			this.hp = hp;
			return this;
		}
		
		public Builder withType(Type type) {
			this.type = type;
			return this;
		}
		
		public Boss build() {
			return new Boss(this);
		}
		
	}
	
}

