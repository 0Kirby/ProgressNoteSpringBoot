package cn.zerokirby.note.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private boolean isValid;// 账号是否有效
    private int userId;// 用户id
    private String username;// 用户名
    private String password;// 密码
    private String language;// 语言
    private String version;// 版本
    private String display;// 显示信息
    private String model;// 型号
    private String brand;// 品牌
    private long registerTime; // 注册时间
    private long lastUse; // 上次使用时间
    private long lastSync; // 上次同步时间

}
