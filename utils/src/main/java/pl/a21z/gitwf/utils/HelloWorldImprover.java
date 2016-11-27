package pl.a21z.gitwf.utils;

import pl.a21z.gitwf.core.HelloWorldGenerator;

public class HelloWorldImprover {
	public String getBetterHelloWorld() {
		return new HelloWorldGenerator().generate().toUpperCase();
	}
} 