import com.emall.mapper.*;
import com.emall.pojo.*;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;



public class Mytest {


    @Test
    public void test(){

        Logger logger = LoggerFactory.getLogger(Mytest.class);

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
        TbItemMapper bean = applicationContext.getBean(TbItemMapper.class);
        List<TbItem> querybyid = bean.selectAll();

        for (TbItem tbItem : querybyid) {
//            logger.info("===========info============================================");
            System.out.println(tbItem);
        }
//        List<TbItem> tbItems = bean.selectByPrimaryKey((long) 1);
//        for (TbItem tbItem : tbItems) {
//            System.out.println(tbItem);
//        }
        System.out.println("=================");
        List<TbItem> tbItems1 = bean.selectItemByCondition("%坚果%");
        for (TbItem tbItem : tbItems1) {
            System.out.println(tbItem);
        }

    }

    @Test
    public void test2() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
        TbItemMapper bean = applicationContext.getBean(TbItemMapper.class);
        TbItem tbItem = new TbItem();
        tbItem.setId((long) 123456);
        int insert = bean.insert(tbItem);

        if(insert!=1) throw new Exception("插入失败");
    }

    @Test
    public void test3() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
        TbItemMapper bean = applicationContext.getBean(TbItemMapper.class);

        int delete = bean.deleteByPrimaryKey((long) 123456);

        if(delete!=1) throw new Exception("删除失败");
    }

    @Test
    public void test4() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
        TbItemTypeMapper bean = applicationContext.getBean(TbItemTypeMapper.class);

        TbItemType tbItemType = new TbItemType();
        tbItemType.setId((long) 123456);
        tbItemType.setParentID((long) 2);
//        int insert=bean.insert(tbItemType);
//        if(insert!=1) throw new Exception("添加失败");
        List<TbItemType> tb = bean.selectByPrimaryKey(123456);
        for (TbItemType itemType : tb) {
            System.out.println(itemType);
        }
        int delete = bean.deleteByPrimaryKey((long) 123456);

        if(delete!=1) throw new Exception("删除失败");
    }

    @Test
    public void testTbOrderItemMapper() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
        TbOrderItemMapper bean = applicationContext.getBean(TbOrderItemMapper.class);

//        TbOrderItem TbOrderItem = new TbOrderItem();
//        TbOrderItem.setId("123456");
//        TbOrderItem.setItemId((long) 562379);
//        TbOrderItem.setOrderId("150787555927616");
//        int insert = bean.insert(TbOrderItem);
//        if (insert != 1) throw new Exception("添加失败");
        int delete = bean.deleteByPrimaryKey("123456");

        if(delete!=1) throw new Exception("删除失败");


        List<TbOrderItem> tb = bean.selectByPrimaryKey("123456");
        for (TbOrderItem itemType : tb) {
            System.out.println(itemType);
        }
    }

    @Test
    public void testTbOrderMapper() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
        TbOrderMapper bean = applicationContext.getBean(TbOrderMapper.class);

//        TbOrder  TbOrder = new  TbOrder();
//        TbOrder.setOrderId("123456");
//        TbOrder.setUserId((long) 2);
//        int insert = bean.insert( TbOrder);
//        if (insert != 1) throw new Exception("添加失败");


        int delete = bean.deleteByPrimaryKey("123456");

        if(delete!=1) throw new Exception("删除失败");

        List<TbOrder> tb = bean.selectByPrimaryKey("123456");
        for (TbOrder itemType : tb) {
            System.out.println(itemType);
        }
    }

    @Test
    public void testTbPayinfoMapper() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
        TbPayinfoMapper bean = applicationContext.getBean(TbPayinfoMapper.class);

//        TbPayinfo  TbPayinfo = new  TbPayinfo();
//        TbPayinfo.setId("123456");
//        TbPayinfo.setOrderId("123456");
//        TbPayinfo.setUserId((long) 2);
//        int insert = bean.insert( TbPayinfo);
//        if (insert != 1) throw new Exception("添加失败");


        int delete = bean.deleteByPrimaryKey("123456");

        if(delete!=1) throw new Exception("删除失败");

        List<TbPayinfo> tb = bean.selectByPrimaryKey("123456");
        for (TbPayinfo itemType : tb) {
            System.out.println(itemType);
        }
    }

    @Test
    public void testTbShippingMapper() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
        TbShippingMapper bean = applicationContext.getBean(TbShippingMapper.class);

//        TbShipping  TbShipping = new  TbShipping();
//        TbShipping.setId("123456");
//        TbShipping.setOrderId("123456");
//        TbShipping.setUserId((long) 2);
//        int insert = bean.insert( TbShipping);
//        if (insert != 1) throw new Exception("添加失败");


        int delete = bean.deleteByPrimaryKey("123456");

        if(delete!=1) throw new Exception("删除失败");

        List<TbShipping> tb = bean.selectByPrimaryKey("123456");
        for (TbShipping itemType : tb) {
            System.out.println(itemType);
        }
    }

    @Test
    public void testTbUserMapper() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
        TbUserMapper bean = applicationContext.getBean(TbUserMapper.class);

//        TbUser   TbUser = new   TbUser();
//        TbUser.setId((long) 123456);
//        TbUser.setUsername("ljy3");
//        TbUser.setPassword("123456");
//        TbUser.setPhone("123456789");
//
//        int insert = bean.insert(  TbUser);
//        if (insert != 1) throw new Exception("添加失败");
//

        int delete = bean.deleteByPrimaryKey((long) 123456);

        if(delete!=1) throw new Exception("删除失败");

        List< TbUser> tb = bean.selectByPrimaryKey((long) 123456);
        for ( TbUser itemType : tb) {
            System.out.println(itemType);
        }
    }
}
