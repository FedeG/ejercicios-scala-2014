class Pokemon(n:String = "Pokemon aleatorio") {
  
  var nombre : String = n
  
	def name() = (this.nombre)
	
	def name(name: String){
    	nombre = name
    }
	
}