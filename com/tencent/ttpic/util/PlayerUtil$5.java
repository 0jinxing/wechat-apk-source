package com.tencent.ttpic.util;

import android.media.MediaRecorder;
import android.media.MediaRecorder.OnErrorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class PlayerUtil$5
  implements MediaRecorder.OnErrorListener
{
  public final void onError(MediaRecorder paramMediaRecorder, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(50275);
    PlayerUtil.destroyRecorder((PlayerUtil.Recorder)paramMediaRecorder);
    AppMethodBeat.o(50275);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.PlayerUtil.5
 * JD-Core Version:    0.6.2
 */