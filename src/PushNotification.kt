class PushNotification(private val deviceToken: String) : NotificationAction {
    override fun sendNotification(msg: String) {
        println("[PUSH] Mengirim ke device token: $deviceToken")
        println("Isi Pesan          : $msg")
        println("--------------------------------------------------")
    }
}