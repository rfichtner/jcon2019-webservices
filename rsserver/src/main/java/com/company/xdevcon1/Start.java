package com.company.xdevcon1;

import org.apache.meecrowave.Meecrowave;


public class Start {

	public static void main(String[] args) {
		new Meecrowave(new Meecrowave.Builder()
		{
			{
				// randomHttpPort();
				this.setHttpPort(8080);
				this.setTomcatScanning(true);
				this.setTomcatAutoSetup(true);
				this.setHttp2(true);
			}
		}).bake().await();

	}

}
