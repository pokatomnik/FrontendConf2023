import { User } from "./User";

export const Example11Lists = (props: {
  readonly list: ReadonlyArray<User>;
}) => {
  const { list } = props;
  return (
    <div className={styles.column}>
      {list.map((user) => (
        <div key={user.id} className={styles.row}>
          <span>{user.firstName}</span>
          <span>{user.lastName}</span>
          {user.middleName && <span>{user.middleName}</span>}
        </div>
      ))}
    </div>
  );
};
