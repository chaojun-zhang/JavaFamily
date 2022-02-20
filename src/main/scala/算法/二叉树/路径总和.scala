package 算法.二叉树

object SumPath {

  def hasPathSum(node: Node, target: Int): Boolean = {
    if (node == null) return false
    if (node.left == null && node.right == null) return node.value == target
    hasPathSum(node.left, target - node.value) && hasPathSum(node.right, target - node.value)
  }


}
