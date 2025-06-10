package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChuqinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChuqinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChuqinView;


/**
 * 出勤
 *
 * @author 
 * @email 
 * @date 2021-04-22 20:39:47
 */
public interface ChuqinService extends IService<ChuqinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChuqinVO> selectListVO(Wrapper<ChuqinEntity> wrapper);
   	
   	ChuqinVO selectVO(@Param("ew") Wrapper<ChuqinEntity> wrapper);
   	
   	List<ChuqinView> selectListView(Wrapper<ChuqinEntity> wrapper);
   	
   	ChuqinView selectView(@Param("ew") Wrapper<ChuqinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChuqinEntity> wrapper);
   	
}

