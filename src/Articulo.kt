/**
 * Clase que representa un artículo.
 *
 * @property nombre El nombre del artículo.
 * @property precio El precio del artículo.
 */
open class Articulo(private var nombre: String, open var precio: Double) {
    companion object {
        //Contador estático para generar IDs únicos para los artículos.
        private var totalArticulos: Int = 0
    }

    //ID único del articulo
    private val ID: Int

    init {
        ID = generarId()
    }

    /**
     * Genera un ID único para el artículo.
     *
     * @return El ID único generado.
     */
    private fun generarId(): Int {
        totalArticulos++
        return totalArticulos
    }

    /**
     * Aplica una promoción de Navidad al precio del artículo.
     *
     * @param rebaja El porcentaje de rebaja a aplicar.
     */
    open fun promocionNavidad(rebaja: Int) {
        precio -= precio * (rebaja / 100)
    }

    /**
     * Devuelve una representación en cadena del artículo.
     *
     * @return La representación en cadena del artículo.
     */
    override fun toString(): String {
        return "$nombre - ${"%.2f".format(precio)}€ (ID: ${ID})"
    }


}