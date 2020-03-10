package com.sys.table;

public class EvaTable {
	
	int eva_id;
	int eva_person_id;
	int eva_report_id;
	String eva_time;
	String eva_grade;
	String eva_contents;
	String eva_sugg;
	public int getEva_id() {
		return eva_id;
	}
	public void setEva_id(int eva_id) {
		this.eva_id = eva_id;
	}
	public int getEva_person_id() {
		return eva_person_id;
	}
	public void setEva_person_id(int eva_person_id) {
		this.eva_person_id = eva_person_id;
	}
	public int getEva_report_id() {
		return eva_report_id;
	}
	public void setEva_report_id(int eva_report_id) {
		this.eva_report_id = eva_report_id;
	}
	public String getEva_time() {
		return eva_time;
	}
	public void setEva_time(String eva_time) {
		this.eva_time = eva_time;
	}
	public String getEva_grade() {
		return eva_grade;
	}
	public void setEva_grade(String eva_grade) {
		this.eva_grade = eva_grade;
	}
	public String getEva_contents() {
		return eva_contents;
	}
	public void setEva_contents(String eva_contents) {
		this.eva_contents = eva_contents;
	}
	public String getEva_sugg() {
		return eva_sugg;
	}
	public void setEva_sugg(String eva_sugg) {
		this.eva_sugg = eva_sugg;
	}
	@Override
	public String toString() {
		return "EvaTable [eva_id=" + eva_id + ", eva_person_id=" + eva_person_id + ", eva_report_id=" + eva_report_id
				+ ", eva_time=" + eva_time + ", eva_grade=" + eva_grade + ", eva_contents=" + eva_contents
				+ ", eva_sugg=" + eva_sugg + "]";
	}
	public EvaTable(int eva_id, int eva_person_id, int eva_report_id, String eva_time, String eva_grade,
			String eva_contents, String eva_sugg) {
		super();
		this.eva_id = eva_id;
		this.eva_person_id = eva_person_id;
		this.eva_report_id = eva_report_id;
		this.eva_time = eva_time;
		this.eva_grade = eva_grade;
		this.eva_contents = eva_contents;
		this.eva_sugg = eva_sugg;
	}

	
}
