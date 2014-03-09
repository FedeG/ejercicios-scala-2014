class Arma (d: Int, n: String, act: (Tanque, Tanque) => Boolean){
	var danio: Int = d
	var nombre: String = n
	var accion_previa_al_ataque: (Tanque,Tanque) => Boolean = act
	
	def ataca_a(emisor: Tanque, receptor: Tanque){
		if (accion_previa_al_ataque(emisor,receptor)) receptor.daniate(this.danio) 
	}
	
}