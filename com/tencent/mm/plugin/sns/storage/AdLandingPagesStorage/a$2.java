package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;

final class a$2 extends ak
{
  a$2(a parama, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(36927);
    if (paramMessage.what == 10008)
    {
      ab.i("MicroMsg.AdDownloadApkMgr", "unregister package receiver");
      ah.getContext().unregisterReceiver(this.qVG.qVz);
      this.qVG.qVA = false;
    }
    AppMethodBeat.o(36927);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a.2
 * JD-Core Version:    0.6.2
 */