package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.clean.c.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class CleanMsgUI$5
  implements com.tencent.mm.plugin.clean.c.h
{
  CleanMsgUI$5(CleanMsgUI paramCleanMsgUI)
  {
  }

  public final void dP(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(18802);
    CleanMsgUI.a(this.kyg).setMessage(this.kyg.getString(2131298315, new Object[] { paramInt1 * 100 / paramInt2 + "%" }));
    AppMethodBeat.o(18802);
  }

  public final void hi(final long paramLong)
  {
    AppMethodBeat.i(18803);
    ab.i("MicroMsg.CleanMsgUI", "onDeleteEnd %d ", new Object[] { Long.valueOf(paramLong) });
    al.d(new Runnable()
    {
      public final void run()
      {
        long l1 = 0L;
        AppMethodBeat.i(18801);
        if (CleanMsgUI.a(CleanMsgUI.5.this.kyg) != null)
          CleanMsgUI.a(CleanMsgUI.5.this.kyg).dismiss();
        long l2 = j.bgd().kvX;
        long l3 = j.bgd().kvX - paramLong;
        if (l3 < 0L)
        {
          l2 = j.bgd().kvV - l2;
          l3 = l1;
        }
        for (l1 = l2; ; l1 = j.bgd().kvV - paramLong)
        {
          j.bgd().kvX = l3;
          j.bgd().kvV = l1;
          CleanMsgUI.a(CleanMsgUI.5.this.kyg, j.bgd().kvV, j.bgd().kvW, j.bgd().kvX);
          AppMethodBeat.o(18801);
          return;
        }
      }
    });
    com.tencent.mm.plugin.report.service.h.pYm.a(714L, 13L, 1L, false);
    AppMethodBeat.o(18803);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.fileindexui.CleanMsgUI.5
 * JD-Core Version:    0.6.2
 */