Feature: Is it divisible for 3 or and 5?
    Checking if number is divisible for 3 and or 5

    Scenario Outline: Number is or isn't divisible for 3 or and 5
        Given number is <number>
        When I ask whether it's divisible for 3 or and 5
        Then It should be returned <result>
        Examples:
            | number | result |
            | 3 | "Fizz" |
            | 5 | "Buzz" |
            | 15 | "FizzBuzz" |
            | 25 | "Buzz" |
            | 69 | "Fizz" |
            | 30 | "FizzBuzz" |
            | 29 | "None" |