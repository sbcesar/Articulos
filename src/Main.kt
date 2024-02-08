fun main() {
    //Crear artículo
    val articulo1 = Articulo("Silla",25.0)
    val articulo2 = Articulo("Mesa",45.0)

    //Crear ordenadores
    val ordenador1 = Ordenador("Asus",1299.99,TipoOrdenador.GAMING)
    val ordenador2 = Ordenador("Corsair",399.99,TipoOrdenador.BASICO)

    val articulos = listOf(articulo1,articulo2,ordenador1,ordenador2)
    articulos.forEach { it.promocionNavidad(20) }

    println(articulos.joinToString("\n") { it.toString() })

}