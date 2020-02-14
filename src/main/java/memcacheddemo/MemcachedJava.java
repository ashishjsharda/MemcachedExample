package memcacheddemo;

import java.io.IOException;
import java.net.InetSocketAddress;

import net.spy.memcached.MemcachedClient;

public class MemcachedJava {

	public static void main(String[] args) throws IOException {

		MemcachedClient mcc=new MemcachedClient(new InetSocketAddress("127.0.0.1",11211));
		System.out.println("Connected to server");
		System.out.println("Add status " +mcc.add("ashish", 900, "redis").isDone());
		System.out.println("Get value from cache" +mcc.get("ashish"));
	}

}
