package cn.yunlai.base;

import java.io.IOException;

import org.junit.After;
import org.junit.Test;

import cn.org.rapid_framework.generator.GeneratorProperties;

public class MybatisGeneratorTest {

	@Test
	public void generateSingleTable() throws Exception {
		GeneratorMain.generateSingleTable("point_log");
	}

	@Test
	public void generateMultiTable() throws Exception {
		GeneratorMain.generateMultiTable("point_log");
	}
	
	@After
	public void openDir() throws IOException {
		String dir = GeneratorProperties.getProperty("outRoot");
		String basepackage = GeneratorProperties.getProperty("basepackage").replace(".", "\\");
		Runtime.getRuntime().exec("cmd.exe /c start " + dir + "\\" + basepackage);
	}
	
}