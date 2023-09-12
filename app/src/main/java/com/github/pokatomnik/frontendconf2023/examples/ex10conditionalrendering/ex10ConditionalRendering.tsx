export const Example10ConditionalRendering = (props: {
  readonly userName?: string | null;
  readonly total?: number | null;
}) => {
  const { userName, total } = props;
  return (
    <div className={styles.header}>
      {userName !== null && userName !== undefined && <span>{userName}</span>}
      <span>
        {total === null || total === undefined ? "Empty" : `Total: ${total}`}
      </span>
    </div>
  );
};
