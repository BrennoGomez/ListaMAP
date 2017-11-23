
public class SlotUm extends MachineChain {

	public SlotUm() {
		super(Slots.SLOT_UM);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double formaDePagamento() {
		System.out.println("SlotUm: 0,10 centavos");
		double pagamento = 0.10 * getDinheiro();
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