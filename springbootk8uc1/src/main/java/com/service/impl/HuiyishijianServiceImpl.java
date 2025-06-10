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


import com.dao.HuiyishijianDao;
import com.entity.HuiyishijianEntity;
import com.service.HuiyishijianService;
import com.entity.vo.HuiyishijianVO;
import com.entity.view.HuiyishijianView;

@Service("huiyishijianService")
public class HuiyishijianServiceImpl extends ServiceImpl<HuiyishijianDao, HuiyishijianEntity> implements HuiyishijianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyishijianEntity> page = this.selectPage(
                new Query<HuiyishijianEntity>(params).getPage(),
                new EntityWrapper<HuiyishijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyishijianEntity> wrapper) {
		  Page<HuiyishijianView> page =new Query<HuiyishijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyishijianVO> selectListVO(Wrapper<HuiyishijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyishijianVO selectVO(Wrapper<HuiyishijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyishijianView> selectListView(Wrapper<HuiyishijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyishijianView selectView(Wrapper<HuiyishijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
