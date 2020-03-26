package com.sensetime.ehr.emp.common.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;

/**
 * Json转化配置类
 *
 * @author zhengbing_vendor
 * @date 2019/9/2
 */
@Configuration
public class FastJsonConvertersConfig {

    /**
     * 注入Bean : HttpMessageConverters，以支持fastjson
     *
     * @return HttpMessageConverters
     */
    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters() {
        FastJsonHttpMessageConverter fastConvert = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();

        final SerializerFeature[] configStatic = new SerializerFeature[]{
                //boolean为null时输出false
                SerializerFeature.WriteNullBooleanAsFalse,
                //如果key不为String 则转换为String 比如Map的key为Integer
                SerializerFeature.WriteNonStringKeyAsString,
                //list为null时输出[]
                SerializerFeature.WriteNullListAsEmpty,
                //number为null时输出0
                SerializerFeature.WriteNullNumberAsZero,
                //String为null时输出"
                SerializerFeature.WriteNullStringAsEmpty,
        };
        // 自定义时间格式
        fastJsonConfig.setDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        // 正常转换 null 值
        fastJsonConfig.setSerializerFeatures(configStatic);
        fastConvert.setFastJsonConfig(fastJsonConfig);
        return new HttpMessageConverters((HttpMessageConverter<?>) fastConvert);
    }
}
