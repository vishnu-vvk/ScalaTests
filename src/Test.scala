import java.io.{BufferedWriter, FileWriter, PrintWriter}

object Test {
  def main(args: Array[String]): Unit = {
    var path = "C:\\Users\\SA033\\Desktop\\Test\\Hello.txt"
    val test = new FileWriter(path,true)
      test.write("Hello\n");
      test.close

  }
}

//new PrintWriter(new BufferedWriter(
