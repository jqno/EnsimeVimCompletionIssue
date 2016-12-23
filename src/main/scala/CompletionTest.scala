object CompletionTest {
  val hello = "Hello world"

  // To reproduce this issue:
  // - write `print`, invoke completion, choose `println`
  // - write the open paren
  // - write `he`, invoke completion
  //
  // Expected: the line expands to `println(hello)`
  // Actual: the line expands to `hello)`

  hello)
}
