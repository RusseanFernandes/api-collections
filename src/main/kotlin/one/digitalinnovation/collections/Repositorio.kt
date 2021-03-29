package one.digitalinnovation.collections

class Repositorio<T> {
    private val map = mutableMapOf<String,T>()

    fun create (id: String,value: T){
        map[id]= value //map.put(id,value) PUT Melhoria na Sintaxe kotlin
    }
    fun remove(id: String) = map.remove(id)

    fun  findById(id:String) = map[id] //map.get(id) GET  Melhoria na Sintaxe kotlin

    fun findAll() = map.values
}