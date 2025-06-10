package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongzuorichangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongzuorichangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongzuorichangxinxiView;


/**
 * 工作日常信息
 *
 * @author 
 * @email 
 * @date 2021-04-22 20:39:47
 */
public interface GongzuorichangxinxiService extends IService<GongzuorichangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongzuorichangxinxiVO> selectListVO(Wrapper<GongzuorichangxinxiEntity> wrapper);
   	
   	GongzuorichangxinxiVO selectVO(@Param("ew") Wrapper<GongzuorichangxinxiEntity> wrapper);
   	
   	List<GongzuorichangxinxiView> selectListView(Wrapper<GongzuorichangxinxiEntity> wrapper);
   	
   	GongzuorichangxinxiView selectView(@Param("ew") Wrapper<GongzuorichangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongzuorichangxinxiEntity> wrapper);
   	
}

