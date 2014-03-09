object workspace {
	def main(args: Array[String]){
		val arma_metra = new Arma(10,"Metra",10,(emisor: Tanque, receptor: Tanque) => receptor.blindaje > emisor.blindaje)
		val arma_xxx = new Arma(40,"XXX",3,(_, receptor: Tanque) => receptor.nombre == ":D")
		val arma_agua = new Arma(1,"Agua",1,(emisor: Tanque, _) => emisor.nombre == "Uptimus Prime")
		val vector_armas = Array(arma_metra,arma_xxx)
		val tanque1 = new Tanque(vector_armas,100,":D")
		val uptimus_prime = new Tanque(vector_armas:+arma_agua,21,"Uptimus Prime")
		
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
		println("-----Armas de Uptimus-----")
		for ( arma <- uptimus_prime.armas) {
			println(arma.nombre + " usos: " + arma.usos)
		}
		println("-----Armas de tanque1-----")
		for ( arma <- tanque1.armas) {
			println(arma.nombre + " usos: " + arma.usos)
		}
		
	}

}