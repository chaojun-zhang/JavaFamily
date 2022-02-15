package leetcode.二叉树

import scala.collection.mutable

object MinDepth {

  //递归
  def minDepth(node:Node):Int = {
    if (node ==null) return 0
    1+ Math.min(minDepth(node.left),minDepth(node.right))

  }

  //迭代，采用层次遍历
  def minDepth2(node:Node):Int = {
    if (node ==null) return 0
    val queue = new mutable.Queue[Node]
    queue.enqueue(node)
    var depth = 0
    while (queue.nonEmpty){
      val size = queue.size
      depth = depth + 1
      for (_<- 0 until size){
        val tmp = queue.dequeue()
        if (tmp.left == null && tmp.right ==null){
          return depth
        }
        if (tmp.left!=null) queue.enqueue(tmp.left)
        if (tmp.right!=null) queue.enqueue(tmp.right)
      }
    }
    depth
  }

  def main(args: Array[String]): Unit = {
    println(MinDepth.minDepth(Node()))
    println(MinDepth.minDepth2(Node()))
  }


}
