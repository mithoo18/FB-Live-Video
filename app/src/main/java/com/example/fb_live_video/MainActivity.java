package com.example.fb_live_video;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webview;
        VideoView videoView;
//        1  USING WEBVIEW


        webview = (WebView) findViewById(R.id.webview);
//        String html = "<iframe src=\"https://www.facebook.com/plugins/video.php?href=https://www.facebook.com/Prophetnanayawsarfoh/live\" ></iframe>";
        String html = "<iframe src=\"https://www.facebook.com/plugins/video.php?href=https://www.facebook.com/cityspideyneighborhood/live\" ></iframe>";

        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadData(html, "text/html", null);
//        String html = "<iframe src=\"https://www.facebook.com/plugins/video.php?href=https://www.facebook.com/cityspideyneighborhood/videos/1113059232519188/?__so__=serp_videos_tab\" ></iframe>";



        //1  USING WEBVIEW
//        Uri url = Uri.parse("https://www.facebook.com/plugins/video.php?href=https://www.facebook.com/aajtak/liveV");
//        videoView = (VideoView) findViewById(R.id.view);
//        MediaController controller = new MediaController(this);
//        videoView.setVideoURI(url);
////      videoView.setVideoPath(url);
//        videoView.setMediaController(controller);
//        videoView.start();
        //
//        Uri url=Uri.parse("https://www.facebook.com/kabirkprank/videos/537765337569789");
//        VideoView video = (VideoView)findViewById(R.id.view);
//        MediaController controller = new MediaController(this);
//        video.setVideoURI(url);
//        video.setMediaController(controller);
//        video.start();
//
//        Uri uri = Uri.parse("/ui/wp-content/uploads/2016/04/videoviewtestingvideo.mp4");
//        VideoView simpleVideoView = (VideoView) findViewById(R.id.view); // initiate a video view
//        simpleVideoView.setVideoURI(uri);
//        simpleVideoView.start();

//        VideoView video;
//            setContentView(R.layout.activity_main);
//            videoview = (VideoView) findViewById(R.id.view);
////            videoview.setVideoPath( "https://www.android-examples.com/wp-content/uploads/2016/01/sample_video.3gp");
//            videoview.setVideoPath( "https://www.facebook.com/plugins/video.php?href=https%3A%2F%2Fwww.facebook.com%2FZeeHindustan%2Flive");
////        https://www.facebook.com/plugins/video.php?href=https%3A%2F%2Fwww.facebook.com%2FZeeHindustan%2Flive
//            videoview.start();

//        video = (VideoView) findViewById(R.id.view);

//        Uri uri = Uri.parse("http://techslides.com/demos/sample-videos/small.mp4");
//        video.setMediaController(new MediaController(this));
//        video.setVideoURI(uri);
//        video.requestFocus();
//        video.start();
//
//        video = (VideoView) findViewById(R.id.view);

//        Uri uri = Uri.parse("https://www.facebook.com/plugins/video.php?href=https%3A%2F%2Fwww.facebook.com%2FZeeHindustan%2Flive");
//        Uri uri = Uri.parse("https://www.facebook.com/kabirkprank/videos/537765337569789?redirect=false");
//
//        video.setMediaController(new MediaController(this));
//        video.setVideoURI(uri);
//        video.requestFocus();
//        video.start();
//
//


         }
}