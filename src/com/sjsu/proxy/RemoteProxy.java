package com.sjsu.proxy;

public class RemoteProxy implements proxy
{

	StandardFile std = new StandardFile();
	public String read()
	{
		System.out.println("Reading from Google Drive");
		return std.read();
	}
	public void write(String Data) 
	{
	  System.out.println("Writing to Google Drive");
	  std.write(Data);
	}

}
