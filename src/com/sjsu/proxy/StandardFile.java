package com.sjsu.proxy;

public class StandardFile 
{
	String Text;
	public StandardFile()
	{
		Text = "Software Engineering";
	}
	public String read()
	{
		
		return Text;
	}
	
	public void write(String Data)
	{
		System.out.println("Writing \"" +Data+ "\" into Standard File");
		this.Text = Data;
	}

}
