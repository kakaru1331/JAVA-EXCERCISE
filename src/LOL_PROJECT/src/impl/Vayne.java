package impl;

import ext.Champ;
import itfc.Skill;

public class Vayne extends Champ implements Skill {		
	String name = "����";
	int hp = 525;
	int mp = 200;
		
	@Override
	public String skillP() {		
		return "��� ��ɲ�";
	}

	@Override
	public String skillQ() {		
		return "������";
	}

	@Override
	public String skillW() {
		return "��ȭ��";
	}

	@Override
	public String skillE() {
		return "����";
	}

	@Override
	public String skillR() {
		return "������ �ð�";
	}

	@Override
	public String introduce() {
		return super.introduceSelf(name) 
				+ "�渶�� ������ ���±�.";
	}		

	
}
