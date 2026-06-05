class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

class CustomExceptionDemo {
    public static void main(String[] args) {
        int age = 16;

        try {
            if(age < 18)
                throw new InvalidAgeException("Age must be 18 or above");
            else
                System.out.println("Valid Age");
        }
        catch(InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}21