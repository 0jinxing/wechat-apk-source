package com.tencent.mm.plugin.sysvideo.ui.video;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.video.VideoView;

final class VideoRecorderPreviewUI$3
  implements MediaPlayer.OnErrorListener
{
  VideoRecorderPreviewUI$3(VideoRecorderPreviewUI paramVideoRecorderPreviewUI)
  {
  }

  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(25632);
    VideoRecorderPreviewUI.a(this.swE).stopPlayback();
    h.g(this.swE, 2131304265, 2131304263);
    AppMethodBeat.o(25632);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sysvideo.ui.video.VideoRecorderPreviewUI.3
 * JD-Core Version:    0.6.2
 */