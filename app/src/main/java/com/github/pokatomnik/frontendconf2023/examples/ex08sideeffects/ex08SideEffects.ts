const toastStub = (message: string) => {
  // Показываем здесь сообщение
};

export const useToast = (props: {
  readonly message: string
}) => {
  const { message } = props;
  React.useEffect(() => {
    toastStub(message);
  }, [message]);
};
