package com.ssrs.platform;

import com.ssrs.framework.extend.plugin.AbstractPlugin;
import com.ssrs.framework.extend.plugin.PluginException;
import com.ssrs.platform.extend.CodeService;
import com.ssrs.platform.util.PlatformUtil;

public class PlatformPlugin extends AbstractPlugin {

    @Override
    public void start() throws PluginException {
        // 加载数据库中的配置项
        PlatformUtil.loadDBConfig();
        // 加载数据库定时任务
        PlatformUtil.loadDBSchedule();
    }

    @Override
    public void stop() throws PluginException {

    }
}
