package com.tencent.mm.plugin.facedetect.d;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class d$1 extends ak
{
  d$1(d paramd, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(309);
    super.handleMessage(paramMessage);
    switch (paramMessage.what)
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(309);
      return;
      ab.i("MicroMsg.NumberFaceMotion", "hy: refresh number");
      this.lVO.btd();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.d.d.1
 * JD-Core Version:    0.6.2
 */