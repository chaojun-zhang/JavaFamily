package 算法.二叉树
 
import scala.collection.mutable.ArrayBuffer

object BinaryTreePath  {

  def traverse(node:Node, curPath:ArrayBuffer[String] ):Unit ={
    curPath+=node.value.toString
    if (node.left ==null && node.right == null){
      println( curPath.mkString("->"))
      return
    }
    if (node.left!=null){
      traverse(node.left,curPath)
      curPath.remove(curPath.size-1)
    }
    if (node.right!=null){
      traverse(node.right,curPath)
      curPath.remove(curPath.size-1)
    }

  }


  def main(args: Array[String]): Unit = {
    traverse(Node(),new ArrayBuffer[String]())
  }



}
