package com.gyc2799.TestKTV;  ///读文件，从D://eclipseworkspace/Testfileinhere/KTVsongs2.txt中

import java.io.BufferedReader;///从歌名和歌手中取出歌名然后用collections.sort排序
import java.io.*;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class ktvsong {
	ArrayList<String> Songlist = new ArrayList<String>();
	public  static void main(String[] args) {
		new ktvsong().go();
	}
	void go() {
		getSong();
		System.out.println(Songlist);
		Collections.sort(Songlist);
		System.out.println("********************************");
		System.out.println(Songlist);
	}
	void getSong(){
		try {
			File songfile = new File("D://eclipseworkspace/Testfileinhere/KTVsongs2.txt");
			InputStreamReader read = new InputStreamReader(new FileInputStream(songfile), "UTF-8");
			BufferedReader reader = new BufferedReader(read);
			String line= null;
			while ((line =reader.readLine())!=null) {
				addsong(line);
				System.out.println(line);
			}
		}catch(Exception ex) {  
			ex.printStackTrace();
		}
	}
	
	void addsong(String lineMeg) {
		String[] Songname=lineMeg.split("/");
		Songlist.add(Songname[0]);
		//System.out.println(Songname[0]);
	}
}
