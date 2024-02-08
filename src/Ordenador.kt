/**
 * Clase que representa un ordenador, que es un tipo específico de artículo.
 *
 * @param nombre El nombre del ordenador.
 * @param precio El precio del ordenador.
 * @param tipo El tipo de ordenador (por defecto, [TipoOrdenador.BASICO]).
 */
class Ordenador(nombre:String,precio: Double, var tipo: TipoOrdenador = TipoOrdenador.BASICO): Articulo(nombre, precio) {

    /**
     * Aplica una promoción de Navidad al precio del ordenador, solo si el precio es superior a 500€.
     *
     * @param rebaja El porcentaje de rebaja a aplicar.
     */
    override fun promocionNavidad(rebaja: Int) {
        if (precio > 500) super.promocionNavidad(rebaja)
    }
}

/**
 * Enumeración que representa los diferentes tipos de ordenadores disponibles.
 */
enum class TipoOrdenador {
    BASICO, OFIMATICA, TODOTERRENO, GAMING
}