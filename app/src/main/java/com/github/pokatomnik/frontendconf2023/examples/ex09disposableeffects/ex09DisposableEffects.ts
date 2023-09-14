const toastStub = () => {
  // Показываем здесь сообщение
};

interface PubSub {
  subscribe(
    subscriber: (value: String) => void
  ): () => void;
}

const useShowToast = (props: {
  readonly pubSub: PubSub
}) => {
  const { pubSub } = props;
  React.useEffect(() => {
    const unsubscribe = pubSub.subscribe(toastStub);
    return unsubscribe;
  }, [pubSub]);
};
