package cn.io.study01;

import java.io.File;
import java.util.Arrays;

public class DirStudy01 {
	public static void main(String[] args) {
		File src=new File("E:/workspace-java/IO流技术");
		
		/*//创建目录
		boolean flag=src.mkdirs();
		System.out.println(flag);
		
		//创建目录
		
		src=new File("E:/workspace-java/IO流技术/dir/test2");
		flag=src.mkdir();
		System.out.println(flag);*/
		
		//下级名称
		String[] subNames=src.list();
		for(String str:subNames) {
			System.out.println(str);
		}
		System.out.println();
		//下级对象
		File[] files=src.listFiles();
		for(File file:files) {
			System.out.println(file);
		}
		System.out.println();
		//所有盘符
		File[] roots=src.listRoots();
		System.out.println(Arrays.toString(roots));
		
	}

}
