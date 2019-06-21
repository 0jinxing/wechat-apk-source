package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Timer;
import java.util.TimerTask;

final class JsApiBatchGetContact$JsApiBatchGetContactTask$1$1 extends TimerTask
{
  JsApiBatchGetContact$JsApiBatchGetContactTask$1$1(JsApiBatchGetContact.JsApiBatchGetContactTask.1 param1, boolean[] paramArrayOfBoolean, Timer paramTimer)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130392);
    try
    {
      if (this.hwC[0] != 0)
        ab.i("MicroMsg.JsApiBatchGetContact", "isCallBacked");
      while (true)
      {
        cancel();
        this.hwD.cancel();
        AppMethodBeat.o(130392);
        return;
        this.hwC[0] = true;
        ab.w("MicroMsg.JsApiBatchGetContact", "get contact timeout");
        JsApiBatchGetContact.JsApiBatchGetContactTask.a(this.hwE.hwB, "fail:get contact timeout");
        JsApiBatchGetContact.JsApiBatchGetContactTask.a(this.hwE.hwB);
      }
    }
    finally
    {
      AppMethodBeat.o(130392);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiBatchGetContact.JsApiBatchGetContactTask.1.1
 * JD-Core Version:    0.6.2
 */