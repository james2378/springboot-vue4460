package com.entity.view;

import com.entity.HuiyishijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 会议时间
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-22 20:39:47
 */
@TableName("huiyishijian")
public class HuiyishijianView  extends HuiyishijianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuiyishijianView(){
	}
 
 	public HuiyishijianView(HuiyishijianEntity huiyishijianEntity){
 	try {
			BeanUtils.copyProperties(this, huiyishijianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
