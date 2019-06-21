package com.tencent.mm.plugin.mmsight.model.a;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class n$2 extends ak
{
  n$2(n paramn, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(76630);
    ab.i("MicroMsg.MMSightMediaCodecMP4MuxRecorder", "carson：writeYuvData ");
    if (paramMessage.what == 1)
    {
      paramMessage = (byte[])paramMessage.obj;
      if ((paramMessage != null) && (this.owL.owH != null))
        n.a(this.owL, paramMessage);
    }
    AppMethodBeat.o(76630);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.n.2
 * JD-Core Version:    0.6.2
 */