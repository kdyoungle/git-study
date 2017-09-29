package org.seckill.dao;

import org.seckill.entity.SuccessKilled;

/**
 * Created by ad-young on 2017/8/24.
 */
public interface SuccessKilledDao {

    /**
     * 插入购买明细，使用联合主键可以过滤重复
     * @param seckillId
     * @param userPhone
     * @return
     */
    int insertSuccessKilled(long seckillId,long userPhone);

    /**
     * 根据id查询SuccessKilled并携带秒杀产品对象实体
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(long seckillId);

}
