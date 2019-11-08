package entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data
public class Foo implements Serializable{
	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Foo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Foo() {
	}

	public static void main(String[] args) {
		Foo f = new Foo("zhangsan",19);
		//--f.setName("lisi");
		System.out.println(f.getName());
		System.out.println(f);
		f = new Foo();
		System.out.println(f);
		
	}


}
