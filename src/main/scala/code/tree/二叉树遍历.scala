package code.tree

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer


//前序遍历
object PreOrder  {

  def apply(node: Node): Unit = {
    if (node == null) {
      return
    }
    val stack = new mutable.Stack[Node]()
    stack.push(node)
    while (stack.nonEmpty) {
      val tmp = stack.pop()
      println(tmp.value)
      if (tmp.right != null) {
        stack.push(tmp.right)
      }
      if (tmp.left != null) {
        stack.push(tmp.left)
      }
    }
  }

  def main(args: Array[String]): Unit = {
    apply(Node())
  }


}

//中序遍历
object InOrder  {
  def apply(node: Node): Array[Int] = {
    if (node == null) {
      return Array()
    }
    val stack = new mutable.Stack[Node]()
    var tmp = node
    var res = new ArrayBuffer[Int]()
    while (tmp != null || stack.nonEmpty) {
      while (tmp != null) {
        stack.push(tmp)
        tmp = tmp.left
      }
      tmp = stack.pop()
      println(tmp.value)
      res+= tmp.value
      tmp = tmp.right
    }
    res .toArray
  }

  def main(args: Array[String]): Unit = {
    apply(Node())
  }

}

//后续遍历
object PostOrder  {
  def apply(node: Node): Unit = {
    if (node == null) {
      return
    }
    val stack = new mutable.Stack[Node]()
    stack.push(node)
    val list = new ArrayBuffer[Int]()
    while (stack.nonEmpty) {
      val tmp = stack.pop()
      list += tmp.value
      if (tmp.left != null) {
        stack.push(tmp.left)
      }
      if (tmp.right != null) {
        stack.push(tmp.right)
      }
    }
    list.reverse.foreach(println)
  }


  def main(args: Array[String]): Unit = {
    apply(Node())
  }
}

//统一方式遍历二叉树
object AllOrder   {

  def apply(node: Node) = {
    val res = new ArrayBuffer[Int]()
    val st = new mutable.Stack[Node]()
    if (node != null) st.push(node)
    while (st.nonEmpty) {
      var tmp = st.top
      if (tmp != null) {
        st.pop()
        //前序
        if (tmp.right != null) st.push(tmp.right)
        if (tmp.left != null) st.push(tmp.left)
        st.push(tmp) //加入节点
        st.push(null) //加入空节点

        //中序
//        if (tmp.right != null) st.push(tmp.right)
//        st.push(tmp) //加入节点
//        st.push(null) //加入空节点
//        if (tmp.left != null) st.push(tmp.left)

        //后序
//        st.push(tmp) //加入节点
//        st.push(null) //加入空节点
//        if (tmp.right != null) st.push(tmp.right)
//        if (tmp.left != null) st.push(tmp.left)

      } else {
        st.pop() //弹出空节点
        tmp = st.pop()
        res += tmp.value
      }
    }
  }

}

//统一方式遍历二叉树，颜色标记法
//其核心思想如下：
//使用颜色标记节点的状态，新节点为绿色，已访问的节点为红色。
//如果遇到的节点为白色，则将其标记为红色，然后将其右子节点、自身、左子节点依次入栈。
//如果遇到的节点为红色，则将节点的值输出。
object OrderWithColor   {
  sealed trait Color
  case object Red extends Color
  case object Green extends Color

  def apply(root: Node) = {
    val res = new ArrayBuffer[Int]()
    val st = new mutable.Stack[(Node, Color)]()
    if (root != null) st.push((root, Green))
    while (st.nonEmpty) {
      st.pop() match {
        case (null,_)=>
        case (node,Green)=>{
          //前序
          //st.push((node.right, Green))
          //st.push((node.left, Green))
          //st.push((node, Red))

          //中序
          st.push((node.right, Green))
          st.push((node, Red))
          st.push((node.left, Green))

          //后序
          //st.push((node.right, Green))
          //st.push((node.left, Green))
          //st.push((node, Red))
        }
        case (node,Red)=>{
          res += node.value
        }
      }
    }
  }

}