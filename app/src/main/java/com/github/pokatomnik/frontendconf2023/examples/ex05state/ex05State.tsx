export const Example05State = () => {
  const [clicked, setClicks] = React.useState(0);
  const incrementClicks = () => setClicks(clicked + 1);
  return (
    <button onClick={incrementClicks}>
      <span>Кликнуто {clicked} раз</span>
    </button>
  );
};
