package cn.io.study01;

import java.io.File;
import java.util.Arrays;

public class DirStudy01 {
	public static void main(String[] args) {
		File src=new File("E:/workspace-java/IO������");
		
		/*//����Ŀ¼
		boolean flag=src.mkdirs();
		System.out.println(flag);
		
		//����Ŀ¼
		
		src=new File("E:/workspace-java/IO������/dir/test2");
		flag=src.mkdir();
		System.out.println(flag);*/
		
		//�¼�����
		String[] subNames=src.list();
		for(String str:subNames) {
			System.out.println(str);
		}
		System.out.println();
		//�¼�����
		File[] files=src.listFiles();
		for(File file:files) {
			System.out.println(file);
		}
		System.out.println();
		//�����̷�
		File[] roots=src.listRoots();
		System.out.println(Arrays.toString(roots));
		
	}

}
