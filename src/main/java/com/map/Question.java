package com.map;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;

@Entity
public class Question {
	
	@Id
	@Column(name="question_id")
	private int questionid;
	private String question;
	
//	@OneToOne
//	@JoinColumn(name="a_id")
//	private Answer answer;
	
	@OneToMany(mappedBy = "question",fetch = FetchType.EAGER)
	private List<Answer>answer;
	
	public int getQuestionid() {
		return questionid;
	}
	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	
	
public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	
	public Question(int questionid, String question, List<Answer> answer) {
		super();
		this.questionid = questionid;
		this.question = question;
		this.answer = answer;
	}
	//	public Answer getAnswer() {
//		return answer;
//	}
//	public void setAnswer(Answer answer) {
//		this.answer = answer;
//	}
//	public Question(int questionid, String question, Answer answer) {
//		super();
//		this.questionid = questionid;
//		this.question = question;
//		this.answer = answer;
//	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	
}
