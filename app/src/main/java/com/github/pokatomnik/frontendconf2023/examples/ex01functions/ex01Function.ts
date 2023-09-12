export class SomeClass {
  public constructor(public readonly value: string) {}
}

export function example(
  a: number,
  b: string | null,
  c: boolean = false,
  foo: SomeClass | null,
  callback: (result: string) => void
) {
  const result = `${a}, ${b}, ${c},`;
  callback(`${result} ${foo?.value}`);
}
