package model.vo;

public class StudentVO {

	private int StudentNum;
	private String StudentName;
	private int KoreanScore;
	private int EnglishScore;
	private int MathScore;
	
	
	public StudentVO() {}


	public StudentVO(int studentNum, String studentName, int koreanScore, int englishScore, int mathScore) {
		super();
		StudentNum = studentNum;
		StudentName = studentName;
		KoreanScore = koreanScore;
		EnglishScore = englishScore;
		MathScore = mathScore;
	}


	public int getStudentNum() {
		return StudentNum;
	}


	public void setStudentNum(int studentNum) {
		StudentNum = studentNum;
	}


	public String getStudentName() {
		return StudentName;
	}


	public void setStudentName(String studentName) {
		StudentName = studentName;
	}


	public int getKoreanScore() {
		return KoreanScore;
	}


	public void setKoreanScore(int koreanScore) {
		KoreanScore = koreanScore;
	}


	public int getEnglishScore() {
		return EnglishScore;
	}


	public void setEnglishScore(int englishScore) {
		EnglishScore = englishScore;
	}


	public int getMathScore() {
		return MathScore;
	}


	public void setMathScore(int mathScore) {
		MathScore = mathScore;
	}


	@Override
	public String toString() {
		return "StudentVO [StudentNum=" + StudentNum + ", StudentName=" + StudentName + ", KoreanScore=" + KoreanScore
				+ ", EnglishScore=" + EnglishScore + ", MathScore=" + MathScore + "]";
	}
	
	
}
