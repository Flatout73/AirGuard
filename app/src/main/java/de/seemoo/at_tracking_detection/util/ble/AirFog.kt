package de.seemoo.at_tracking_detection.util.ble

data class AirFog(
    val deviceId: String,
    val macAddress: String?,
    val location: AirLocation?,
    var advertisementData: ByteArray?
)