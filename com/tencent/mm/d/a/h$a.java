package com.tencent.mm.d.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.eclipsesource.v8.V8ScriptException;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class h$a extends Handler
{
  h$a(h paramh, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void dispatchMessage(Message paramMessage)
  {
    AppMethodBeat.i(113804);
    try
    {
      super.dispatchMessage(paramMessage);
      AppMethodBeat.o(113804);
      return;
    }
    catch (V8ScriptException paramMessage)
    {
      while (true)
      {
        this.chB.c(paramMessage);
        AppMethodBeat.o(113804);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.h.a
 * JD-Core Version:    0.6.2
 */