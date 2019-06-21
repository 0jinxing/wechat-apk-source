package com.tencent.mm.ui.video;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VideoView$3
  implements MediaPlayer.OnCompletionListener
{
  VideoView$3(VideoView paramVideoView)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(35285);
    if (VideoView.n(this.zLo) != null)
      VideoView.n(this.zLo).onCompletion(VideoView.e(this.zLo));
    AppMethodBeat.o(35285);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.video.VideoView.3
 * JD-Core Version:    0.6.2
 */