package structural.adapter

class GomPlayer: AdvancedMediaPlayer {



    override fun playVlc(fileName: String) {
        println("Playing vlc file Name: $fileName")
    }

    override fun playMp4(fileName: String) {
        println("Playing mp4 file Name: $fileName")
    }
}