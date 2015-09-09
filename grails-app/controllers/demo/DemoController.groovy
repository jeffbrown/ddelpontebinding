package demo

class DemoController {

    def doSomethingCool(ResendEmailCommand command) {
        render "Sale Code: ${command.saleCode}"
    }
}

class ResendEmailCommand {
    String saleCode

    static constraints = {
        saleCode nullable: false
    }
}
