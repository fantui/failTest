package org.seckill.dao;

import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

public interface SeckillDao {

    /**
     * 减库存
     * @author taosijie 
     * @param seckillId 
     * @param killTime
     * @return 如果影响行数>1, 表示更新的记录行数
     * @date 2021/3/1 15:53
     */
    int reduceNumber(long seckillId, Date killTime);

    /**
     * 根据id查询秒杀对象
     * @author taosijie 
     * @param seckillId 
     * @return org.seckill.entity.Seckill
     * @date 2021/3/1 15:53
     */
    Seckill queryById(long seckillId);

    /**
     * 根据偏移量查询秒杀商品列表
     * @author taosijie
     * @param offet
     * @param limit
     * @return java.util.List<org.seckill.entity.Seckill>
     * @date 2021/3/1 15:54
     */
    List<Seckill> queryAll(int offet,int limit);
}
