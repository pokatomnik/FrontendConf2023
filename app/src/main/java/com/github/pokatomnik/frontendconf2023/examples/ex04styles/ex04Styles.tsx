const Example04Styles = (props: {
  readonly title: string;
  readonly className: string;
  readonly onClick: () => void;
}) => {
  const { onClick, title, className } = props;
  return (
    <div className={`${styles.row} ${className}`}>
      <div className={styles.col}>
        <span>{title}</span>
      </div>
      <div className={styles.col}>
        <button onClick={onClick}>Нажми меня!</button>
      </div>
    </div>
  );
};
