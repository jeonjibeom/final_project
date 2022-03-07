package com.cookandroid.myfinal2

import android.app.Activity
import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.second.*

class SecondActivitty : Activity(){

    private val VIDEO_URL = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second)

        // 에뮬레이터로 확인하려면 내 프로젝트에 동영상 파일이 있어야 됨
        val VIDEO_PATH = "android.resource://" + packageName + "/" + R.raw.squat

        var uri: Uri = Uri.parse(VIDEO_PATH)
        videoView.setVideoURI(uri)
        videoView.setMediaController(MediaController(this))     // 없으면 에러
        videoView.requestFocus()    // 준비하는 과정을 미리함

        videoView.setOnPreparedListener {
            Toast.makeText(applicationContext, "동영상 재생 준비 완료", Toast.LENGTH_SHORT).show()
            videoView.start()       // 동영상 재개
        }

        videoView.setOnCompletionListener {
            Toast.makeText(applicationContext, "동영상 시청 완료", Toast.LENGTH_SHORT).show()
        }

        btnStart.setOnClickListener {
            videoView.start()       // 동영상 재개
        }

        btnResume.setOnClickListener {
            videoView.resume()      // 동영상 처음부터 재시작
        }

        btnPause.setOnClickListener {
            videoView.pause()       // 동영상 일시정지 (Start 버튼 클릭하면 재개)
        }

        btnStop.setOnClickListener {
            videoView.pause()
            videoView.stopPlayback()    // 동영상 정지 (Resume 버튼 클릭하면 새로 실행)
        }

    }
}