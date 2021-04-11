package com.zf.dome.util;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 钟凡
 * @program: lydata-handfulcode-backstage
 * @description: MyBatis Plus 代码生成
 * @company—date: 利元数据 2021-03-29 20:33
 * 注意：如果更换项目，其中两个位置的项目路径需要修改，以及一个位置的 包名。
 *       检查生成文件夹名称是否是需要的
 *       检查生成文件后缀是否是需要的
 **/

public class CreateCode {

    //main函数
    public static void main(String[] args) {

        AutoGenerator autoGenerator = new AutoGenerator();

        //全局配置
        GlobalConfig gc = new GlobalConfig();
        //String oPath = System.getProperty("E:/IdeaProjects/spring-cloud-dome/test-dome/src/main/java");//得到当前项目的路径
        gc.setOutputDir("E:/IdeaProjects/spring-cloud-dome/test-dome/src/main/java");   //生成文件输出根目录
        gc.setOpen(false);//生成完成后不弹出文件框
        gc.setFileOverride(true);  //文件覆盖
        gc.setActiveRecord(false);// 不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(false);// XML columList
        gc.setAuthor("钟凡");// 作者

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setControllerName("%sController");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        gc.setSwagger2(true);


        autoGenerator.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);   //设置数据库类型，我是postgresql
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("Lyhdata@mysql105");
        dsc.setUrl("jdbc:mysql://192.168.3.105:3306/lydata_form");  //指定数据库
        autoGenerator.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);      // 表名生成策略
        strategy.setInclude(new String[] {
                "t_lyh_image_properties"
        });     // 需要生成的表
        //strategy.setSuperServiceClass("t_lyh_component_attributes");
        //strategy.setSuperServiceImplClass( "t_lyh_component_attributes");
        //strategy.setSuperMapperClass("t_lyh_component_attributes");

        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);


        //去除表前缀
        //strategy.setTablePrefix("an_");
        //去除字段前缀
        //strategy.setFieldPrefix("");
        //把这个干掉直接生成库中所有表文件
        autoGenerator.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.zf.dome");
        pc.setController("controller");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setMapper("mapper");
        pc.setEntity("pojo");
        //pc.setXml("mapper");

        //strategy.setTablePrefix(pc.getModuleName() + "_");	//是否生成实体时，生成字段注解

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };

        // 如果模板引擎是 freemarker
        // String templatePath = "/templates/mapper.xml.ftl";
        // 如果模板引擎是 velocity
        String templatePath = "/templates/mapper.xml.vm";


        // 自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                return "E:/IdeaProjects/spring-cloud-dome/test-dome/src/main/resources/mapper/" + pc.getModuleName()
                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });

        /*
        cfg.setFileCreate(new IFileCreate() {
            @Override
            public boolean isCreate(ConfigBuilder configBuilder, FileType fileType, String filePath) {
                // 判断自定义文件夹是否需要创建
                checkDir("调用默认方法创建的目录，自定义目录用");
                if (fileType == FileType.MAPPER) {
                    // 已经生成 mapper 文件判断存在，不想重新生成返回 false
                    return !new File(filePath).exists();
                }
                // 允许生成模板文件
                return true;
            }
        });
        */

        cfg.setFileOutConfigList(focList);
        autoGenerator.setCfg(cfg);

        autoGenerator.setPackageInfo(pc);

        // 执行生成
        autoGenerator.execute();
    }

}

