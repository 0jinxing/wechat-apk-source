package com.tencent.mm.ui.video;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VideoView$2
  implements MediaPlayer.OnPreparedListener
{
  VideoView$2(VideoView paramVideoView)
  {
  }

  public final void onPrepared(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(35284);
    VideoView.c(this.zLo);
    if (VideoView.d(this.zLo) != null)
      VideoView.d(this.zLo).onPrepared(VideoView.e(this.zLo));
    VideoView.a(this.zLo, paramMediaPlayer.getVideoWidth());
    VideoView.b(this.zLo, paramMediaPlayer.getVideoHeight());
    this.zLo.dKx();
    if ((VideoView.a(this.zLo) != 0) && (VideoView.b(this.zLo) != 0))
    {
      if (VideoView.f(this.zLo))
      {
        VideoView.e(this.zLo).start();
        VideoView.g(this.zLo);
      }
      if ((VideoView.h(this.zLo) == VideoView.a(this.zLo)) && (VideoView.i(this.zLo) == VideoView.b(this.zLo)))
      {
        if (VideoView.j(this.zLo) != 0)
        {
          VideoView.e(this.zLo).seekTo(VideoView.j(this.zLo));
          VideoView.k(this.zLo);
        }
        if ((VideoView.f(this.zLo)) || (this.zLo.isPlaying()) || (VideoView.j(this.zLo) != 0) || (this.zLo.getCurrentPosition() <= 0));
      }
    }
    while (true)
    {
      if ((VideoView.e(this.zLo).isPlaying()) && (VideoView.l(this.zLo) != null))
      {
        VideoView.l(this.zLo);
        VideoView.m(this.zLo);
      }
      AppMethodBeat.o(35284);
      return;
      if (VideoView.j(this.zLo) != 0)
      {
        VideoView.e(this.zLo).seekTo(VideoView.j(this.zLo));
        VideoView.k(this.zLo);
      }
      if (VideoView.f(this.zLo))
      {
        VideoView.e(this.zLo).start();
        VideoView.g(this.zLo);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.video.VideoView.2
 * JD-Core Version:    0.6.2
 */