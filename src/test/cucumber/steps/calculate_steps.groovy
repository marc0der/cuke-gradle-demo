import static cucumber.api.groovy.EN.*

Given(~'^the input "([^"]*)"$') { String input ->
    calculator = new Calculator(input:input)
}

When(~'^the calculator is run$') {->
    result = calculator.run()
}


Then(~'^the output should be "([^"]*)"$') { String output ->
    assert result == output
}