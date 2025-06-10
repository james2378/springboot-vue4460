package com.dao;

import com.entity.HuiyishijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyishijianVO;
import com.entity.view.HuiyishijianView;


/**
 * 会议时间
 * 
 * @author 
 * @email 
 * @date 2021-04-22 20:39:47
 */
public interface HuiyishijianDao extends BaseMapper<HuiyishijianEntity> {
	
	List<HuiyishijianVO> selectListVO(@Param("ew") Wrapper<HuiyishijianEntity> wrapper);
	
	HuiyishijianVO selectVO(@Param("ew") Wrapper<HuiyishijianEntity> wrapper);
	
	List<HuiyishijianView> selectListView(@Param("ew") Wrapper<HuiyishijianEntity> wrapper);

	List<HuiyishijianView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyishijianEntity> wrapper);
	
	HuiyishijianView selectView(@Param("ew") Wrapper<HuiyishijianEntity> wrapper);
	
}
