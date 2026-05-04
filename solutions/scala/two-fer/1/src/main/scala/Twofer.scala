object Twofer {
  def twofer(name: String = ""): String = {
      if(name.length == 0) {
        "One for you, one for me."
      } else {
        f"One for $name, one for me."
      }
    }
}
