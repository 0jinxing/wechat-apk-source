package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

final class d$1 extends ak
{
  d$1(d paramd, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(8864);
    switch (paramMessage.what)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(8864);
      while (true)
      {
        return;
        paramMessage = (String)paramMessage.obj;
        if (!bo.isNullOrNil(paramMessage))
          d.b(this.uFI).add(paramMessage);
        d.c(this.uFI);
        AppMethodBeat.o(8864);
      }
      ab.v("MicroMsg.JsApiHandler", "handle msg from wx done, msg = " + paramMessage.obj);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.d.1
 * JD-Core Version:    0.6.2
 */