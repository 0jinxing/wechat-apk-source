package com.tencent.mm.plugin.game.f;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.g;
import com.tencent.mm.at.a.d.b;
import com.tencent.mm.g.a.gz;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.b.a;

final class c$3
  implements g
{
  c$3(gz paramgz)
  {
  }

  public final Bitmap a(String paramString, View paramView, b paramb)
  {
    return null;
  }

  public final void b(String paramString, View paramView, b paramb)
  {
    AppMethodBeat.i(112295);
    this.nnz.cBH.Cn = 2;
    this.nnz.cBH.url = paramString;
    a.xxA.m(this.nnz);
    if (paramb == null)
      AppMethodBeat.o(112295);
    while (true)
    {
      return;
      int i = paramb.from;
      if ((paramb.status == 0) && (paramb.bitmap != null))
      {
        if (i == 2)
        {
          h.pYm.a(858L, 13L, 1L, false);
          AppMethodBeat.o(112295);
        }
      }
      else
      {
        if (i == 2)
          h.pYm.a(858L, 14L, 1L, false);
        AppMethodBeat.o(112295);
      }
    }
  }

  public final void sH(String paramString)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.f.c.3
 * JD-Core Version:    0.6.2
 */