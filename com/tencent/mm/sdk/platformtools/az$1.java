package com.tencent.mm.sdk.platformtools;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class az$1 extends ak
{
  az$1(az paramaz, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(52232);
    if ((paramMessage != null) && (paramMessage.obj != null))
      ((az.a)paramMessage.obj).acg();
    AppMethodBeat.o(52232);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.az.1
 * JD-Core Version:    0.6.2
 */