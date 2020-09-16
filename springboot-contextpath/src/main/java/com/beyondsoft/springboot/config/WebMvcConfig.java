package com.beyondsoft.springboot.config;

import com.beyondsoft.springboot.util.osinfo.OSinfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import sun.awt.OSInfo;

//方法一
/*@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/files/**").addResourceLocations("file:D:/upload/");
    }
}*/

//方法二
@Configuration
@PropertySource({"classpath:config.properties"})
public class WebMvcConfig implements WebMvcConfigurer {

    @Value("${file-path-windows}")
    private String file_path_windows;

    @Value("${file-path-linux}")
    private String file_path_linux;

    @Value("${file-path-macos}")
    private String file_path_macos;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String file_path;
        if (OSinfo.isLinux()) {
            file_path = file_path_linux;
        } else if (OSinfo.isWindows()) {
            file_path = file_path_windows;
        } else if (OSinfo.isMacOS() || OSinfo.isMacOSX()) {
            file_path = file_path_macos;
        } else {
            file_path = file_path_linux;
        }
        System.out.println("file:" + file_path);
        registry.addResourceHandler("/files/**").addResourceLocations("file:" + file_path);
    }
}
