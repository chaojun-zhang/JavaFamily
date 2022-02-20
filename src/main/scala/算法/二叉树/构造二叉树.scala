package 算法.二叉树

//从中序与后序遍历序列构造二叉树
//从前序与中序遍历序列构造二叉树


object TreeCreation   {

  def buildTree(inorder:Array[Int],postOrder: Array[Int]):Node ={
    if (inorder.isEmpty || postOrder.isEmpty ) return null
    val curNode = postOrder.last
    val node = Node(null,null, curNode)

    //取得当前节点在中序遍历树的位置
    val nodeIndex = inorder.indexWhere(_==curNode )

    //构造中序遍历的左子树和右子树
    //左子树是从0到节点，左闭右开
    //右子树是从nodeIndex+1开始到结尾，左闭右开
    val (inOrderLeftTree,inOrderRightTree) = (inorder.take(nodeIndex), inorder.drop(nodeIndex+1))

    //构造后序遍历的左子树和右子树
    //左子树从0到中序左子树的结尾
    //右子树从左子树开始到结尾，注意去掉最后一个
    val (postOrderLeftTree,postOrderRightTree ) = (postOrder.take(inOrderLeftTree.length), postOrder.drop(inOrderLeftTree.length).dropRight(1))

    //根据中序的左子树和后续的左子树递归构建当前节点的左节点
    node.left = buildTree(inOrderLeftTree,postOrderLeftTree)

    //根据中序的右子树和后续的右子树递归构建当前节点的右节点
    node.right = buildTree(inOrderRightTree,postOrderRightTree)

    node
  }

  def main(args: Array[String]): Unit = {
    val node = buildTree(Array(9,3,15,20,7),Array(9,15,7,20,3))
    PreOrder(node)// should print 3,9,20,15,7
  }
}
