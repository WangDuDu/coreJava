package com.imooc.io;

import java.io.IOException;

public class IOUtilTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			IOUtil.printHex("e:\\javaio\\FileUtils.java");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
