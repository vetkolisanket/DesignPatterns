package structural.adapter


class MediaAdapter: MediaPlayer {

    private val advancedMediaPlayer = GomPlayer()

    override fun play(audioType: String, fileName: String) {
        when (audioType) {
            MP4 -> advancedMediaPlayer.playMp4(fileName)
            VLC -> advancedMediaPlayer.playVlc(fileName)
            else -> println("Invalid media. $audioType not supported")
        }
    }
}