package com.tencent.mm.plugin.scanner.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.modelgeo.d;
import com.tencent.mm.modelstat.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;

final class q$1
  implements b.a
{
  q$1(q paramq)
  {
  }

  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    AppMethodBeat.i(81239);
    ab.i("MicroMsg.scanner.ScanModeStreetView", "onGetLocation %s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (!paramBoolean)
    {
      ab.i("MicroMsg.scanner.ScanModeStreetView", "check permission not passed!");
      if ((!q.a(this.qfG)) && (!d.agA()) && (this.qfG.qet != null))
      {
        q.b(this.qfG);
        h.a(this.qfG.qet.getContext(), this.qfG.qet.getContext().getString(2131300421), this.qfG.qet.getContext().getString(2131297061), this.qfG.qet.getContext().getString(2131300878), this.qfG.qet.getContext().getString(2131296868), false, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(81238);
            d.bX(q.1.this.qfG.qet.getContext());
            AppMethodBeat.o(81238);
          }
        }
        , null);
      }
      paramBoolean = true;
      AppMethodBeat.o(81239);
    }
    while (true)
    {
      return paramBoolean;
      q.a(this.qfG, paramFloat2);
      q.b(this.qfG, paramFloat1);
      q.a(this.qfG, (int)paramDouble2);
      q.a(this.qfG, "");
      q.b(this.qfG, "");
      q.b(this.qfG, paramInt);
      q.c(this.qfG);
      q.d(this.qfG);
      if (!q.e(this.qfG))
      {
        q.f(this.qfG);
        o.a(2012, paramFloat1, paramFloat2, (int)paramDouble2);
      }
      paramBoolean = false;
      AppMethodBeat.o(81239);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.q.1
 * JD-Core Version:    0.6.2
 */