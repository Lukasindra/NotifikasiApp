class SMSNotification(private val phoneNumber: String) : NotificationAction {
    override fun sendNotification(msg: String) {
        println("[SMS] Mengirim ke nomor: $phoneNumber")
        println("Isi Pesan       : $msg")
        println("--------------------------------------------------")
    }
}