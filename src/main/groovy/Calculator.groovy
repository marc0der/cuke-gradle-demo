
/**
 * User: marco
 * Date: 25/07/13
 * Time: 11:05
 */
class Calculator {

    def shell = new GroovyShell()

    String input

    String run(){
        shell.evaluate(input)
    }
}
