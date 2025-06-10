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


import com.dao.ChuqinDao;
import com.entity.ChuqinEntity;
import com.service.ChuqinService;
import com.entity.vo.ChuqinVO;
import com.entity.view.ChuqinView;

@Service("chuqinService")
public class ChuqinServiceImpl extends ServiceImpl<ChuqinDao, ChuqinEntity> implements ChuqinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChuqinEntity> page = this.selectPage(
                new Query<ChuqinEntity>(params).getPage(),
                new EntityWrapper<ChuqinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChuqinEntity> wrapper) {
		  Page<ChuqinView> page =new Query<ChuqinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChuqinVO> selectListVO(Wrapper<ChuqinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChuqinVO selectVO(Wrapper<ChuqinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChuqinView> selectListView(Wrapper<ChuqinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChuqinView selectView(Wrapper<ChuqinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
