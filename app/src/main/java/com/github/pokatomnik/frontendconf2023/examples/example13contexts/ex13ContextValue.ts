export enum ThemeId {
  DARK = "DARK",
  LIGHT = "LIGHT",
}

export class Theme {
  public constructor(
    public readonly themeId: ThemeId,
    public readonly onThemeChange: (themeId: ThemeId) => void
  ) {}
}
