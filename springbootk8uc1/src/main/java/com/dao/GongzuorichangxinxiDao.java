package com.dao;

import com.entity.GongzuorichangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongzuorichangxinxiVO;
import com.entity.view.GongzuorichangxinxiView;


/**
 * 工作日常信息
 * 
 * @author 
 * @email 
 * @date 2021-04-22 20:39:47
 */
public interface GongzuorichangxinxiDao extends BaseMapper<GongzuorichangxinxiEntity> {
	
	List<GongzuorichangxinxiVO> selectListVO(@Param("ew") Wrapper<GongzuorichangxinxiEntity> wrapper);
	
	GongzuorichangxinxiVO selectVO(@Param("ew") Wrapper<GongzuorichangxinxiEntity> wrapper);
	
	List<GongzuorichangxinxiView> selectListView(@Param("ew") Wrapper<GongzuorichangxinxiEntity> wrapper);

	List<GongzuorichangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GongzuorichangxinxiEntity> wrapper);
	
	GongzuorichangxinxiView selectView(@Param("ew") Wrapper<GongzuorichangxinxiEntity> wrapper);
	
}
