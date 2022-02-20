package 算法.二叉树

import 算法.二叉树.SumLeftLeave.sum

object BalanceTree {


  def isBalanced(node:Node):Boolean ={
    if (node == null) return true
    //左右树深度差
    val diff = Math.abs(maxDepth(node.left) - maxDepth(node.right))
    (diff ==1 || diff ==0 ) && isBalanced(node.left) && isBalanced(node.right)
  }

  def maxDepth(node:Node):Int ={
    if (node==null) return 0
    1+ Math.max(maxDepth(node.left),maxDepth(node.right))
  }



}
