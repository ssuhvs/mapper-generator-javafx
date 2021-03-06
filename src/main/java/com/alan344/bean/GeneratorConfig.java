package com.alan344.bean;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

/**
 * @author AlanSun
 * @date 2019/8/13 16:20
 */
@Getter
@Setter
public class GeneratorConfig {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeneratorConfig that = (GeneratorConfig) o;
        return Objects.equals(configName, that.configName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configName);
    }

    /**
     * 配置的名称
     */
    private String configName;
    /**
     * 类中的作者信息
     */
    private String author;
    /**
     * 是否使用java8
     */
    private boolean userJava8 = true;
    /**
     * 是否支持 BigDecimal
     * <p>
     * 所有 number 都是用 BigDecimal
     */
    private boolean useBigDecimal;
    /**
     * 使用支持 swagger
     */
    private boolean useSwagger;
    /**
     * 使用支持 swagger
     */
    private boolean userMerge;
    /**
     * 使用注释
     */
    private boolean useComment = true;
    /**
     * bean 的导出地址
     */
    private String beanLocation;
    /**
     * bean 包名
     */
    private String beanPackage;
    /**
     * mapper 导出地址
     */
    private String mapperLocation;
    /**
     * mapperBean 包名
     */
    private String mapperPackage;
    /***
     * xml导出地址
     */
    private String mapperXmlLocation;
    /**
     * 使用原来的字段名
     */
    private boolean useActualColumnNames;
}
