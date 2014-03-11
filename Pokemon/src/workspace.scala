object workspace {
	def main(args: Array[String]){
	  
	  /*Probando incializacion default de clase*/
	  val pikachu = new Pokemon()
	  println(pikachu.name())
	  
	  /*Probando sobrecarga de mètodos*/
	  pikachu.name("Pikachu")
	  println(pikachu.name())
	  
	  /*Probando inicializacion directa*/
	  val raichu = new Pokemon("Raichu")
	  println(raichu.name())
	}
}