import { type Theme, ThemeId } from "./ex13ContextValue";

/*  @ts-expect-error */
export const localThemeContext = React
  .createContext<Theme>({
    themeId: ThemeId.LIGHT,
      onThemeChange: () => {},
    });
