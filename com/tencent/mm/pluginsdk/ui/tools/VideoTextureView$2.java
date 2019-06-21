package com.tencent.mm.pluginsdk.ui.tools;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class VideoTextureView$2
  implements MediaPlayer.OnVideoSizeChangedListener
{
  VideoTextureView$2(VideoTextureView paramVideoTextureView)
  {
  }

  public final void onVideoSizeChanged(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(118010);
    try
    {
      if (paramMediaPlayer != VideoTextureView.a(this.vvO))
      {
        ab.w("MicroMsg.VideoTextureView", "another player on video size changed, return now.[%s, %s]", new Object[] { paramMediaPlayer, VideoTextureView.a(this.vvO) });
        AppMethodBeat.o(118010);
      }
      while (true)
      {
        return;
        VideoTextureView.a(this.vvO, paramMediaPlayer.getVideoWidth());
        VideoTextureView.b(this.vvO, paramMediaPlayer.getVideoHeight());
        paramMediaPlayer = new java/lang/StringBuilder;
        paramMediaPlayer.<init>("on size change size:( ");
        ab.i("MicroMsg.VideoTextureView", VideoTextureView.b(this.vvO) + " , " + VideoTextureView.c(this.vvO) + " )");
        if (VideoTextureView.d(this.vvO) != null)
          VideoTextureView.d(this.vvO).dH(VideoTextureView.b(this.vvO), VideoTextureView.c(this.vvO));
        VideoTextureView.e(this.vvO);
        AppMethodBeat.o(118010);
      }
    }
    catch (Exception paramMediaPlayer)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.VideoTextureView", paramMediaPlayer, "on video size changed error[%d, %d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.VideoTextureView.2
 * JD-Core Version:    0.6.2
 */