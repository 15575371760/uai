package com.zh_ai.util;

import java.sql.Timestamp;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ͨ�÷�����
 * @author Administrator
 *
 */
public class Common{
	/**
	* ����ҳ�뷶Χ��ҳ�ķ���,�����ķ�ҳ
	* @param jspName Ҫ���з�ҳ��ҳ���ļ���
	 *@param currentpageNo ��ǰҳ
	* @param totalPage ��ҳ��
	* @param pageSize ���õ�ҳ��
	*/
	public static String getPageRange(String jspName,int currentpageNo,int totalPage,int pageSize)
	{
		//ҳ�����ʼҳ��
		int startPageNo=(currentpageNo-1)/pageSize*pageSize;
		//ҳ��Ľ���ҳ��
		int endPageNo=startPageNo+pageSize;
		StringBuffer buf=new StringBuffer();
		buf.append("<div class=\"pagelist\"><div class=\"pages\">");
		buf.append("<p>["+currentpageNo+"/"+totalPage+"] ");//��ǰҳ�뼰��ҳ��
		if(currentpageNo<=1){
			buf.append("<a class=\"page_btn page_prv\">��һҳ</a>");//��һҳ��ҳ
		}else{
			buf.append("<a class=\"page_btn page_prv\" onclick='fenye("+(currentpageNo-1)+")'>��һҳ</a>");//��һҳ��ҳ
		}
		if(startPageNo>0){//�����ʾ��ҳ�������ǵ�һ����ÿ����ʾ��������pageSize  ����ʾ�л���һ���İ�ť
			buf.append("<a onclick='fenye("+(startPageNo-pageSize+1)+")'>[<<<]</a>");
			if(totalPage>=pageSize){//��ҳ������ҳ����ʾ��ʱ
				if(totalPage>=endPageNo){ //�����ҳ������ÿ�������һҳʱ
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
			}else{//������ʾ��ǰѭ����ҳ��
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
			buf.append("<a onclick='fenye("+(endPageNo+1)+")'>[>>>]</a>");//����һ����ʾ��ҳ����
		
		}
		if(currentpageNo>=totalPage){
			buf.append("<a class=\"page_btn page_next\">��һҳ</a>");//��һҳ��ҳ
		}else{
			buf.append("<a class=\"page_btn page_next\" onclick='fenye("+(currentpageNo+1)+")'>��һҳ</a>");//��һҳ��ҳ
		}
		return buf.toString();
	}
	/**
	 * ���ַ���ת��Ϊʱ�������
	 * @param dates  ���������ַ�������
	 * @return  ����ʱ�����ʽ
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
