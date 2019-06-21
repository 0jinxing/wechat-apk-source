package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.am.a;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.sdk.platformtools.ak;

final class r$1
  implements View.OnClickListener
{
  r$1(r paramr)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38235);
    if (r.a(this.riS) == null)
    {
      AppMethodBeat.o(38235);
      return;
    }
    if (r.a(this.riS).field_likeFlag == 0)
      if (r.a(this.riS).cqT())
      {
        am.a.a(r.a(this.riS), 1, "", "", r.b(this.riS));
        label70: r.a(this.riS).field_likeFlag = 1;
        af.cnF().B(r.a(this.riS));
        label95: if (r.a(this.riS).field_snsId != 0L)
          break label272;
      }
    label272: for (paramView = ""; ; paramView = i.jV(r.a(this.riS).field_snsId))
    {
      h.pYm.e(11989, new Object[] { Integer.valueOf(1), paramView, Integer.valueOf(0) });
      new ak().postDelayed(new r.1.1(this), 500L);
      AppMethodBeat.o(38235);
      break;
      am.a.a(r.a(this.riS).field_userName, 5, "", r.a(this.riS), r.b(this.riS));
      break label70;
      r.a(this.riS).field_likeFlag = 0;
      af.cnF().B(r.a(this.riS));
      am.a.Yd(r.a(this.riS).cqA());
      r.a(this.riS, af.cnF().kD(r.a(this.riS).field_snsId));
      break label95;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.r.1
 * JD-Core Version:    0.6.2
 */