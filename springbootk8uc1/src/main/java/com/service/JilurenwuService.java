package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JilurenwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JilurenwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JilurenwuView;


/**
 * 记录任务
 *
 * @author 
 * @email 
 * @date 2021-04-22 20:39:47
 */
public interface JilurenwuService extends IService<JilurenwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JilurenwuVO> selectListVO(Wrapper<JilurenwuEntity> wrapper);
   	
   	JilurenwuVO selectVO(@Param("ew") Wrapper<JilurenwuEntity> wrapper);
   	
   	List<JilurenwuView> selectListView(Wrapper<JilurenwuEntity> wrapper);
   	
   	JilurenwuView selectView(@Param("ew") Wrapper<JilurenwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JilurenwuEntity> wrapper);
   	
}

