package org.seckill.dao;

import org.seckill.entity.SuccessKilled;

public interface SuccessKilledDao {
    
    /**
     * 插入购买明细,可过滤重复
     * @author taosijie 
     * @param seckillId 
     * @param userPhone
     * @return int
     * @date 2021/3/1 15:56
     */
    int insertSuccessKilled(long seckillId,long userPhone);

    /**
     * 根据id查询SuccessKilled并携带秒杀产品对象实体
     * @author taosijie 
     * @param seckillId 
     * @return org.seckill.entity.SuccessKilled
     * @date 2021/3/1 16:02
     */
    SuccessKilled queryByIdWithSeckill(long seckillId);
}
