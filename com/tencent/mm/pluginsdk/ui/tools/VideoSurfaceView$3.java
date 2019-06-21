package com.tencent.mm.pluginsdk.ui.tools;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VideoSurfaceView$3
  implements MediaPlayer.OnCompletionListener
{
  VideoSurfaceView$3(VideoSurfaceView paramVideoSurfaceView)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(70442);
    if (VideoSurfaceView.e(this.vvG) != null)
    {
      VideoSurfaceView.e(this.vvG).dG(VideoSurfaceView.g(this.vvG).getCurrentPosition(), VideoSurfaceView.g(this.vvG).getDuration());
      VideoSurfaceView.e(this.vvG).EA();
    }
    AppMethodBeat.o(70442);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView.3
 * JD-Core Version:    0.6.2
 */