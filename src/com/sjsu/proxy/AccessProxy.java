package com.sjsu.proxy;

public class AccessProxy implements proxy 
{
	StandardFile std = new StandardFile();
	public String read()
	{
		System.out.println("Auth token Authenticated");
		return std.read();
	}
	public void write(String Data) 
	{
	  System.out.println("Auth token Authenticated");
	  std.write(Data);
	}
	

}
