package com.vsouhrada.kotlin.playground.delegation

/**
 * @author vsouhrada
 */
class ItemBusinessLogic {

  val itemId: String = "123"

}




val businessLogic: ItemBusinessLogic by lazy {
  ItemBusinessLogic()
}





fun main(args: Array<String>) {
  println(businessLogic.itemId)


}