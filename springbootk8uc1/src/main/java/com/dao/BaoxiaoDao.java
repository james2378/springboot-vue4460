package com.dao;

import com.entity.BaoxiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaoxiaoVO;
import com.entity.view.BaoxiaoView;


/**
 * 报销
 * 
 * @author 
 * @email 
 * @date 2021-04-22 20:39:47
 */
public interface BaoxiaoDao extends BaseMapper<BaoxiaoEntity> {
	
	List<BaoxiaoVO> selectListVO(@Param("ew") Wrapper<BaoxiaoEntity> wrapper);
	
	BaoxiaoVO selectVO(@Param("ew") Wrapper<BaoxiaoEntity> wrapper);
	
	List<BaoxiaoView> selectListView(@Param("ew") Wrapper<BaoxiaoEntity> wrapper);

	List<BaoxiaoView> selectListView(Pagination page,@Param("ew") Wrapper<BaoxiaoEntity> wrapper);
	
	BaoxiaoView selectView(@Param("ew") Wrapper<BaoxiaoEntity> wrapper);
	
}
