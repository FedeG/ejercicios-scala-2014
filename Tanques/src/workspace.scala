object workspace {
	def main(args: Array[String]){
	  
		def uso_letal(victima: Tanque, otro: Tanque): Boolean = {
			victima.morite()
			return false
		}
		
		val arma_metra = new Arma(10,"Metra",10,(emisor: Tanque, receptor: Tanque) => receptor.blindaje > emisor.blindaje)
		val arma_xxx = new Arma(40,"XXX",3,(_, receptor: Tanque) => receptor.nombre == ":D")
		val arma_agua = new Arma(1,"Agua",1,(emisor: Tanque, _) => emisor.nombre == "Optimus Prime")
		val arma_letal = new Arma(1000,"Metra super",1000,uso_letal)
		val vector_armas = Array(arma_metra,arma_xxx)
		val tanque1 = new Tanque(vector_armas:+arma_letal,100,":D")
		val optimus_prime = new Tanque(vector_armas:+arma_agua,21,"Optimus Prime")
		
		tanque1.atacar_a(optimus_prime, "Metra")
		optimus_prime.atacar_a(tanque1, "XXX")
		println("Tanque1 blindaje: " + tanque1.blindaje)
		println("Optimus blindaje: " + optimus_prime.blindaje)
		tanque1.atacar_a(optimus_prime, "Metra")
		optimus_prime.atacar_a(tanque1, "Agua")
		println("Tanque1 blindaje: " + tanque1.blindaje)
		println("Optimus blindaje: " + optimus_prime.blindaje)
		optimus_prime.atacar_a(tanque1,"XXX")
		println("Tanque1 blindaje: " + tanque1.blindaje)
		println("Optimus blindaje: " + optimus_prime.blindaje)
		optimus_prime.atacar_a(tanque1,"XXX")
		println("Tanque1 blindaje: " + tanque1.blindaje)
		println("Optimus blindaje: " + optimus_prime.blindaje)
		println("\n-----Armas de Optimus-----\n")
		for ( arma <- optimus_prime.armas) {
			println(arma.nombre + " usos: " + arma.usos)
		}
		println("\n-----Armas de tanque1-----\n")
		for ( arma <- tanque1.armas) {
			println(arma.nombre + " usos: " + arma.usos)
		}
		println("\n-----Suicidio de Optimus Prime-----\n")
		optimus_prime.atacar_a(tanque1,"Metra super")
		
	}

}