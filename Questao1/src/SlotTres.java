
public class SlotTres extends MachineChain{

	public SlotTres() {
		super(Slots.SLOT_DOIS);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double formaDePagamento() {
		System.out.println("SlotDois: 0,25 centavos");
		double pagamento = 0.25 * getDinheiro();
		double troco = pagamento - getProdutoValor();
		if (pagamento == getProdutoValor()) {
			System.out.println("Produto: " + getProdutoNome()
					+ "\nValue:" + getProdutoValor() + "\nNão Pago");
		} else {
			System.out.println("Produto: " + getProdutoNome()
					+ "\nValue:" + getProdutoValor() + "\nTroco:" + troco);
		}
		return pagamento;
	}

}