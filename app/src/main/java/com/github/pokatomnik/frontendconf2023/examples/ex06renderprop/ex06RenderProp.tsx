namespace React {
  export declare type Node = {};
}

export const Example06RenderProp = <
  T extends unknown & {}
>(props: {
  readonly initialState: T;
  readonly children: (
    value: T,
    setValue: (value: T) => void
  ) => React.Node;
}) => {
  const { initialState, children } = props;
  const [value, setValue] = React.useState(initialState);
  return <div>{children(value, setValue)}</div>;
};
