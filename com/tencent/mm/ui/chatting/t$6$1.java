package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.plugin.downloader.model.e.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class t$6$1
  implements Runnable
{
  t$6$1(t.6 param6)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(30740);
    if ((!bo.isNullOrNil(this.yKg.yKf.pzK)) && (!bo.isNullOrNil(this.yKg.yKf.pzL)))
    {
      t localt = this.yKg.yKf;
      ab.i("MicroMsg.ChattingQQMailFooterHandler", "dz[downloadQQMail]");
      e.a locala = new e.a();
      locala.It(localt.pzK);
      locala.Iv(localt.mContext.getResources().getString(2131298931));
      locala.Iw(localt.pzL);
      locala.ga(true);
      locala.tN(1);
      localt.lwo = d.bij().a(locala.kNl);
      if (localt.lwo > 0L)
      {
        localt.ehZ = localt.mContext.getSharedPreferences("QQMAIL", h.Mu());
        localt.ehZ.edit().putLong("qqmail_downloadid", localt.lwo).apply();
        localt.dCs();
      }
      AppMethodBeat.o(30740);
    }
    while (true)
    {
      return;
      t.a(this.yKg.yKf);
      AppMethodBeat.o(30740);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.t.6.1
 * JD-Core Version:    0.6.2
 */