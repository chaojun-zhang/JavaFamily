package leetcode.二叉树


object InvertTree  {
  def invert(node:Node): Node ={
    if (node == null){
      return null
    }
    invert(node.left)
    invert(node.right)
    swap(node)
  }

  def swap(node: Node)={
    val tmp = node.left
    node.left = node.right
    node.right = tmp
    node
  }

  def main(args: Array[String]): Unit = {
    invert(Node())
  }
}
