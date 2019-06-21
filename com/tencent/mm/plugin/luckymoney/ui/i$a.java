package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class i$a
  implements i.b
{
  i$a(i parami)
  {
  }

  public final void a(i.c paramc, Context paramContext)
  {
    AppMethodBeat.i(43029);
    int i = paramContext.getResources().getColor(2131690226);
    int j = paramContext.getResources().getColor(2131690227);
    int k = paramContext.getResources().getColor(2131690241);
    paramc.kRR.setBackgroundResource(2131690597);
    paramc.kRR.setPadding(0, paramContext.getResources().getDimensionPixelOffset(2131427796), 0, paramContext.getResources().getDimensionPixelOffset(2131427796));
    paramc.niS.setTextColor(i);
    paramc.nSC.setTextColor(j);
    paramc.nSD.setTextColor(i);
    paramc.nSE.setTextColor(i);
    paramc.nSF.setTextColor(k);
    AppMethodBeat.o(43029);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.i.a
 * JD-Core Version:    0.6.2
 */