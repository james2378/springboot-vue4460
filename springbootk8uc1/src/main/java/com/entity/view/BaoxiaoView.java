package com.entity.view;

import com.entity.BaoxiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 报销
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-22 20:39:47
 */
@TableName("baoxiao")
public class BaoxiaoView  extends BaoxiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaoxiaoView(){
	}
 
 	public BaoxiaoView(BaoxiaoEntity baoxiaoEntity){
 	try {
			BeanUtils.copyProperties(this, baoxiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
