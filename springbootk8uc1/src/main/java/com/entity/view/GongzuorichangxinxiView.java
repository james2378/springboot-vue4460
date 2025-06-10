package com.entity.view;

import com.entity.GongzuorichangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 工作日常信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-22 20:39:47
 */
@TableName("gongzuorichangxinxi")
public class GongzuorichangxinxiView  extends GongzuorichangxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongzuorichangxinxiView(){
	}
 
 	public GongzuorichangxinxiView(GongzuorichangxinxiEntity gongzuorichangxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, gongzuorichangxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
