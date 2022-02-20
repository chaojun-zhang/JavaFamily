import scala.collection.immutable
def subset(nums:List[Int]) :List[List[Int]] = {
     nums.length match {
          case 0=> List()
          case n=>{
               val lastSubset:  List[List[Int]] = subset(nums.dropRight(1))
               val curr: List[List[Int]] = List(nums.last ) :: lastSubset.map(x=> n::x)
                 lastSubset ++ curr
          }
     }
}

val res = subset(List(1,2,3))
res map (_.mkString(",")) foreach println


