package com.sjsu.proxy;

public class ProxyDemo {

	public static void main(String[] args) 
	{
		AccessProxy A = new AccessProxy();
		RemoteProxy R = new RemoteProxy();
		CacheProxy  C = new CacheProxy();
		
		
		A.write("Trying Access Proxy Write");
		String Access = A.read();
		System.out.println("Reading from Access Proxy as : "+Access);
		System.out.println("\n");
		
		
		R.write("Trying Remote Proxy Write");
		String Remote = R.read();
		System.out.println("Reading from Remote Proxy as : "+Remote);
		System.out.println("\n");
		
		
		C.write("Trying Cache Proxy Write");
		String Cache = C.read();
		System.out.println("Reading from Cache Proxy as : "+Cache);
		System.out.println("\n");
	}

}
