import doodle.core._
import doodle.image.Image.Elements.Beside
import doodle.image._
import doodle.image.syntax._
import doodle.image.syntax.core._
import doodle.java2d._
import doodle.reactor._

import scala.concurrent.duration._

// To use this example:
//
// 1. run `sbt`
// 2. run the `run` command within `sbt`
object Practice {
  val image =
    Image
      .square(10)
      .fillColor(Color.purple)
      .on(Image.square(200).fillColor(Color.deepPink))
      .on(Image.square(300).fillColor(Color.yellow))




  val image2 =
    Image
      .triangle(10,30)
      .fillColor(Color.teal)
      .on(Image.triangle(200,100).fillColor(Color.deepPink))
      .on(Image.triangle(300,100).fillColor(Color.yellow))
  val image3=
    Image.circle(20)
    .fillColor(Color.deepPink)
    .on(Image.circle(20).fillColor(Color.white))
    .on(Image.circle(30).fillColor(Color.deepPink))
    .on(Image.circle(50).fillColor(Color.maroon))



val image4 =
  Image.square(20)
  .fillColor(Color.white)
  .on(Image.square(20).fillColor(Color.teal))
  .on(Image.square(100).fillColor((Color.yellow)))
  .on(Image.square(200).fillColor(Color.peru))



  val animation =
    Reactor
      .linearRamp(-200, 200, 1)
      .tickRate(20.millis)
      .render{x =>
        val y = x.degrees.sin * 200
        val planet = Image.circle(20.0).noStroke.fillColor(Color.seaGreen)
        val moon = Image.circle(5.0).noStroke.fillColor(Color.slateGray).at((x * 10).degrees.cos * 50, (x * 10).degrees.sin * 50)

        moon.on(planet).at(x, y)
      }

  val frame = Frame.size(600, 600)

  def sierpinski(count: Int): Image = {
    val triangle = Image.triangle(10, 10) strokeColor Color.magenta
    count match {
      case 0 => triangle above (triangle beside triangle)
      case n =>
        val unit = sierpinski(n-1)
        unit above (unit beside unit)
    }
  }



  def main(args: Array[String]): Unit = {
    image3.draw()
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

