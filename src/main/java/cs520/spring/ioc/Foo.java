package cs520.spring.ioc;

import java.util.List;

public class Foo {
	int a, b;
	List<String> c;
	Bar bar;

	public Foo() {
		a = b = 0;
	}

	public Foo(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void setC(List<String> c) {
		this.c = c;
	}

	public void setBar(Bar bar) {
		this.bar = bar;
	}
}
