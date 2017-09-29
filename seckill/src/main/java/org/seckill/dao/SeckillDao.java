package org.seckill.dao;

import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * Created by ad-young on 2017/8/24.
 */
public interface SeckillDao {

    /**
     * 减库存
     * @param seckillId
     * @param createTime
     * @return
     */
    int reduceNumber(long seckillId, Date createTime);

    /**
     * 根据id查询秒杀对象
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * 根据偏移量查询秒杀商品列表
     * @param offet
     * @param limit
     * @return
     */
    List<Seckill> queryAll(int offet,int limit);




}
