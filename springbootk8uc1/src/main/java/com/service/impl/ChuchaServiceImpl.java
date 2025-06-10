package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChuchaDao;
import com.entity.ChuchaEntity;
import com.service.ChuchaService;
import com.entity.vo.ChuchaVO;
import com.entity.view.ChuchaView;

@Service("chuchaService")
public class ChuchaServiceImpl extends ServiceImpl<ChuchaDao, ChuchaEntity> implements ChuchaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChuchaEntity> page = this.selectPage(
                new Query<ChuchaEntity>(params).getPage(),
                new EntityWrapper<ChuchaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChuchaEntity> wrapper) {
		  Page<ChuchaView> page =new Query<ChuchaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChuchaVO> selectListVO(Wrapper<ChuchaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChuchaVO selectVO(Wrapper<ChuchaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChuchaView> selectListView(Wrapper<ChuchaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChuchaView selectView(Wrapper<ChuchaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
