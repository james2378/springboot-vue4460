package com.entity.vo;

import com.entity.ChuchaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 出差
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-22 20:39:47
 */
public class ChuchaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 出差时间
	 */
	
	private String chuchashijian;
		
	/**
	 * 出差安排
	 */
	
	private String chuchaanpai;
		
	/**
	 * 出差地点
	 */
	
	private String chuchadidian;
		
	/**
	 * 提交时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tijiaoshijian;
		
	/**
	 * 经理账号
	 */
	
	private String jinglizhanghao;
		
	/**
	 * 经理姓名
	 */
	
	private String jinglixingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：出差时间
	 */
	 
	public void setChuchashijian(String chuchashijian) {
		this.chuchashijian = chuchashijian;
	}
	
	/**
	 * 获取：出差时间
	 */
	public String getChuchashijian() {
		return chuchashijian;
	}
				
	
	/**
	 * 设置：出差安排
	 */
	 
	public void setChuchaanpai(String chuchaanpai) {
		this.chuchaanpai = chuchaanpai;
	}
	
	/**
	 * 获取：出差安排
	 */
	public String getChuchaanpai() {
		return chuchaanpai;
	}
				
	
	/**
	 * 设置：出差地点
	 */
	 
	public void setChuchadidian(String chuchadidian) {
		this.chuchadidian = chuchadidian;
	}
	
	/**
	 * 获取：出差地点
	 */
	public String getChuchadidian() {
		return chuchadidian;
	}
				
	
	/**
	 * 设置：提交时间
	 */
	 
	public void setTijiaoshijian(Date tijiaoshijian) {
		this.tijiaoshijian = tijiaoshijian;
	}
	
	/**
	 * 获取：提交时间
	 */
	public Date getTijiaoshijian() {
		return tijiaoshijian;
	}
				
	
	/**
	 * 设置：经理账号
	 */
	 
	public void setJinglizhanghao(String jinglizhanghao) {
		this.jinglizhanghao = jinglizhanghao;
	}
	
	/**
	 * 获取：经理账号
	 */
	public String getJinglizhanghao() {
		return jinglizhanghao;
	}
				
	
	/**
	 * 设置：经理姓名
	 */
	 
	public void setJinglixingming(String jinglixingming) {
		this.jinglixingming = jinglixingming;
	}
	
	/**
	 * 获取：经理姓名
	 */
	public String getJinglixingming() {
		return jinglixingming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
