package com.tencent.mm.pluginsdk.ui.tools;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class VideoTextureView$3
  implements MediaPlayer.OnPreparedListener
{
  VideoTextureView$3(VideoTextureView paramVideoTextureView)
  {
  }

  public final void onPrepared(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(118011);
    if ((paramMediaPlayer != VideoTextureView.a(this.vvO)) && (paramMediaPlayer != null))
    {
      ab.w("MicroMsg.VideoTextureView", "another player callback, release now.[%s, %s]", new Object[] { paramMediaPlayer, VideoTextureView.a(this.vvO) });
      VideoTextureView.a(this.vvO, paramMediaPlayer);
      AppMethodBeat.o(118011);
      return;
    }
    VideoTextureView.f(this.vvO);
    VideoTextureView localVideoTextureView = this.vvO;
    int i;
    if (paramMediaPlayer != null)
    {
      i = paramMediaPlayer.getVideoWidth();
      label81: VideoTextureView.a(localVideoTextureView, i);
      localVideoTextureView = this.vvO;
      if (paramMediaPlayer == null)
        break label264;
      i = paramMediaPlayer.getVideoHeight();
      label101: VideoTextureView.b(localVideoTextureView, i);
      ab.i("MicroMsg.VideoTextureView", "on prepared. size [%d, %d] mStartWhenPrepared %b ", new Object[] { Integer.valueOf(VideoTextureView.b(this.vvO)), Integer.valueOf(VideoTextureView.c(this.vvO)), Boolean.valueOf(VideoTextureView.g(this.vvO)) });
      VideoTextureView.e(this.vvO);
      if ((VideoTextureView.b(this.vvO) == 0) || (VideoTextureView.c(this.vvO) == 0))
        break label269;
      if (VideoTextureView.g(this.vvO))
      {
        VideoTextureView.a(this.vvO).start();
        VideoTextureView.a(this.vvO).setLooping(VideoTextureView.h(this.vvO));
        VideoTextureView.i(this.vvO);
      }
    }
    while (true)
    {
      if (VideoTextureView.d(this.vvO) != null)
        VideoTextureView.d(this.vvO).pL();
      AppMethodBeat.o(118011);
      break;
      i = 0;
      break label81;
      label264: i = 0;
      break label101;
      label269: if (VideoTextureView.g(this.vvO))
      {
        VideoTextureView.a(this.vvO).start();
        VideoTextureView.i(this.vvO);
        VideoTextureView.a(this.vvO).setLooping(VideoTextureView.h(this.vvO));
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.VideoTextureView.3
 * JD-Core Version:    0.6.2
 */