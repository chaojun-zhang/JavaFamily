package code.tree

//二叉搜索树的最小绝对差
object MinDiffOfBST {

  def apply(node:Node):Int ={
    //中序遍历得到有序数组
    val arr = InOrder(node)
    //从1开始求最小值

    if (arr.isEmpty) return 0
    if (arr.length ==1) return arr.head

    var res:Int = 0
    for (i<-1 until arr.length){
      res = Math.min(res,(arr(i)-arr(i-1)))
    }
    res
  }

}
