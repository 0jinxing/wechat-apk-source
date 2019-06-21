package com.tencent.mm.plugin.card.ui.view;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.b.a.a.t;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.b.j.b;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.protocal.protobuf.tm;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;

final class h$2
  implements View.OnClickListener
{
  h$2(h paramh, com.tencent.mm.plugin.card.base.b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(88746);
    if (this.kqI.aZP())
    {
      paramView = new j.b();
      com.tencent.mm.plugin.card.d.b.a(this.kqJ.kqH.jiE, paramView.kbK, paramView.kbL, false, this.kqI);
    }
    while (true)
    {
      t.finish();
      AppMethodBeat.o(88746);
      return;
      tm localtm = this.kqI.aZV().vUA;
      if ((localtm != null) && (!bo.isNullOrNil(localtm.vTM)) && (!bo.isNullOrNil(localtm.vTL)))
      {
        int i;
        if (this.kqJ.jiE.getIntent() != null)
        {
          i = this.kqJ.jiE.getIntent().getIntExtra("key_from_scene", 3);
          label127: if (this.kqJ.jiE.getIntent() == null)
            break label240;
        }
        label240: for (int j = this.kqJ.jiE.getIntent().getIntExtra("key_from_appbrand_type", 0); ; j = 0)
        {
          com.tencent.mm.plugin.card.d.b.a(this.kqI.aZZ(), localtm, i, j);
          com.tencent.mm.plugin.report.service.h.pYm.e(11941, new Object[] { Integer.valueOf(20), this.kqI.aZZ(), this.kqI.baa(), "", localtm.title });
          break;
          i = 3;
          break label127;
        }
      }
      if ((localtm != null) && (!TextUtils.isEmpty(localtm.url)))
      {
        paramView = l.A(localtm.url, localtm.vUW);
        com.tencent.mm.plugin.card.d.b.a(this.kqJ.kqH.jiE, paramView, 1);
        com.tencent.mm.plugin.report.service.h.pYm.e(11941, new Object[] { Integer.valueOf(9), this.kqI.aZZ(), this.kqI.baa(), "", localtm.title });
        if (l.a(localtm, this.kqI.aZZ()))
        {
          l.Hs(this.kqI.aZZ());
          com.tencent.mm.plugin.card.d.b.b(this.kqJ.kqH.jiE, this.kqI.aZV().kdg);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.view.h.2
 * JD-Core Version:    0.6.2
 */