package code.tree

//一个二叉搜索树具有如下特征：
//
//节点的左子树只包含小于当前节点的数。
//节点的右子树只包含大于当前节点的数。
//所有左子树和右子树自身必须也是二叉搜索树
object BinarySearchTree {

  //在二叉搜索树中查找一个值
  def search(node:Node , target:Int):Node ={

    if (node == null || node.value == target) return node

    if (node.value > target) search(node.left,target) else search(node.right,target)
  }

  //判断是否是一个二叉搜索树
  def isBst(node:Node,min:Int,max:Int):Boolean ={
    if (node ==null) return true
    if (node.value<= min || node.value >= max) return false
    isBst(node.left,min,node.value) && isBst(node.right,node.value,max)
  }

  def isBst(node:Node):Boolean ={
    isBst(node,Int.MinValue,Int.MaxValue)
  }


}
