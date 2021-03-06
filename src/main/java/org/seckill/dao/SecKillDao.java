package org.seckill.dao;


import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

public interface SecKillDao {
   int reduceNumber(@Param("seckillId") long seckillId,@Param("killTime") Date killTime);
   Seckill queryById(long seckillId);
   List<Seckill> queryAll(@Param("offset") int offset,@Param("limit") int limit);
   void killByProcedure(Map<String,Object> paramMap);
}
