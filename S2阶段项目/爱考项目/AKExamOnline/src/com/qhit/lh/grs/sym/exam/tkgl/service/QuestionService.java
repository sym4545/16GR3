/**
 * 
 */
package com.qhit.lh.grs.sym.exam.tkgl.service;

import java.util.List;
import java.util.Map;

import com.qhit.lh.grs.sym.exam.common.bean.PageBean;
import com.qhit.lh.grs.sym.exam.kmgl.bean.Course;
import com.qhit.lh.grs.sym.exam.tkgl.bean.WrittenQuestion;

/**
 * @author 
 * TODO
 * 2018骞�1鏈�2鏃ヤ笅鍗�?7:53:50
 */
public interface QuestionService {
	
	/**
	 * @param csId
	 * @param qtype
	 * @param degree
	 * 鑾峰彇璇曢闆嗗�?
	 * @return
	 */
	public List<WrittenQuestion> getQuestionsByType(int csId,String qtype,String degree);
	
	/**
	 * @param csId
	 * @param type
	 * @param degree
	 * @return
	 * 鑾峰彇璇曢鏁伴�?
	 */
	public int getQuestionsMax(int csId,String type,String degree);
	
	/**
	 * @param parameter
	 * @return
	 */
	public List<Course> getCourseInfo(Map parameter);
	
	/**
	 * @return
	 * 绗旇瘯棰樺垪琛ㄥ垎椤垫暟鎹�
	 */
	public PageBean<WrittenQuestion> getWrittenList(
			PageBean<WrittenQuestion> pageBean,
			Course course,
			int pageIndex);
	
	/**
	 * @param writtenQuestion
	 * 娣诲姞绗旇瘯棰�
	 */
	public void addWrittenQuestion(WrittenQuestion writtenQuestion);
	
	/**
	 * @param writtenQuestion
	 * @return
	 * 鏍规嵁ID鏌ヨ璇曢
	 */
	public WrittenQuestion getWrittenQuestionById(WrittenQuestion writtenQuestion);
	
	/**
	 * @param writtenQuestion
	 * 鏇存柊鏁版嵁
	 */
	public void updateWrittenQuestion(WrittenQuestion writtenQuestion);
	
	/**
	 * @param writtenQuestion
	 * 鎵归噺�?�煎叆璇曢
	 */
	public void inprotWrittenQuestion(List<WrittenQuestion> listwritten);
}
