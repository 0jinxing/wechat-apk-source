package com.tencent.mm.ui.video;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class VideoView$1
  implements MediaPlayer.OnVideoSizeChangedListener
{
  VideoView$1(VideoView paramVideoView)
  {
  }

  public final void onVideoSizeChanged(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(35283);
    VideoView.a(this.zLo, paramMediaPlayer.getVideoWidth());
    VideoView.b(this.zLo, paramMediaPlayer.getVideoHeight());
    ab.v("MicroMsg.VideoView", "on size change size:( " + VideoView.a(this.zLo) + " , " + VideoView.b(this.zLo) + " )");
    this.zLo.dKx();
    if (VideoView.a(this.zLo) != 0)
      VideoView.b(this.zLo);
    AppMethodBeat.o(35283);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.video.VideoView.1
 * JD-Core Version:    0.6.2
 */