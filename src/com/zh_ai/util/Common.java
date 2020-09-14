package com.zh_ai.util;

import java.sql.Timestamp;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 通用方法类
 * @author Administrator
 *
 */
public class Common{
	/**
	* 按照页码范围分页的方法,订单的分页
	* @param jspName 要进行分页的页面文件名
	 *@param currentpageNo 当前页
	* @param totalPage 总页数
	* @param pageSize 放置的页数
	*/
	public static String getPageRange(String jspName,int currentpageNo,int totalPage,int pageSize)
	{
		//页面的起始页数
		int startPageNo=(currentpageNo-1)/pageSize*pageSize;
		//页面的结束页数
		int endPageNo=startPageNo+pageSize;
		StringBuffer buf=new StringBuffer();
		buf.append("<div class=\"pagelist\"><div class=\"pages\">");
		buf.append("<p>["+currentpageNo+"/"+totalPage+"] ");//当前页码及总页数
		if(currentpageNo<=1){
			buf.append("<a class=\"page_btn page_prv\">上一页</a>");//上一页翻页
		}else{
			buf.append("<a class=\"page_btn page_prv\" onclick='fenye("+(currentpageNo-1)+")'>上一页</a>");//上一页翻页
		}
		if(startPageNo>0){//如果显示的页面数不是第一批，每批显示的数量：pageSize  则显示切换上一批的按钮
			buf.append("<a onclick='fenye("+(startPageNo-pageSize+1)+")'>[<<<]</a>");
			if(totalPage>=pageSize){//总页数大于页面显示数时
				if(totalPage>=endPageNo){ //如果总页数大于每批是最后一页时
					for (int i = 1; i <= pageSize; ++i){
						if((startPageNo+i)==currentpageNo){
							buf.append("<a class=\"page_ye page_current\" onclick='fenye("+(startPageNo+i)+")'>"+(startPageNo+i)+"</a>");
						}else{
							buf.append("<a class=\"page_ye\" onclick='fenye("+(startPageNo+i)+")'>"+(startPageNo+i)+"</a>");
						}
					}
				}else{
					for (int i = 1; i <=totalPage-startPageNo; ++i){
						if((startPageNo+i)==currentpageNo){
							buf.append("<a class=\"page_ye page_current\" onclick='fenye("+(startPageNo+i)+")'>"+(startPageNo+i)+"</a>");
						}else{
							buf.append("<a class=\"page_ye\" onclick='fenye("+(startPageNo+i)+")'>"+(startPageNo+i)+"</a>");
						}
						
					}
	      		}
			}else{//否则显示当前循环的页码
				for(int i=1;i<=totalPage;++i){
					if((startPageNo+i)==currentpageNo){
						buf.append("<a class=\"page_ye page_current\" onclick='fenye("+(startPageNo+i)+")'>"+(startPageNo+i)+"</a>");
					}else{
						buf.append("<a class=\"page_ye\" onclick='fenye("+(startPageNo+i)+")'>"+(startPageNo+i)+"</a>");
					}
				}
			}
			
		}
		if(endPageNo!=totalPage&&endPageNo<totalPage){
			buf.append("<a onclick='fenye("+(endPageNo+1)+")'>[>>>]</a>");//换下一批显示的页面数
		
		}
		if(currentpageNo>=totalPage){
			buf.append("<a class=\"page_btn page_next\">下一页</a>");//下一页翻页
		}else{
			buf.append("<a class=\"page_btn page_next\" onclick='fenye("+(currentpageNo+1)+")'>下一页</a>");//下一页翻页
		}
		return buf.toString();
	}
	/**
	 * 将字符串转换为时间戳方法
	 * @param dates  传过来的字符串日期
	 * @return  返回时间戳格式
	 */
	public static Timestamp getTS(String dates){
		Format f = new SimpleDateFormat("yyyy-MM-dd");
		Timestamp ts = null;
		Date d;
		try {
			d = (Date) f.parseObject(dates);
			ts= new Timestamp(d.getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return ts;
		
		
		

	}
}
