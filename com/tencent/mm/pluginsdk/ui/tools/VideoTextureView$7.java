package com.tencent.mm.pluginsdk.ui.tools;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class VideoTextureView$7
  implements MediaPlayer.OnCompletionListener
{
  VideoTextureView$7(VideoTextureView paramVideoTextureView)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(118015);
    ab.i("MicroMsg.VideoTextureView", "video on completion");
    VideoTextureView.b(this.vvO, bo.anT());
    if (VideoTextureView.d(this.vvO) != null)
      VideoTextureView.d(this.vvO).EA();
    AppMethodBeat.o(118015);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.VideoTextureView.7
 * JD-Core Version:    0.6.2
 */