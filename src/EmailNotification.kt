class EmailNotification(private val emailAddress: String) : NotificationAction {
    override fun sendNotification(msg: String) {
        println("[EMAIL] Mengirim ke: $emailAddress")
        println("Isi Pesan  : $msg")
        println("--------------------------------------------------")
    }
}