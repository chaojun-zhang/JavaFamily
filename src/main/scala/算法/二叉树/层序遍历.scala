package 算法.二叉树

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object LevelOrder  {
  def apply(node:Node): Unit ={
    val queue = new mutable.Queue[Node]()
    val res = new ArrayBuffer[ArrayBuffer[Int]]()

    if (node != null) {
      queue.enqueue(node)
    }
    while (queue.nonEmpty) {
      val size = queue.size
      val level = new ArrayBuffer[Int]()
      for (_<- 0 until size){
        val tmp = queue.dequeue()
        level+= tmp.value
        if (tmp.left!=null) queue.enqueue(tmp.left)
        if (tmp.right!=null) queue.enqueue(tmp.right)
      }
      if (level.nonEmpty) res+= level
    }
    res.foreach( it=> println(it.mkString(" ")))
  }

  def main(args: Array[String]): Unit = {
    LevelOrder(Node())
  }

}
