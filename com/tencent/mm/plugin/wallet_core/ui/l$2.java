package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.p;
import com.tencent.mm.plugin.wallet_core.model.p.a;
import com.tencent.mm.plugin.wallet_core.model.p.b;
import java.util.Vector;

final class l$2
  implements AdapterView.OnItemClickListener
{
  l$2(l paraml)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(47378);
    paramView = l.b(this.tHF);
    p localp = paramView.tHJ;
    if (paramInt < localp.tzD.size())
    {
      paramAdapterView = ((p.b)localp.tzD.get(paramInt)).tzL;
      p.a locala = p.a.tzH;
      for (int i = 0; i < localp.tzD.size(); i++)
        localp.a(i, p.a.tzI);
      switch (com.tencent.mm.plugin.wallet_core.model.p.1.tzF[paramAdapterView.ordinal()])
      {
      default:
      case 1:
      case 2:
      }
    }
    while (true)
    {
      paramView.notifyDataSetChanged();
      AppMethodBeat.o(47378);
      return;
      localp.a(paramInt, p.a.tzH);
      continue;
      localp.a(paramInt, p.a.tzI);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.l.2
 * JD-Core Version:    0.6.2
 */