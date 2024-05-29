package application.program.travle.model;

import java.util.ArrayList;

public class Country {
	String countryName;
	int countryId;
	String dash = "===========================================";
	String usaInfo = "북아메리카에 있는 국가인 미국! 잘 알려진 도시로는 \n뉴욕, LA, 하와이 등이 있습니다. \n나에게 꼭 맞는 다양한 즐길 거리와 볼거리를 만나보세요.";
	String japanInfo = "아시아에 있는 국가인 일본! 잘 알려진 도시로는 \n오사카, 도쿄, 오키나와 등이 있습니다. \n나에게 꼭 맞는 다양한 즐길 거리와 볼거리를 만나보세요.";
	String koreaInfo = "아시아에 있는 국가인 대한민국! 잘 알려진 도시로는 \n서울, 부산, 제주도 등이 있습니다. \n나에게 꼭 맞는 다양한 즐길 거리와 볼거리를 만나보세요.";
	public Country() {}
	public Country(String countryName, int countryId) {
		this.countryName = countryName;
		this.countryId = countryId;
	}
	
	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public void getUsaInfo() {
		System.out.println(dash);
		System.out.println(usaInfo);
		System.out.println(dash);
	}
	public void getJapanInfo() {
		System.out.println(dash);
		System.out.println(japanInfo);
		System.out.println(dash);
	}
	public void getKoreaInfo(){
		System.out.println(dash);
		System.out.println(koreaInfo);
		System.out.println(dash);
	}


		

	
		
	
	
	
}
