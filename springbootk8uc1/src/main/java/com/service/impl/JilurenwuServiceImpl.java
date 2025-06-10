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


import com.dao.JilurenwuDao;
import com.entity.JilurenwuEntity;
import com.service.JilurenwuService;
import com.entity.vo.JilurenwuVO;
import com.entity.view.JilurenwuView;

@Service("jilurenwuService")
public class JilurenwuServiceImpl extends ServiceImpl<JilurenwuDao, JilurenwuEntity> implements JilurenwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JilurenwuEntity> page = this.selectPage(
                new Query<JilurenwuEntity>(params).getPage(),
                new EntityWrapper<JilurenwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JilurenwuEntity> wrapper) {
		  Page<JilurenwuView> page =new Query<JilurenwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JilurenwuVO> selectListVO(Wrapper<JilurenwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JilurenwuVO selectVO(Wrapper<JilurenwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JilurenwuView> selectListView(Wrapper<JilurenwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JilurenwuView selectView(Wrapper<JilurenwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
