import { SomeClass, example } from "../ex01functions/ex01Function";

function run() {
  example(
    1,
    "hello",
    true,
    new SomeClass("world"),
    (result) => {
        console.log(result);
    }
  );
}
