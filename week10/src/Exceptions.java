public class Exceptions {
    public static void main(String args[]) {
        // Contrived example to show exception handling.
        try {
            int number = randomNumber(10);
        } catch(BadlyGeneratedNumberException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    public static int randomNumber(int value) throws BadlyGeneratedNumberException {
        int output = (int)(Math.random() * value);

        if (output > value / 2) {
            throw new BadlyGeneratedNumberException();
        } else {
            return output;
        }
    }
}

class BadlyGeneratedNumberException extends Exception {
    public String getMessage() {
        return "The generated number was larger than half the input";
    }
}
