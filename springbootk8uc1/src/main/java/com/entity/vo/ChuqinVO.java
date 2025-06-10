package com.entity.vo;

import com.entity.ChuqinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 出勤
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-22 20:39:47
 */
public class ChuqinVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 日期
	 */
	
	private String riqi;
		
	/**
	 * 出勤表
	 */
	
	private String chuqinbiao;
		
	/**
	 * 出勤人数
	 */
	
	private Integer chuqinrenshu;
		
	/**
	 * 缺勤人数
	 */
	
	private Integer queqinrenshu;
		
	/**
	 * 迟到人数
	 */
	
	private Integer chidaorenshu;
		
	/**
	 * 请假人数
	 */
	
	private Integer qingjiarenshu;
		
	/**
	 * 经理账号
	 */
	
	private String jinglizhanghao;
		
	/**
	 * 经理姓名
	 */
	
	private String jinglixingming;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：日期
	 */
	 
	public void setRiqi(String riqi) {
		this.riqi = riqi;
	}
	
	/**
	 * 获取：日期
	 */
	public String getRiqi() {
		return riqi;
	}
				
	
	/**
	 * 设置：出勤表
	 */
	 
	public void setChuqinbiao(String chuqinbiao) {
		this.chuqinbiao = chuqinbiao;
	}
	
	/**
	 * 获取：出勤表
	 */
	public String getChuqinbiao() {
		return chuqinbiao;
	}
				
	
	/**
	 * 设置：出勤人数
	 */
	 
	public void setChuqinrenshu(Integer chuqinrenshu) {
		this.chuqinrenshu = chuqinrenshu;
	}
	
	/**
	 * 获取：出勤人数
	 */
	public Integer getChuqinrenshu() {
		return chuqinrenshu;
	}
				
	
	/**
	 * 设置：缺勤人数
	 */
	 
	public void setQueqinrenshu(Integer queqinrenshu) {
		this.queqinrenshu = queqinrenshu;
	}
	
	/**
	 * 获取：缺勤人数
	 */
	public Integer getQueqinrenshu() {
		return queqinrenshu;
	}
				
	
	/**
	 * 设置：迟到人数
	 */
	 
	public void setChidaorenshu(Integer chidaorenshu) {
		this.chidaorenshu = chidaorenshu;
	}
	
	/**
	 * 获取：迟到人数
	 */
	public Integer getChidaorenshu() {
		return chidaorenshu;
	}
				
	
	/**
	 * 设置：请假人数
	 */
	 
	public void setQingjiarenshu(Integer qingjiarenshu) {
		this.qingjiarenshu = qingjiarenshu;
	}
	
	/**
	 * 获取：请假人数
	 */
	public Integer getQingjiarenshu() {
		return qingjiarenshu;
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
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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
