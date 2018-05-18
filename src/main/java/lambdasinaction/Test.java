package lambdasinaction;

import java.io.File;
import java.io.FileFilter;

public class Test {
	
	public static void main(String[] args) {
		
		//查看隐藏的文件
		File[] listFiles = new File(".").listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File file) {
				return file.isHidden();
			}
		});
		
		
		//改为java8,把这个方法作为值，将其传递给listFiles方法
		File[] listFiles2 = new File(".").listFiles(File::isHidden);
	}

}
