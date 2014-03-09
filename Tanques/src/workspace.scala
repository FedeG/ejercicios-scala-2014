object workspace {
	def main(args: Array[String]){
		val arma = new Arma(10,"Metra",(emisor: Tanque, receptor: Tanque) => receptor.blindaje > emisor.blindaje)
		val arma2 = new Arma(40,"XXX",(_, receptor: Tanque) => receptor.nombre == ":D")
		val arma3 = new Arma(1,"Agua",(emisor: Tanque, _) => emisor.nombre == "Uptimus Prime")
		val vector_armas = Array(arma,arma2)
		val tanque1 = new Tanque(vector_armas,100,":D")
		val uptimus_prime = new Tanque(vector_armas:+arma3,21,"Uptimus Prime")
		
		tanque1.atacar_a(uptimus_prime, "Metra")
		uptimus_prime.atacar_a(tanque1, "XXX")
		println("Tanque1 blindaje: " + tanque1.blindaje)
		println("Uptimus blindaje: " + uptimus_prime.blindaje)
		tanque1.atacar_a(uptimus_prime, "Metra")
		uptimus_prime.atacar_a(tanque1, "Agua")
		println("Tanque1 blindaje: " + tanque1.blindaje)
		println("Uptimus blindaje: " + uptimus_prime.blindaje)
		uptimus_prime.atacar_a(tanque1,"XXX")
		println("Tanque1 blindaje: " + tanque1.blindaje)
		println("Uptimus blindaje: " + uptimus_prime.blindaje)
		uptimus_prime.atacar_a(tanque1,"XXX")
		println("Tanque1 blindaje: " + tanque1.blindaje)
		println("Uptimus blindaje: " + uptimus_prime.blindaje)
		
	}

}