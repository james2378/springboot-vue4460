package com.dao;

import com.entity.ChuchaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChuchaVO;
import com.entity.view.ChuchaView;


/**
 * 出差
 * 
 * @author 
 * @email 
 * @date 2021-04-22 20:39:47
 */
public interface ChuchaDao extends BaseMapper<ChuchaEntity> {
	
	List<ChuchaVO> selectListVO(@Param("ew") Wrapper<ChuchaEntity> wrapper);
	
	ChuchaVO selectVO(@Param("ew") Wrapper<ChuchaEntity> wrapper);
	
	List<ChuchaView> selectListView(@Param("ew") Wrapper<ChuchaEntity> wrapper);

	List<ChuchaView> selectListView(Pagination page,@Param("ew") Wrapper<ChuchaEntity> wrapper);
	
	ChuchaView selectView(@Param("ew") Wrapper<ChuchaEntity> wrapper);
	
}
