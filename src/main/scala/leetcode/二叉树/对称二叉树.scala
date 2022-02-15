package leetcode.二叉树

import scala.collection.mutable


//对称二叉树
object SymmetricTree  {

  //递归判断
  def isSymmetric(left: Node, right: Node): Boolean = {
    if (left == null && right != null) return false
    if (left != null && right == null) return false
    if (left == null && right == null) return true
    if (left.value != right.value) return false
    isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left)
  }

  def apply(node: Node): Boolean = {
    if (node == null) return true
    isSymmetric(node.left, node.right)
  }

  //迭代判断
  def isSymmetric(node: Node): Boolean = {
    if (node == null) return true
    val queue = new mutable.Queue[Node]()
    queue.enqueue(node.left)
    queue.enqueue(node.right)
    while (queue.nonEmpty) {
      (Option(queue.dequeue()), Option(queue.dequeue())) match {
        case (Some(_), None) => return false
        case (None, Some(_)) => return false
        case (Some(x), Some(y)) => {
          if (x.value != y.value) return false else {
            queue.enqueue(x.left)
            queue.enqueue(y.right)
            queue.enqueue(x.right)
            queue.enqueue(y.left)
          }
        }
        case (None, None) => return true
      }
    }
    true
  }

  def main(args: Array[String]): Unit = {
    SymmetricTree(Node())
  }
}
