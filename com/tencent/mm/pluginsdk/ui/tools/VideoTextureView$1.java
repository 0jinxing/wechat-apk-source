package com.tencent.mm.pluginsdk.ui.tools;

import android.media.MediaPlayer;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class VideoTextureView$1 extends Thread
{
  VideoTextureView$1(VideoTextureView paramVideoTextureView, MediaPlayer paramMediaPlayer)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(118009);
    try
    {
      if (this.kBW != null)
      {
        ab.i("MicroMsg.VideoTextureView", "%d another thread to release player[%s]", new Object[] { Integer.valueOf(this.vvO.hashCode()), this.kBW });
        this.kBW.stop();
        this.kBW.release();
      }
      AppMethodBeat.o(118009);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(118009);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.VideoTextureView.1
 * JD-Core Version:    0.6.2
 */