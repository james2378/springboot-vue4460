package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChuchaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChuchaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChuchaView;


/**
 * 出差
 *
 * @author 
 * @email 
 * @date 2021-04-22 20:39:47
 */
public interface ChuchaService extends IService<ChuchaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChuchaVO> selectListVO(Wrapper<ChuchaEntity> wrapper);
   	
   	ChuchaVO selectVO(@Param("ew") Wrapper<ChuchaEntity> wrapper);
   	
   	List<ChuchaView> selectListView(Wrapper<ChuchaEntity> wrapper);
   	
   	ChuchaView selectView(@Param("ew") Wrapper<ChuchaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChuchaEntity> wrapper);
   	
}

