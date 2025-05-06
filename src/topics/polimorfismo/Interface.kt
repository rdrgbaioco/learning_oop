package topics.polimorfismo



/*
* With Interfaces:
* To define contracts or behaviors that several different classes can have.
*/
interface Component {
    fun draw()
}

class Column : Component {
    override fun draw() {
        println("drawing a column")
    }
}

class Row : Component {
    override fun draw() {
        println("drawing a row")
    }
}

fun main() {
    val column: Component = Column()
    column.draw()

    val row: Component = Row()
    row.draw()

    val components: List<Component> = listOf(Column(), Row())
    for (component in components) {
        component.draw()
    }
}