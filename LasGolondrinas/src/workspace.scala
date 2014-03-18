object workspace {
	def main(args: Array[String]){
	  val pepita = new Golondrina(s=100,n="Pepita")
	  val pepona = new Golondrina(s=50,n="Pepona")
	  
	  //Crear e imprimir una lista de numeros
	  val listaNumeros = List(1,2,3)
	  println(listaNumeros)
	  
	  //Imprimir su sumatoria
	  println(listaNumeros.sum)
	  
	  //Crear e imprimir lista de Golondrinas
	  val golondrinas = List(pepita,pepona)
	  println(golondrinas)
	  
	  //Imprimir lista de vidas mappeando golondrinas
	  //Ojo, hay una funcion lambda ayudando :3
	  //y tambien hay inferencia de tipos
	  val vidas = golondrinas.map(g => g.salud)
	  println(vidas)
	  
	  //Imprimir lista de vidas que superen 60 
	  //mappeando y fitrando golondrinas
	  println(vidas.filter(vida => vida > 60))
	  
	  //Hacer todo la anterior de un saque!!
	  //Composición de métodos de Scala :3
	  println(golondrinas.map(g => g.salud).filter(vida => vida > 60))
	  
	  //Armar oraciones a partir 
	  //de la lista golondrinas con foreach
	  golondrinas.foreach(g => println("Hola! Yo soy la golondrina "+g.nombre+" y mi salud es "+g.salud))
	
	  val notas = List(9,5,7,9,9,5,5,10,6,7,9,6,2,2)
	  println(notas.sum+" "+notas.length)
	}
}