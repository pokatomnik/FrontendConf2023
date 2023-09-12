const Example07Memoization = (props: {
  readonly list: ReadonlyArray<number>;
}) => {
  const { list } = props;
  const total = React.useMemo(() => {
    return list.reduce((total, value) => total + value, 0);
  }, [list]);
  return (
    <div>
      <span>Всего: {total}</span>
    </div>
  );
};
