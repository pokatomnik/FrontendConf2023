export class User {
  public constructor(
    public readonly id: number,
    public readonly firstName: string,
    public readonly lastName: string,
    public readonly middleName: string | null
  ) {}
}
