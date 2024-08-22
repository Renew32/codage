/********************** Q2-Devoir2 ITI1521 *********/
class Calculator {
  private double first, second; // two calculator operands
  private String oP;

  Calculator() {
  };

  void operation(String str) {
    first = second; // keep first operand
    second = 0; // initialize and get ready for second operand
    oP = str;
  }

  void add() {
    operation("+");
  }

  void subtract() {
    operation("-");
    // VOTRE CODE VIENT ICI
  }

  void multiply() {
    operation("*");
    // VOTRE CODE VIENT ICI
  }

  void divide() {
    operation("/");
    // VOTRE CODE VIENT ICI
  }

  void factorial() {
    operation("!");
    // VOTRE CODE VIENT ICI
  }

  void pow() {
    operation("^");
    // VOTRE CODE VIENT ICI
  }

  void rootSquare() {
    operation("sqrt");
    // VOTRE CODE VIENT ICI
  }

  void nepLog() {
    operation("ln");
    // VOTRE CODE VIENT ICI
  }

  void compute() {

    // VOTRE CODE VIENT ICI

    if (oP == "+") {
      second = first + second;
    }

    if (oP == "-") {
      second = first - second;
    }

    if (oP == "*") {
      second = first * second;
    }

    if (oP == "/") {
      second = first / second;
    }

    if (oP == "^") {
      second = Math.pow(first, second);
    }

    if (oP == "sqrt") {
      second = Math.sqrt(first);
    }

    if (oP == "ln") {
      second = Math.log(first);
    }

    if (oP == "!") {
      second = (Math.sqrt(2 * Math.PI * first) * Math.pow(first / 2.718, first)) * (1 + (1 / (12 * first)));
    }

  }

  void clear() {
    first = 0;
    second = 0;
    oP = null;
    // VOTRE CODE VIENT ICI
  }

  double display() {
    compute();
    return second;
    // VOTRE CODE VIENT ICI
  }

  /*
   * AUTRES METHODES SI NECESSAIRE
   */

}
