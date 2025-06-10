package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyishijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyishijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyishijianView;


/**
 * 会议时间
 *
 * @author 
 * @email 
 * @date 2021-04-22 20:39:47
 */
public interface HuiyishijianService extends IService<HuiyishijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyishijianVO> selectListVO(Wrapper<HuiyishijianEntity> wrapper);
   	
   	HuiyishijianVO selectVO(@Param("ew") Wrapper<HuiyishijianEntity> wrapper);
   	
   	List<HuiyishijianView> selectListView(Wrapper<HuiyishijianEntity> wrapper);
   	
   	HuiyishijianView selectView(@Param("ew") Wrapper<HuiyishijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyishijianEntity> wrapper);
   	
}

