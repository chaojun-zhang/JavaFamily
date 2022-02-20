package 算法.二叉树

object SumLeftLeave {


  def sum(node:Node):Int ={
    if (node ==null){
      return 0
    }

    val leaveValue = if (node.left != null && node.left.left ==null && node.left.right ==null){
      node.value
    }else {
      0
    }
    leaveValue +sum(node.left) +  sum(node.right)
  }


  def main(args: Array[String]): Unit = {
    println(sum(Node()))
  }



}
