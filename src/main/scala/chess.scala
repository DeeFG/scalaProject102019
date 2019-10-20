import doodle.core._
import doodle.image._
import doodle.image.syntax._
import doodle.image.syntax.core._
import doodle.java2d._


object chess {
  def chessboard(count: Int): Image = {
    val blackSquare = Image.rectangle(30, 30) fillColor Color.black
    val redSquare   = Image.rectangle(30, 30) fillColor Color.red
    val base =
      (redSquare   beside blackSquare) above (blackSquare beside redSquare)
    def loop(count: Int): Image =
      count match {
        case 0 => base
        case n =>
          val unit = loop(n-1)
          (unit beside unit) above (unit beside unit)
      }

    loop(count)
  }

  def main(args: Array[String]): Unit = {
    image.draw()
    //image.above(image2)draw()
    //image2.above(image3)draw()
    image4.draw()


    // Comment out the above and uncomment the below to display the animation
    // animation.run(frame)
    println(1 + 3)
    println(1.min(3))
    println(1+43/2)
    println("hi" ++ "I am Dee")

  }


}
