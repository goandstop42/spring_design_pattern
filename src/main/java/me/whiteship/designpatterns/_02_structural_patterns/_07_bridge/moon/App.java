package me.whiteship.designpatterns._02_structural_patterns._07_bridge.moon;

/*Bridge
- 추상적인 것과 구체적인 것 분리
- 서로 성격이 상이하는 것을 분리하여 연결하는 것
- client는 추상적인 계층 구조만 사용, implementation을 간접적으로 사용
- client에서 Champion interface type만 사용
- 각각의 챔피언(아리,아칼리)은 Refined Abstract
- 추상적인 코드와 구체적인 코드 분리 가능
*/
public class App {
	public static void main(String[] args) {
//		Champion kda아리 = new KDA아리();
//		kda아리.skillQ();
//		kda아리.skillR();
		
		Champion kda아리 = new 아리(new KDA());
		kda아리.skillQ();
		kda아리.skillW();
		
		Champion poolParty아리 = new 아리(new PoolParty());
		kda아리.skillQ();
		kda아리.skillW();
		
	}
}

