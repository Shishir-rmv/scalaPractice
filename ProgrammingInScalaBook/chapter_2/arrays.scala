val greetStrings = new Array[String](3) // equivalent to val greetStrings: Array[String] = new Array[String](3)

greetStrings(0) = "Hello"     //equivalent to greetStrings.update(0, "Hello")
greetStrings(1) = ", "
greetStrings(2) = "World \n"

for (i <- 0 to 2)             // "to" is a method that takes one Int argument. Equivalent to (0).to(2)
  print(greetStrings(i))      // greetStrings(i) gets transformed into greetStrings.apply(i)
