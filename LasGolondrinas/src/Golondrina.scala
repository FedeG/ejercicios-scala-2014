class Golondrina() {
	var salud: Int = 0
	var ciudad: String = "Capital"
	var nombre: String = "Golondrina Aleatoria"
	
	def tuSaludEs(unNumero:Int){
	  salud = unNumero
	}
	
	def dameTuSalud(): Int = salud
	
	def dameTuSaludEImprimila(): Int = {
	  println(salud)
	  return salud
	}
}