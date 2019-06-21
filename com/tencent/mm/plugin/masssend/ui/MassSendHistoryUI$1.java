package com.tencent.mm.plugin.masssend.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.a.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.t;

final class MassSendHistoryUI$1
  implements c.e
{
  MassSendHistoryUI$1(MassSendHistoryUI paramMassSendHistoryUI)
  {
  }

  public final String Qw(String paramString)
  {
    AppMethodBeat.i(22794);
    aw.ZK();
    if (!com.tencent.mm.model.c.isSDCardAvailable())
    {
      t.hO(this.ooZ);
      paramString = "";
      AppMethodBeat.o(22794);
    }
    while (true)
    {
      return paramString;
      paramString = bo.nullAsNil(paramString);
      if ((MassSendHistoryUI.a(this.ooZ).isPlaying()) && (paramString.equals(MassSendHistoryUI.b(this.ooZ).ooH)))
      {
        MassSendHistoryUI.bNN();
        this.ooZ.releaseWakeLock();
        MassSendHistoryUI.a(this.ooZ).stop(false);
        paramString = "";
        AppMethodBeat.o(22794);
      }
      else if (MassSendHistoryUI.a(this.ooZ, paramString))
      {
        AppMethodBeat.o(22794);
      }
      else
      {
        paramString = "";
        AppMethodBeat.o(22794);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI.1
 * JD-Core Version:    0.6.2
 */