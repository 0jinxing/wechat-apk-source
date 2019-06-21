package com.tencent.mm.plugin.appbrand.widget.input.c;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class a$1 extends ak
{
  a$1(a parama, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(77442);
    if (1000 == paramMessage.what)
    {
      String str = (String)paramMessage.obj;
      int i = paramMessage.arg1;
      if (this.jio.jin != null)
        this.jio.jin.bh(str, i);
    }
    AppMethodBeat.o(77442);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.c.a.1
 * JD-Core Version:    0.6.2
 */