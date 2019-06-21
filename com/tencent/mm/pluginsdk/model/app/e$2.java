package com.tencent.mm.pluginsdk.model.app;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.s.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.List;

final class e$2 extends ak
{
  e$2(e parame, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(79243);
    v localv = (v)paramMessage.obj;
    paramMessage = new r(localv.appId, localv.fOZ);
    if (this.vbP.vbN.contains(paramMessage))
    {
      this.vbP.vbN.remove(paramMessage);
      if (!a.bYJ().e(localv.appId, localv.data, localv.fOZ))
        ab.e("MicroMsg.AppIconService", "handleMessage, saveIcon fail");
    }
    while (this.vbP.qoT.size() > 0)
    {
      paramMessage = (r)this.vbP.qoT.remove(0);
      if (this.vbP.a(paramMessage))
      {
        this.vbP.vbN.add(paramMessage);
        AppMethodBeat.o(79243);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(79243);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.e.2
 * JD-Core Version:    0.6.2
 */