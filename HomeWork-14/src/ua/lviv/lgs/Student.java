package ua.lviv.lgs;

public class Student implements Comparable<Student>{
	private String name;
	private int level;
	
	public Student(String name, int level) {
		super();
		this.name = name;
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", level=" + level + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + level;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Student other = (Student) obj;
		if (level != other.level)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

	
	@Override
	public int compareTo(Student o) {
		if ((this.name.compareTo(o.getName()))>0) {
			return 1;			
		} else if ((this.name.compareTo(o.getName()))<0) {
			return -1;
		}else {
			if (this.level > o.getLevel()) {
				return 1;
			} else if (this.level < o.getLevel()) {
				return -1;
			}
		}
		return 0;	
	}
}
