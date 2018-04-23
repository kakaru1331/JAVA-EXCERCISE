package impl;

import ext.Champ;
import itfc.Skill;

public class Jayce extends Champ implements Skill {
	String name = "���̽�";
	int hp = 600;
	int mp = 200;
	boolean passive = true;
	
	@Override
	public String skillP() {
		if(passive) {			
			return "[ĳ��] �������� ������: ����";
		} else {			
			return "[�ظ�] �������� ������: �߰� ������";
		}		
	}

	@Override
	public String skillQ() {
		if(passive) {
			return "���� ����";
		} else {		
			return "�ϴ÷�!";
		}		
	}

	@Override
	public String skillW() {
		if(passive) {		
			return "������";
		} else {			
			return "���� ����";
		}	
	}

	@Override
	public String skillE() {
		if(passive) {		
			return "���� ����";
		} else {			
			return "õ�� ��Ÿ";
		}	
	}

	@Override
	public String skillR() {
		if(passive) {
			passive = false;
			return "��ť�� ĳ��";
		} else {
			passive = true;
			return "��ť�� �ظ�";
		}
	}
	
	@Override
	public String introduce() {
		return super.introduceSelf(name) 
				+ "������ ���� ��!";
	}		
	
}
