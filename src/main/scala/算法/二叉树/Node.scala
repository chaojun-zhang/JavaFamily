package 算法.二叉树


case class Node(var left: Node = null, var right: Node = null, value: Int)




object Node {
  val node2 = Node(left = Node(value = 4), right = Node(value = 5), value = 2)
  val node3 = Node(left = Node(value = 6), right = Node(value = 7), value = 3)
  val root = Node(left = node2, right = node3, value = 1)
  def apply(): Node ={
    root
  }



  implicit def intToNode(x:Int):Node = Node(null,null,x)

}





