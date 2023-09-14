import {
  localThemeContext as LocalThemeContext
} from "./ex13Context";
import { Theme, ThemeId } from "./ex13ContextValue";

namespace React {
  export declare type PropsWithChildren<T> = {
    children: any;
  };
}

export const ThemeProvider = (
  props: React.PropsWithChildren<object>
) => {
  const { children } = props;
  const [themeId, setThemeId] = React.useState(ThemeId.LIGHT);
  const themeContextValue = React.useMemo(() => {
    return { themeId, onThemeChange: setThemeId };
  }, [themeId, setThemeId]);

  return (
    <LocalThemeContext.Provider value={themeContextValue}>
      {children}
    </LocalThemeContext.Provider>
  );
};
