object workspace {
	def main(args: Array[String]){
		val arma = new Arma(10,"Metra",(tanque: Tanque) => tanque.nombre == "enemigo ¬¬")
		val arma2 = new Arma(40,"XXX",(tanque: Tanque) => tanque.nombre == ":D")
		val arma3 = new Arma(1,"Agua",(tanque: Tanque) => tanque.nombre == ":D")
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