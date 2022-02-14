package com.blcheung.zblmissyouadmin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.blcheung.zblmissyouadmin.dto.ActivityDTO;
import com.blcheung.zblmissyouadmin.dto.common.BasePagingDTO;
import com.blcheung.zblmissyouadmin.model.ActivityDO;
import com.blcheung.zblmissyouadmin.vo.ActivityVO;
import com.blcheung.zblmissyouadmin.vo.common.PagingVO;

import java.util.Optional;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author BLCheung
 * @since 2022-02-03
 */
public interface ActivityService extends IService<ActivityDO> {

    /**
     * 获取活动
     *
     * @param activityId
     * @return java.util.Optional<com.blcheung.zblmissyouadmin.model.ActivityDO>
     * @author BLCheung
     * @date 2022/2/4 7:49 下午
     */
    Optional<ActivityDO> getActivity(Long activityId);

    /**
     * 创建活动
     *
     * @param dto
     * @return com.blcheung.zblmissyouadmin.vo.ActivityVO
     * @author BLCheung
     * @date 2022/2/3 10:04 下午
     */
    ActivityVO createActivity(ActivityDTO dto);

    /**
     * 更新活动
     *
     * @param activityId
     * @param dto
     * @return com.blcheung.zblmissyouadmin.vo.ActivityVO
     * @author BLCheung
     * @date 2022/2/3 10:47 下午
     */
    ActivityVO updateActivity(Long activityId, ActivityDTO dto);

    /**
     * 删除活动
     *
     * @param activityId
     * @return java.lang.Boolean
     * @author BLCheung
     * @date 2022/2/4 8:23 下午
     */
    Boolean deleteActivity(Long activityId);

    /**
     * 获取活动分页
     *
     * @param dto
     * @return com.blcheung.zblmissyouadmin.vo.common.PagingVO<com.blcheung.zblmissyouadmin.vo.ActivityVO>
     * @author BLCheung
     * @date 2022/2/4 9:15 下午
     */
    PagingVO<ActivityVO> getActivityPage(BasePagingDTO dto);
}