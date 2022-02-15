package leetcode.二叉树

object MergeBinTree {

  def apply(left:Node,right:Node):Node ={
    if (left == null ) return right
    if (right != null) return left
    //以下都不为空
    val node = Node(null,null,left.value+ right.value)
    node.left = apply(left.left,right.left)
    node.right = apply(left.right,right.right)
    node
  }

}
