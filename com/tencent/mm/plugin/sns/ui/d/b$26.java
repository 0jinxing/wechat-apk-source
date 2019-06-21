package com.tencent.mm.plugin.sns.ui.d;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;

final class b$26
  implements View.OnClickListener
{
  b$26(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(40282);
    this.rKt.dK(paramView);
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof com.tencent.mm.plugin.sns.data.b)))
      AppMethodBeat.o(40282);
    com.tencent.mm.plugin.sns.data.b localb;
    while (true)
    {
      return;
      localb = (com.tencent.mm.plugin.sns.data.b)paramView.getTag();
      paramView = af.cnF().YT(localb.cwT);
      if (paramView != null)
        break;
      AppMethodBeat.o(40282);
    }
    int i;
    if (paramView.DI(32))
    {
      localb.qFI = System.currentTimeMillis();
      i = this.rKt.cvd;
      if (this.rKt.cvd != 0)
        break label132;
    }
    label132: for (int j = 1; ; j = 2)
    {
      i.a(new SnsAdClick(i, j, paramView.field_snsId, 20, 0));
      AppMethodBeat.o(40282);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b.26
 * JD-Core Version:    0.6.2
 */