class Golondrina(s: Int = 0, c: String = "Capital", n: String = "Golondrina Aleatoria") {
	var salud: Int = s
	var ciudad: String = c
	var nombre: String = n
	
	/* Sobrecarga de métodos: Un método sobrecargado
	 * no puede tener el mismo nombre que un atributo,
	 * trust me
	 */
	
	def health(): Int = this.salud
	def health(unNumero:Int){salud = unNumero}
	def name(): String = (this.nombre)
	def name(name: String){nombre = name}
	def city(): String = this.ciudad
	def city(unaCiudad: String){this.ciudad = unaCiudad}
	def salud1(): String = {
	  println(this.ciudad)
	  return this.ciudad
	}
}