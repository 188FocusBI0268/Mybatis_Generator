package cn.suibao.ssm.main;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.util.List;
import java.util.ArrayList;
import java.io.File;


public class Generator {
    public void generate() throws Exception{

        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;

        //需要指定上一步创建的配置文件在计算机中的绝对路径
        File configFile = new File("D:/ideaProject/Mybatis_Generator/src/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                callback, warnings);
        myBatisGenerator.generate(null);

    }
    public static void main(String[] args) throws Exception {
        try {
            Generator gen = new Generator();
            gen.generate();
            System.out.println("Generate Successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
