val greetStrings: Array[String] = new Array[String](3)

greetStrings.update(0, "Hello")
greetStrings.update(1, ", ")
greetStrings.update(2, "World \n")

for (i <- (0).to(2))
  Console print greetStrings(i)
