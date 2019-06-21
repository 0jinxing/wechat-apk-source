package com.tencent.mm.plugin.topstory;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class c$1 extends ak
{
  c$1(c paramc, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(65492);
    switch (paramMessage.what)
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(65492);
      return;
      ((c.a)paramMessage.obj).run();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.c.1
 * JD-Core Version:    0.6.2
 */