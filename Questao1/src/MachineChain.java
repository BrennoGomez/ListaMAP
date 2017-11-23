

public abstract class MachineChain {
	
	protected MachineChain nextSlots;
	protected Slots selecionaSlot;
	private String produtoNome;
	private double produtoValor;
	private int dinheiro;

	protected abstract double formaDePagamento();

	public MachineChain(Slots slots) {
		nextSlots = null;
		selecionaSlot = slots;
	}

	public boolean isMachineSlot(Slots slots) {
		if (selecionaSlot == slots) {
			return true;
		}
		return false;
	}

	public void pagamentoSlot(Slots slots) throws Exception {
		if (isMachineSlot(slots)) {
			formaDePagamento();
		} else {
			if (nextSlots == null) {
				throw new Exception("invalid slot");
			}
			nextSlots.pagamentoSlot(slots);
		}
	}


	public void setNextSlots(MachineChain next) {
		if (nextSlots == null) {
			nextSlots = next;
		} else {
			nextSlots.setNextSlots(next);
		}
	}

	public String getProdutoNome() {
		return produtoNome;
	}

	public void setProdutoNome(String produtoNome) {
		this.produtoNome = produtoNome;
	}

	public double getProdutoValor() {
		return produtoValor;
	}

	public void setProdutoValor(double produtoValor) {
		this.produtoValor = produtoValor;
	}

	public int getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(int dinheiro) {
		this.dinheiro = dinheiro;
	}
}