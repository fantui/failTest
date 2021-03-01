-- 数据库初始化脚本

-- 创建数据库
create DATEBASE seckill2;

-- 使用数据库
use seckill2;
-- 创建秒杀库存表
create Table seckill(
`seckill_id` bigint NOT NULL AUTO_INCREMENT COMMIT '商品库存id',
`name` varchar(120) NOT NULL commit '商品名称',
`number` int NOT NULL commit '库存数量',
`start_time` timestamp NOT NULL commit '秒杀开启时间',
`end_time` timestamp NOT NULL commit '秒杀结束时间',
`create_time` timestamp NOT NULL DEFAULT current_timestamp commit '创建时间',
primary key ("seckill_id"),
key idx_start_time(start_time),
key idx_end_time(end_time),
key idx_create_time(create_time)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf-8 COMMIT ='秒杀库存表'

-- 初始化数据
insert into
    seckill(name,number ,start_time,end_time)
values
    ('1000元秒杀iphone6',100,'2015-11-01 00:00:00','2015-11-02 00:00:00'),
    ('500元秒杀iPad2',200,'2015-11-01 00:00:00','2015-11-02 00:00:00'),
    ('500元秒杀小米7',300,'2015-11-01 00:00:00','2015-11-02 00:00:00'),
    ('700元秒杀华为10',300,'2015-11-01 00:00:00','2015-11-02 00:00:00');

-- 秒杀成功明细表
-- 用户登录相关认证信息
create table  success_seckilled(
`seckilled_id` bitint NOT NULL commit '秒杀商品id',
`user_phone` bitint NOT NULL commit '用户手机号',
`state` tinyint NOT NULL DEFAULT -1 commit '状态显示 -1:无效 0:成功 1:已付款',
`create_time` timestamp NOT NULL commit '创建时间',
PRIMARY key ("seckilled_id","user_phone"),/*联合组件*/
key idx_create_time(create_time)
)ENGINE=InnoDB DEFAULT CHARSET = utf-8 COMMIT ='秒杀成功明细表';