package chap04;

public class Printer {
	private int numOfPapers;
	private boolean duplex;
	
	public Printer(int numOfPapers, boolean duplex) {
		this.duplex = duplex;
		this.numOfPapers = numOfPapers;
		
	}
	public void print(int amount) {
		
		if (duplex == true) {
				// 용지 없음
				if (amount % 2 == 0) {
					amount = amount / 2;
				}
				else {
					amount = amount / 2 + 1;
				}
				if (numOfPapers == 0) {
					System.out.println("용지가 없습니다.");
				}
				
				// 용지 충분
				else if (numOfPapers >= amount) {
					this.numOfPapers -= amount;
					System.out.println("양면으로 " + amount + "장 출력했습니다. 현재 " + numOfPapers + "장 남아 있습니다.");
				}
				
				
				else {
					// 용지 부족
					System.out.println("양면으로 출력하려면 용지가 " + (amount - numOfPapers) + "장 부족합니다. " + numOfPapers + "장만 출력합니다.");
					this.numOfPapers = 0;
				}
		}
		
		else {
		
			// 용지 없음
			if (numOfPapers == 0) {
				System.out.println("용지가 없습니다.");
			}
			
			// 용지 충분
			else if (numOfPapers >= amount) {
				this.numOfPapers -= amount;
				System.out.println("단면으로 " + amount + "장 출력했습니다. 현재 " + numOfPapers + "장 남아 있습니다.");
			}
			
			
			else {
				// 용지 부족
				System.out.println("단면으로 출력하려면 용지가 " + (amount - numOfPapers) + "장 부족합니다. " + numOfPapers + "장만 출력합니다.");
				this.numOfPapers = 0;
			}
		}
	}
		
	public boolean getDuplex() {
			return duplex;
	}
		
	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
		
	}
	
}

