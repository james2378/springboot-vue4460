package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.GongzuorichangxinxiEntity;
import com.entity.view.GongzuorichangxinxiView;

import com.service.GongzuorichangxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 工作日常信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-22 20:39:47
 */
@RestController
@RequestMapping("/gongzuorichangxinxi")
public class GongzuorichangxinxiController {
    @Autowired
    private GongzuorichangxinxiService gongzuorichangxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GongzuorichangxinxiEntity gongzuorichangxinxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			gongzuorichangxinxi.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<GongzuorichangxinxiEntity> ew = new EntityWrapper<GongzuorichangxinxiEntity>();
		PageUtils page = gongzuorichangxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gongzuorichangxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GongzuorichangxinxiEntity gongzuorichangxinxi, 
		HttpServletRequest request){
        EntityWrapper<GongzuorichangxinxiEntity> ew = new EntityWrapper<GongzuorichangxinxiEntity>();
		PageUtils page = gongzuorichangxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gongzuorichangxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GongzuorichangxinxiEntity gongzuorichangxinxi){
       	EntityWrapper<GongzuorichangxinxiEntity> ew = new EntityWrapper<GongzuorichangxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( gongzuorichangxinxi, "gongzuorichangxinxi")); 
        return R.ok().put("data", gongzuorichangxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GongzuorichangxinxiEntity gongzuorichangxinxi){
        EntityWrapper< GongzuorichangxinxiEntity> ew = new EntityWrapper< GongzuorichangxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( gongzuorichangxinxi, "gongzuorichangxinxi")); 
		GongzuorichangxinxiView gongzuorichangxinxiView =  gongzuorichangxinxiService.selectView(ew);
		return R.ok("查询工作日常信息成功").put("data", gongzuorichangxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GongzuorichangxinxiEntity gongzuorichangxinxi = gongzuorichangxinxiService.selectById(id);
        return R.ok().put("data", gongzuorichangxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GongzuorichangxinxiEntity gongzuorichangxinxi = gongzuorichangxinxiService.selectById(id);
        return R.ok().put("data", gongzuorichangxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GongzuorichangxinxiEntity gongzuorichangxinxi, HttpServletRequest request){
    	gongzuorichangxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gongzuorichangxinxi);
        gongzuorichangxinxiService.insert(gongzuorichangxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GongzuorichangxinxiEntity gongzuorichangxinxi, HttpServletRequest request){
    	gongzuorichangxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gongzuorichangxinxi);
        gongzuorichangxinxiService.insert(gongzuorichangxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody GongzuorichangxinxiEntity gongzuorichangxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(gongzuorichangxinxi);
        gongzuorichangxinxiService.updateById(gongzuorichangxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        gongzuorichangxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<GongzuorichangxinxiEntity> wrapper = new EntityWrapper<GongzuorichangxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = gongzuorichangxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
