package com.dao;

import com.entity.ChuqinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChuqinVO;
import com.entity.view.ChuqinView;


/**
 * 出勤
 * 
 * @author 
 * @email 
 * @date 2021-04-22 20:39:47
 */
public interface ChuqinDao extends BaseMapper<ChuqinEntity> {
	
	List<ChuqinVO> selectListVO(@Param("ew") Wrapper<ChuqinEntity> wrapper);
	
	ChuqinVO selectVO(@Param("ew") Wrapper<ChuqinEntity> wrapper);
	
	List<ChuqinView> selectListView(@Param("ew") Wrapper<ChuqinEntity> wrapper);

	List<ChuqinView> selectListView(Pagination page,@Param("ew") Wrapper<ChuqinEntity> wrapper);
	
	ChuqinView selectView(@Param("ew") Wrapper<ChuqinEntity> wrapper);
	
}
