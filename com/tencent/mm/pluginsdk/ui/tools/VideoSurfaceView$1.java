package com.tencent.mm.pluginsdk.ui.tools;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class VideoSurfaceView$1
  implements MediaPlayer.OnVideoSizeChangedListener
{
  VideoSurfaceView$1(VideoSurfaceView paramVideoSurfaceView)
  {
  }

  public final void onVideoSizeChanged(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(70440);
    VideoSurfaceView.a(this.vvG, paramMediaPlayer.getVideoWidth());
    VideoSurfaceView.b(this.vvG, paramMediaPlayer.getVideoHeight());
    ab.v("MicroMsg.VideoSurfaceView", "on size change size:( " + VideoSurfaceView.a(this.vvG) + " , " + VideoSurfaceView.b(this.vvG) + " )");
    VideoSurfaceView.c(this.vvG);
    AppMethodBeat.o(70440);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView.1
 * JD-Core Version:    0.6.2
 */