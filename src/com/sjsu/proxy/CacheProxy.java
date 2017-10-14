package com.sjsu.proxy;

public class CacheProxy implements proxy {

	StandardFile std = new StandardFile();
	public String read()
	{
		System.out.println("Reading from Cache");
		return std.read();
	}
	
	public void write(String Data) 
	{
		System.out.println("Writing into Cache");
		std.write(Data);
	}

}
