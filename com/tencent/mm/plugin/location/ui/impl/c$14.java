package com.tencent.mm.plugin.location.ui.impl;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageButton;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.k.b;
import com.tencent.mm.plugin.k.d;
import com.tencent.mm.plugin.location.ui.g;
import com.tencent.mm.sdk.platformtools.ab;

final class c$14
  implements AdapterView.OnItemClickListener
{
  c$14(c paramc)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(113609);
    ab.d("MicroMsg.MMPoiMapUI", "newpoi listview itemClick position %d", new Object[] { Integer.valueOf(paramInt) });
    double d1;
    double d2;
    if (!c.q(this.nQa))
    {
      if (paramInt >= c.o(this.nQa).getCount())
      {
        ab.i("MicroMsg.MMPoiMapUI", "wrong position");
        AppMethodBeat.o(113609);
        return;
      }
      paramView = c.o(this.nQa).xG(paramInt);
      if (paramView.type != 0)
        break label216;
      paramAdapterView = c.r(this.nQa);
      d1 = paramView.bDG;
      d2 = paramView.bDH;
      if (paramAdapterView.nLR)
        break label199;
      paramAdapterView.nLR = true;
      paramAdapterView.nMj.addPinView(paramAdapterView, d1, d2);
      label125: c.l(this.nQa).setBackgroundResource(2130839181);
    }
    while (true)
    {
      this.nQa.nMj.getIController().animateTo(paramView.bDG, paramView.bDH);
      c.o(this.nQa).llU = paramInt;
      c.o(this.nQa).notifyDataSetChanged();
      c.n(this.nQa);
      AppMethodBeat.o(113609);
      break;
      label199: paramAdapterView.nMj.updateLocaitonPinLayout(paramAdapterView, d1, d2);
      break label125;
      label216: c.r(this.nQa).remove();
      c.l(this.nQa).setEnabled(true);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.c.14
 * JD-Core Version:    0.6.2
 */