class Pokemon(n:String = "Pokemon aleatorio") {
  
  var nombre : String = n
  
	def name(): String = {
	  return nombre
	}
	
	def name(name: String){
	  nombre = name
	}
}