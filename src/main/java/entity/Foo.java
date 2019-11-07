package entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Foo implements Serializable{
	private String name;
	private int age;
	
	public static void main(String[] args) {
		Foo f = new Foo("zhangsan",19);
		//--f.setName("lisi");
		System.out.println(f.getName());
		System.out.println(f);
		f = new Foo();
		System.out.println(f);
		
	}
}
