//��ʽ����ǰ����

import java.util.{Date,Locale}
import java.text.DateFormat
import java.text.DateFormat._
object FormatDate{
	def main(args:Array[String]){
		var now=new Date()
		var df=getDateInstance(LONG,Locale.CHINESE)
		println(df format now)
	}
}