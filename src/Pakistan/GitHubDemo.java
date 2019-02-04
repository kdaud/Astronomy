package Pakistan;

import java.util.Enumeration;
import java.util.Stack;

@SuppressWarnings("all")
public class GitHubDemo {
	public static void main(String[] args) {
		//this a single line comment
		flit();
	}
	public static void flit()
	{
		Stack<String>list = new Stack<>();
		list.push("Racheal");
		list.push("Annet");
		list.push("Allen");
		list.push("Hellen");
		list.push("Trevor");
		Enumeration en = list.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
	}
}
