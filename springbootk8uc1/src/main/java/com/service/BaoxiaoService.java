package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaoxiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaoxiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaoxiaoView;


/**
 * 报销
 *
 * @author 
 * @email 
 * @date 2021-04-22 20:39:47
 */
public interface BaoxiaoService extends IService<BaoxiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaoxiaoVO> selectListVO(Wrapper<BaoxiaoEntity> wrapper);
   	
   	BaoxiaoVO selectVO(@Param("ew") Wrapper<BaoxiaoEntity> wrapper);
   	
   	List<BaoxiaoView> selectListView(Wrapper<BaoxiaoEntity> wrapper);
   	
   	BaoxiaoView selectView(@Param("ew") Wrapper<BaoxiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaoxiaoEntity> wrapper);
   	
}

