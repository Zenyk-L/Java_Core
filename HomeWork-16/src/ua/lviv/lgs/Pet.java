package ua.lviv.lgs;

public class Pet extends Animal {
	public String name;
	public int age;
	private String owner;
	
	public Pet() {
		this.name = "No name";
		this.age = 0;
		this.owner = "No owner";
	}
	public Pet(String name, int age, String owner) {
		super();
		this.name = name;
		this.age = age;
		this.owner = owner;
	}
	public Pet(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + ", owner=" + owner + "]";
	}
	
	public void myMethod(String a, int oneInt, int twoInt) {
		this.name = this.name + " " + a;
		this.age = this.age +  oneInt + twoInt;
	}
	
	public void myMethod(String nameAdd, String ownerNameAdd) {
		this.name = this.name + " " + nameAdd;
		this.owner = this.owner + " " + ownerNameAdd;
	}
	
	
}
