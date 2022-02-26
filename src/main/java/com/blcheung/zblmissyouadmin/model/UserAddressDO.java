package com.blcheung.zblmissyouadmin.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.blcheung.zblmissyouadmin.model.BaseDO;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 *
 * </p>
 *
 * @author BLCheung
 * @since 2022-02-26
 */
@Getter
@Setter
@TableName("user_address")
public class UserAddressDO extends BaseDO {

    private static final long serialVersionUID = 1L;

    private Long userId;

    private String name;

    private String mobile;

    private String address;

    private String addressDetail;

    private Integer isDefault;

}
