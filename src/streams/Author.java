package streams;

public class Author {
	private String name; 
	private String surname; 
	private int age; 
	Gender gender;

	public Author(String name, String surname, int age, Gender gender) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getAge() {
		return age;
	}

	public Gender getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", surname=" + surname + ", age=" + age + ", gender=" + gender + "]";
	} 
	
	
}
