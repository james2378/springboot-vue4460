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


import com.dao.GongzuorichangxinxiDao;
import com.entity.GongzuorichangxinxiEntity;
import com.service.GongzuorichangxinxiService;
import com.entity.vo.GongzuorichangxinxiVO;
import com.entity.view.GongzuorichangxinxiView;

@Service("gongzuorichangxinxiService")
public class GongzuorichangxinxiServiceImpl extends ServiceImpl<GongzuorichangxinxiDao, GongzuorichangxinxiEntity> implements GongzuorichangxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongzuorichangxinxiEntity> page = this.selectPage(
                new Query<GongzuorichangxinxiEntity>(params).getPage(),
                new EntityWrapper<GongzuorichangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongzuorichangxinxiEntity> wrapper) {
		  Page<GongzuorichangxinxiView> page =new Query<GongzuorichangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongzuorichangxinxiVO> selectListVO(Wrapper<GongzuorichangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongzuorichangxinxiVO selectVO(Wrapper<GongzuorichangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongzuorichangxinxiView> selectListView(Wrapper<GongzuorichangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongzuorichangxinxiView selectView(Wrapper<GongzuorichangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
