//Author :Sudhanshu Badoni
//Language : Scala
//Build Tool :sbt 
//Logic : Reads the number from file Even_num.txt and prints only the even numbers on command line .
//Run :./spark-submit --class "main.scala.EvNumbers" 
//      --master local  /Users/sudhanshubadoni/Documents/Study/Spark/Workspace-scala/EvenNos/target/scala-2.10/evennumbers_2.10-1.0.jar
package main.scala
import org.apache.spark.{SparkConf, SparkContext}
import scala.io.Source
import java.io.InputStream

object EvNumbers {

 def main(args: Array[String]){
val conf=new SparkConf().setAppName("EvenNumbers").setMaster("local[2]");
val sc =new SparkContext(conf);
val rdfile=sc.textFile("Even_num.txt");
val newNumList=rdfile.flatMap(line=>line.split(" "));
val evenList=newNumList.filter(_.toInt%2==0);
evenList.foreach(println)
}  

}