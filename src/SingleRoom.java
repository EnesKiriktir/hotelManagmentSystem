
public class SingleRoom extends Room {

	
	public SingleRoom(int roomNo,boolean isSeaView) {
		super(roomNo,isSeaView);
		
	}
	
	public double calculatePrice() {
		if(this.isSeaView())
			return super.getPrice()*1.5+50;
		else
			return super.getPrice()*1.5;
	}

	
	

}
