object MyObject {

  def main(args: Array[String]): Unit = {
    println("hey,girl!")
    for(x<-List(1,2);y<-List("one","two")){
    //  yield (x,y)
      println(x,y)
    }
    
    val ls=List(1,2,34,4,34)
    println(ls)
    //��","�ָ�ÿ��Ԫ��
    println(ls.mkString(","))
    //forѭ���ı���
    for(x<-ls){
      printf("%d,",x)
    }
  }

}