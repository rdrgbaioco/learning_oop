package topics.abstracoes

data class Intent(val code: Int = 0, val data: String = "")

interface IntentReceive {
    fun onNewIntent(intent: Intent)
}

interface IntentResponse {
    fun finish(intent: Intent)
}

interface IntentHandler : IntentReceive, IntentResponse {
    fun stopService()
}

class IntentX : IntentHandler {
    override fun onNewIntent(intent: Intent) {
        println("Task with new intent")
    }

    override fun finish(intent: Intent) {
        println("Finish the intent")
    }

    override fun stopService() {
        println("Stoping the service")
    }
}
