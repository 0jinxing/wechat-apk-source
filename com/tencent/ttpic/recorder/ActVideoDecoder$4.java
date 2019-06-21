package com.tencent.ttpic.recorder;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;

class ActVideoDecoder$4
  implements Runnable
{
  ActVideoDecoder$4(ActVideoDecoder paramActVideoDecoder)
  {
  }

  public void run()
  {
    AppMethodBeat.i(83680);
    if (ActVideoDecoder.access$000(this.this$0) != null)
      ActVideoDecoder.access$000(this.this$0).release();
    ActVideoDecoder.access$1400(this.this$0).getLooper().quit();
    ActVideoDecoder.access$1402(this.this$0, null);
    AppMethodBeat.o(83680);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.recorder.ActVideoDecoder.4
 * JD-Core Version:    0.6.2
 */