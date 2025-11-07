package Exception;
class InvalidRollNumberException extends RuntimeException
{
    InvalidRollNumberException(String msg)
    {
        super(msg);
    }
}
class ThrowInException {

    public static void main(String[] args) throws InvalidRollNumberException
    {
        InvalidRollNumberException obj = null;
        InvalidRollNumberException obj1 = new InvalidRollNumberException(("wrong roll number"));
       throw obj;
    }
}
