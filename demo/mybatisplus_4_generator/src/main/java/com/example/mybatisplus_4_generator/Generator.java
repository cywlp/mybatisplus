package com.example.mybatisplus_4_generator;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;

/**
 * @author :珠代
 * @description : 代码生成器
 * @since :2022-09-18
 */
public class Generator {
    public static void main(String[] args) {
        AutoGenerator autoGenerator = new AutoGenerator();

        // 设置数据源
        DataSourceConfig dataSource = new DataSourceConfig();
        dataSource.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/db1?serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("12345");
        autoGenerator.setDataSource(dataSource);

        // 设置全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOutputDir(System.getProperty("user.dir")+"/demo/mybatisplus_4_generator/src/main/java");
        globalConfig.setOpen(false); // 设置生成完毕后是否打开生成所在目录
        globalConfig.setAuthor("珠代");// 设置作者
        globalConfig.setFileOverride(true); // 设置是否覆盖原始生成的文件
        globalConfig.setMapperName("%sDao"); // 设置数据层接口名，%s为占位符，指代模块名称
        globalConfig.setIdType(IdType.ASSIGN_ID); // 设置Id生成策略
        autoGenerator.setGlobalConfig(globalConfig);

        // 设置包名相关配置
        PackageConfig packageInfo = new PackageConfig();
        packageInfo.setParent("com.example.mybatisplus_4_generator"); // 设置生成的包名，与代码所在位置不冲突，二者叠加组成完整路径
        packageInfo.setEntity("domain");
        packageInfo.setMapper("dao");
        packageInfo.setController("controller");
        autoGenerator.setPackageInfo(packageInfo);

        // 策略设置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setInclude("t_user"); // 设置当前参与生成的表名，参数为可变参数
        strategyConfig.setTablePrefix("t_"); // 设置数据库表的前缀
        strategyConfig.setRestControllerStyle(true); // 是否启用Rest风格
        strategyConfig.setVersionFieldName("version"); // 设置乐观锁字段名
        strategyConfig.setLogicDeleteFieldName("deleted"); // 设置逻辑删除字段名
        strategyConfig.setEntityLombokModel(true); // 设置是否启用lombok
        autoGenerator.setStrategy(strategyConfig);

        // 执行生成操作
        autoGenerator.execute();
    }
}
