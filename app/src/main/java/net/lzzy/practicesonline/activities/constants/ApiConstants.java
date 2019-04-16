package net.lzzy.practicesonline.activities.constants;

import net.lzzy.practicesonline.activities.utils.AppUtils;

/**
 * Created by lzzy_gxy on 2019/4/15.
 * Description:
 */
public class ApiConstants {
   // "http://10.88.91.102:8888"
    private static final String IP= AppUtils.loadSeverSetting(AppUtils.getContext()).first;
    private static final String PORT=AppUtils.loadSeverSetting(AppUtils.getContext()).second;
    private static final String PROTOCOL="http://";
    /**
     * API地址
     */
    public static final String URL_API=PROTOCOL.concat(IP).concat(":").concat(PORT);

}