class Arma (d: Int, n: String, act: (Tanque) => Boolean){
	var danio: Int = d
	var nombre: String = n
	var accion_previa_al_ataque: (Tanque) => Boolean = act
	
	def ataca_a(receptor: Tanque){
		if (accion_previa_al_ataque(receptor)) receptor.daniate(this.danio) 
	}
	
}