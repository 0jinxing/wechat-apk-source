package com.google.android.exoplayer2.video;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.OnFrameRenderedListener;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;

@TargetApi(23)
final class c$b
  implements MediaCodec.OnFrameRenderedListener
{
  private c$b(c paramc, MediaCodec paramMediaCodec)
  {
    AppMethodBeat.i(95996);
    paramMediaCodec.setOnFrameRenderedListener(this, new Handler());
    AppMethodBeat.o(95996);
  }

  public final void onFrameRendered(MediaCodec paramMediaCodec, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(95997);
    if (this != this.bsK.bsG)
      AppMethodBeat.o(95997);
    while (true)
    {
      return;
      this.bsK.tU();
      AppMethodBeat.o(95997);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.video.c.b
 * JD-Core Version:    0.6.2
 */