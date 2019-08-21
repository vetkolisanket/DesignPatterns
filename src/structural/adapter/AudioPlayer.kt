package structural.adapter

class AudioPlayer: MediaPlayer {

    private val adapter by lazy { MediaAdapter() }

    override fun play(audioType: String, fileName: String) {
        when (audioType) {
            MP3 -> println("Playing mp3 file Name: $fileName")
            else -> adapter.play(audioType, fileName)
        }
    }
}