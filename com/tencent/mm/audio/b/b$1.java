package com.tencent.mm.audio.b;

import android.media.MediaRecorder;
import android.media.MediaRecorder.OnErrorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$1
  implements MediaRecorder.OnErrorListener
{
  b$1(b paramb)
  {
  }

  public final void onError(MediaRecorder paramMediaRecorder, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(116473);
    if (b.a(this.cpi) != null)
      b.a(this.cpi).onError();
    try
    {
      b.b(this.cpi).release();
      b.a(this.cpi, b.b.cpn);
      AppMethodBeat.o(116473);
      return;
    }
    catch (Exception paramMediaRecorder)
    {
      while (true)
        ab.e("MicroMsg.MMAudioRecorder", paramMediaRecorder.getMessage());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.b.b.1
 * JD-Core Version:    0.6.2
 */