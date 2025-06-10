package com.dao;

import com.entity.JilurenwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JilurenwuVO;
import com.entity.view.JilurenwuView;


/**
 * 记录任务
 * 
 * @author 
 * @email 
 * @date 2021-04-22 20:39:47
 */
public interface JilurenwuDao extends BaseMapper<JilurenwuEntity> {
	
	List<JilurenwuVO> selectListVO(@Param("ew") Wrapper<JilurenwuEntity> wrapper);
	
	JilurenwuVO selectVO(@Param("ew") Wrapper<JilurenwuEntity> wrapper);
	
	List<JilurenwuView> selectListView(@Param("ew") Wrapper<JilurenwuEntity> wrapper);

	List<JilurenwuView> selectListView(Pagination page,@Param("ew") Wrapper<JilurenwuEntity> wrapper);
	
	JilurenwuView selectView(@Param("ew") Wrapper<JilurenwuEntity> wrapper);
	
}
