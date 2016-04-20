package makhluk2;

import java.io.IOException;
/**
 * a class that being used to call a windows system call named "cls" to clear the console screen
 * 
 * @author Harry Alvin
 */
class CLS {
    /**
     * Constructor of CLS Class that runs the "cls" windows system call
     */
    public CLS() {}
    /**
     * Method to create a process in windows using processBuilder method.
     * Affects to the call of "cls" windows system call
     * @throws IOException throws an exception error message when IOException is detected
     * @throws InterruptedException throws an exception error message when InterruptedException
     */
    public void clear() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}