class Tanque (as: Array[Arma], b: Int, n: String) {
	var nombre: String = n
	var armas: Array[Arma] = as
	var blindaje: Int = b
	var vivo: Boolean = true
	
	def atacar_a(tanque_a_atacar: Tanque, nombre_arma_usar: String) {
	  	if (this.vivo) {
	  		if (this.tenes_el_arma(nombre_arma_usar)) {
	  			var arma_a_usar = this.buscar_arma_a_usar(nombre_arma_usar)
	  			if (this.asesinaste_a_con_el_arma(tanque_a_atacar,arma_a_usar)) this.robar_armas(tanque_a_atacar)
	  			arma_a_usar.ataca_a(this,tanque_a_atacar)
	  		}
	  	}
	}
	
	def asesinaste_a_con_el_arma(tanque_a_atacar: Tanque, arma_a_usar: Arma): Boolean = {
		var lo_mato = false
		if (tanque_a_atacar.vivo && arma_a_usar.puede_usarse(this,tanque_a_atacar)) lo_mato = (tanque_a_atacar.blindaje < arma_a_usar.danio)
		return lo_mato
	}
	
	def robar_armas(tanque_a_robar_armas: Tanque){
		for ( arma <- tanque_a_robar_armas.armas) {
			if (this.tenes_el_arma(arma.nombre)) 
			  this.buscar_arma_a_usar(arma.nombre).usos += arma.usos
			else
			  this.armas = this.armas :+ arma 
		}
	}
	
	def daniate(danio: Int){
		if (this.vivo) {
		    this.blindaje -= danio
		    if (this.blindaje <= 0) this.morite()
		}
	}
	
	def morite(){
		this.blindaje = 0
		this.armas = Array()
		this.vivo = false
		println("\nMe mori :( (soy el tanque "+this.nombre+")\n")
	}
	
	def tenes_el_arma(nombre_arma: String): Boolean = {
		var index_de_arma = armas.indexWhere((arma: Arma) => arma.nombre == nombre_arma)
		return index_de_arma != -1
	}
	
	def buscar_arma_a_usar(nombre_arma_usar: String): Arma = {
			var index_de_arma = armas.indexWhere((arma: Arma) => arma.nombre == nombre_arma_usar)
			return armas(index_de_arma)
	}
}