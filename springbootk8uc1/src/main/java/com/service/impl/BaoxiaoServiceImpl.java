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


import com.dao.BaoxiaoDao;
import com.entity.BaoxiaoEntity;
import com.service.BaoxiaoService;
import com.entity.vo.BaoxiaoVO;
import com.entity.view.BaoxiaoView;

@Service("baoxiaoService")
public class BaoxiaoServiceImpl extends ServiceImpl<BaoxiaoDao, BaoxiaoEntity> implements BaoxiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaoxiaoEntity> page = this.selectPage(
                new Query<BaoxiaoEntity>(params).getPage(),
                new EntityWrapper<BaoxiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaoxiaoEntity> wrapper) {
		  Page<BaoxiaoView> page =new Query<BaoxiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaoxiaoVO> selectListVO(Wrapper<BaoxiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaoxiaoVO selectVO(Wrapper<BaoxiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaoxiaoView> selectListView(Wrapper<BaoxiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaoxiaoView selectView(Wrapper<BaoxiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
