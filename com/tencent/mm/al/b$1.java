package com.tencent.mm.al;

import android.os.Looper;
import android.os.Message;
import com.tencent.mars.BaseEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.at;

final class b$1 extends ak
{
  b$1(b paramb, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(78030);
    if (at.isConnected(ah.getContext()))
    {
      ab.i("MicroMsg.CdnTransportService", "cdntra mm on network change to get dns.");
      h.pYm.a(546L, 5L, 1L, true);
      BaseEvent.onNetworkChange();
    }
    AppMethodBeat.o(78030);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.al.b.1
 * JD-Core Version:    0.6.2
 */