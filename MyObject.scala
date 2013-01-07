object MyObject {

  def main(args: Array[String]): Unit = {
    println("hey,girl!")
    for(x<-List(1,2);y<-List("one","two")){
    //  yield (x,y)
      println(x,y)
    }
    
    val ls=List(1,2,34,4,34)
    println(ls)
    //以","分隔每个元素
    println(ls.mkString(","))
    //for循环的遍历
    for(x<-ls){
      printf("%d,",x)
    }
  }

}