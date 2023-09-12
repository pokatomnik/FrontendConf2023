class Example {
  public constructor(
    private readonly foo: number,
    public bar: string,
    baz: boolean = false
  ) {}

  public toString(): string {
    return `${this.foo} ${this.bar}`;
  }
}
