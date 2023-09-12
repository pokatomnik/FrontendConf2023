const Example03Composable = (props: {
  readonly title: string;
  readonly onClick: () => void;
}) => {
  const { onClick, title } = props;
  return (
    <div className={styles.row}>
      <div className={styles.col}>
        <span>{title}</span>
      </div>
      <div className={styles.col}>
        <button onClick={onClick}>Нажми меня!</button>
      </div>
    </div>
  );
};
