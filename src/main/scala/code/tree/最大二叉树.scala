package code.tree

//给定一个不含重复元素的整数数组。一个以此数组构建的最大二叉树定义如下：
//二叉树的根是数组中的最大元素。
//左子树是通过数组中最大值左边部分构造出的最大二叉树。
//右子树是通过数组中最大值右边部分构造出的最大二叉树。
//通过给定的数组构建最大二叉树，并且输出这个树的根节点。
object MaxBinTree {

  def apply(arr: Array[Int]): Node = {
    if (arr.isEmpty) return null
    val node = Node(null, null, arr.max)
    val maxIndex = arr.indexWhere(_ == arr.max)
    node.left = apply(arr.slice(0,maxIndex))
    node.right = apply(arr.slice(maxIndex+1,arr.length))
    node
  }

  def main(args: Array[String]): Unit = {
    PreOrder(apply(Array(3, 2, 1, 6, 0, 5)))
  }

}
