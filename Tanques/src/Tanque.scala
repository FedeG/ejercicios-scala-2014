class Tanque (as: Array[Arma], b: Int, n: String) {
	var nombre: String = n
	var armas: Array[Arma] = as
	var blindaje: Int = b
	var vivo: Boolean = true
	
	def atacar_a(tanque_a_atacar: Tanque, nombre_arma_usar: String) {
	  	if (this.vivo) {
	  		var arma_a_usar = this.buscar_arma_a_usar(nombre_arma_usar)
	  		arma_a_usar.ataca_a(this,tanque_a_atacar)
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
		this.vivo = false
		println("Me mori :( (soy el tanque "+this.nombre+")")
	}
	
	def buscar_arma_a_usar(nombre_arma_usar: String): Arma = {
			var index_de_arma = armas.indexWhere((arma: Arma) => arma.nombre == nombre_arma_usar)
			return armas(index_de_arma)
	}
}