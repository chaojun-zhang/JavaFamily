package 算法.二叉树

//给定一个有相同值的二叉搜索树（BST），找出 BST 中的所有众数（出现频率最高的元素）。
//
//假定 BST 有如下定义：
//
//结点左子树中所含结点的值小于等于当前结点的值
//结点右子树中所含结点的值大于等于当前结点的值
//左子树和右子树都是二叉搜索树
//例如：
//
//给定 BST [1,null,2,2]

//   1
//    \
//     2
//    /
//   2

//返回[2]
object BSTMaxRepeatNode {

  var maxCount = 0
  var curCount = 0

  var res:Node = null
  var prev:Node = null

  def order(node: Node):Unit  ={
    if (node ==null) {
      return
    }
    order(node.left)

    def updateRes = {
      if (curCount >= maxCount) {
        res = prev
      }
      maxCount = Math.max(maxCount, curCount)
    }

    if (prev ==null) {//第一个节点
      curCount =1
      maxCount = 1
      res = node
    }else if (prev.value == node.value){
      curCount = curCount + 1
      updateRes
    }else {
      updateRes
      curCount = 1
    }

    prev = node
    order(node.right)
  }


  def main(args: Array[String]): Unit = {
//
//    val root = Node(null,null,1)
//    val right = Node (null,null,2)
//    root.right = right
//    right.left = Node(null,null,2)
//
//    println(order(root).value)

    val x = Node(Node(Node(4,null,4),null,4),null,4)

    val root:Node = Node(2,Node(3,x,3),3)


    order(root)
    println(maxCount)
    println(res.value)
  }

}
