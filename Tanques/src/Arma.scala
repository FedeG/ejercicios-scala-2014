class Arma (d: Int, n: String, u: Int, act: (Tanque, Tanque) => Boolean){
	var danio: Int = d
	var nombre: String = n
	var usos: Int = u
	var accion_previa_al_ataque: (Tanque,Tanque) => Boolean = act
	
	def puede_usarse(emisor: Tanque, receptor: Tanque): Boolean = this.usos>0 && this.accion_previa_al_ataque(emisor,receptor)
	
	def ataca_a(emisor: Tanque, receptor: Tanque){
		if (this.puede_usarse(emisor,receptor)) {
			receptor.daniate(this.danio)
			this.usos -= 1
		}
	}
	
}