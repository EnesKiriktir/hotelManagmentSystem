
public class DoubleRoom extends Room{
	
	public DoubleRoom(int roomNo,boolean isSeaView) {
		
		super(roomNo,isSeaView);
		
	}
	
	public double calculatePrice() {
		if(!this.isSeaView())
			return super.getPrice()*2;
		else
			return super.getPrice()*2+50;
	}

	

}
