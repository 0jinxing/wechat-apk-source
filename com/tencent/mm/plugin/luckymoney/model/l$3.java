package com.tencent.mm.plugin.luckymoney.model;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.g;
import com.tencent.mm.at.a.d.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bo;

final class l$3
  implements g
{
  l$3(l paraml, String paramString, l.a parama)
  {
  }

  public final Bitmap a(String paramString, View paramView, b paramb)
  {
    return null;
  }

  public final void b(String paramString, View paramView, b paramb)
  {
    AppMethodBeat.i(42302);
    ab.i("MicroMsg.LuckyMoneyEnvelopeLogic", "load finish url: %s, %s, %s", new Object[] { paramString, Integer.valueOf(paramb.status), Integer.valueOf(paramb.from) });
    if (paramb.status == 0)
    {
      h.pYm.k(991L, 6L, 1L);
      if (paramb.data != null)
      {
        paramView = ag.w(paramb.data);
        if ((!bo.isNullOrNil(this.iRf)) && (!paramView.equals(this.iRf)))
        {
          ab.i("MicroMsg.LuckyMoneyEnvelopeLogic", "md5 not match: %s, %s", new Object[] { paramView, this.iRf });
          h.pYm.k(991L, 8L, 1L);
          h.pYm.e(16543, new Object[] { paramString, this.iRf, paramView });
        }
      }
    }
    while (true)
    {
      if (this.nXv != null)
        this.nXv.a(paramb.bitmap, 0, paramString);
      AppMethodBeat.o(42302);
      return;
      if (paramb.status == 1)
        h.pYm.k(991L, 7L, 1L);
      else if (paramb.status == 2)
        h.pYm.k(991L, 8L, 1L);
      else if ((paramb.bitmap == null) || (paramb.bitmap.isRecycled()))
        h.pYm.k(991L, 9L, 1L);
    }
  }

  public final void sH(String paramString)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.l.3
 * JD-Core Version:    0.6.2
 */