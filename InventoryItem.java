public class InventoryItem {
	private Item item;
	private int qty;

	public InventoryItem(Item item) {
		this.item=item;
		this.qty=0;
	}

	// default qty = qty
	public InventoryItem(Item item, int qty) {
		this.item=item;
		this.qty=qty;
	}

	// kembalikan item
	public Item getItem() { return item; }

	// kembalikan jumlah qty
	public int getQty() { return qty; }

	// ubah qty menjadi sebanyak qty
	// jika qty < 0 throw IllegalArgumentException
	public int setQty(int qty) {
		if(qty<0){
			throw new IllegalArgumentException ("Quantity err");
		}else{
			return this.qty=qty;
		}
	}
	
	public String toString() {
		return String.format("<InventoryItem:%s:%d>", item.toString(), qty);
	}
}
