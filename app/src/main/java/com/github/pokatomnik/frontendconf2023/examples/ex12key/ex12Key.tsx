const StatefulInput = () => {
  const [value, setValue] = React.useState("");
  return <input value={value} onChange={(e) => setValue(e.target.value)} />;
};

const Example12Key = () => {
  const [inputKey, setInputKey] = React.useState(0);
  const updateKey = () => {
    setInputKey(inputKey + 1);
  };
  return (
    <div className={styles.row}>
      <StatefulInput key={inputKey} />
      <button onClick={updateKey}>Refresh</button>
    </div>
  );
};
