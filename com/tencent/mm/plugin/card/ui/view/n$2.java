package com.tencent.mm.plugin.card.ui.view;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.d.d;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.tm;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;

final class n$2
  implements View.OnClickListener
{
  n$2(n paramn, tm paramtm, com.tencent.mm.plugin.card.base.b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(88763);
    int i;
    int j;
    if ((!bo.isNullOrNil(this.kqV.vTM)) && (!bo.isNullOrNil(this.kqV.vTL)))
      if (this.kqU.jiE.getIntent() != null)
      {
        i = this.kqU.jiE.getIntent().getIntExtra("key_from_scene", 3);
        if (this.kqU.jiE.getIntent() == null)
          break label181;
        j = this.kqU.jiE.getIntent().getIntExtra("key_from_appbrand_type", 0);
        label91: com.tencent.mm.plugin.card.d.b.a(this.kqW.aZZ(), this.kqV, i, j);
        h.pYm.e(11941, new Object[] { Integer.valueOf(20), this.kqW.aZZ(), this.kqW.baa(), "", this.kqV.title });
        AppMethodBeat.o(88763);
      }
    while (true)
    {
      return;
      i = 3;
      break;
      label181: j = 0;
      break label91;
      if (!bo.isNullOrNil(this.kqV.url))
      {
        paramView = l.A(this.kqV.url, this.kqV.vUW);
        com.tencent.mm.plugin.card.d.b.a(this.kqU.jiE, paramView, 1);
        h localh = h.pYm;
        String str1 = this.kqW.aZZ();
        String str2 = this.kqW.baa();
        if (this.kqV.title != null);
        for (paramView = this.kqV.title; ; paramView = "")
        {
          localh.e(11941, new Object[] { Integer.valueOf(9), str1, str2, "", paramView });
          AppMethodBeat.o(88763);
          break;
        }
      }
      d.a(this.kqU.jiE, this.kqU.jiE.getString(2131298016), true);
      AppMethodBeat.o(88763);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.view.n.2
 * JD-Core Version:    0.6.2
 */