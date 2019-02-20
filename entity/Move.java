package entity;

public class Move {
	private Integer moveId;
	private String moveName;
	private Integer typeId;
	private Integer movePower;
	private Integer movePP;
	private Integer moveAccuracy;
	public Integer getMoveId() {
		return moveId;
	}
	public void setMoveId(Integer moveId) {
		this.moveId = moveId;
	}
	public String getMoveName() {
		return moveName;
	}
	public void setMoveName(String moveName) {
		this.moveName = moveName;
	}
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	public Integer getMovePower() {
		return movePower;
	}
	public void setMovePower(Integer movePower) {
		this.movePower = movePower;
	}
	public Integer getMovePP() {
		return movePP;
	}
	public void setMovePP(Integer movePP) {
		this.movePP = movePP;
	}
	public Integer getMoveAccuracy() {
		return moveAccuracy;
	}
	public void setMoveAccuracy(Integer moveAccuracy) {
		this.moveAccuracy = moveAccuracy;
	}
	@Override
	public String toString() {
		return "PetDao [moveAccuracy=" + moveAccuracy + ", moveId=" + moveId
				+ ", moveName=" + moveName + ", movePP=" + movePP
				+ ", movePower=" + movePower + ", typeId=" + typeId + "]";
	}

	  
}
