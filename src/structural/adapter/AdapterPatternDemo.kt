package structural.adapter

const val MP3 = "MP3"
const val MP4 = "MP4"
const val VLC = "VLC"

fun main() {
    val audioPlayer = AudioPlayer()

    audioPlayer.play(MP3, "beyond the horizon.mp3")
    audioPlayer.play(MP4, "alone.mp4")
    audioPlayer.play(VLC, "far far away.vlc")
    audioPlayer.play("AVI", "mind me.avi")
}