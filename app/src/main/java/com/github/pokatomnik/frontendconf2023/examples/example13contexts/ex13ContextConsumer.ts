import { localThemeContext } from "./ex13Context";

export const useTheme = () => {
  return React.useContext(localThemeContext);
};
