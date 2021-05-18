public class Chevaliers extends Guerrier {

	private boolean regen = false;
	private final int pvInit;

	public Chevaliers(String nom, int pv, int nbDesAtt) {
		super(nom, pv, nbDesAtt);
		this.pvInit = pv;
	}

	@Override
	public void subirDegats(int degats) {
		if (this.pv - degats <= 0) {
			if (regen) {
				regen = true;
				this.pv = pvInit;
			}
		}
		setPv(Math.max(this.pv - degats, 0));
	}
}
