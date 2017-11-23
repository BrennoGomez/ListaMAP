
public class Main {
	public static void main(String[] args) {
		
		MachineChain moedasSlot = new SlotTres();
		moedasSlot.setNextSlots(new SlotDois());
		moedasSlot.setNextSlots(new SlotUm());

		moedasSlot.setProdutoNome("Coca-Cola");
		moedasSlot.setProdutoValor(2.0);;
		moedasSlot.setDinheiro(20);

		try {
			moedasSlot.pagamentoSlot(Slots.SLOT_UM);
			moedasSlot.pagamentoSlot(Slots.SLOT_DOIS);
			moedasSlot.pagamentoSlot(Slots.SLOT_TRES);
		} catch (Exception e) {
			e.printStackTrace();
		}
}

}
